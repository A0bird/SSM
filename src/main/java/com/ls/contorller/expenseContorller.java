package com.ls.contorller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ls.service.ICostService;
import com.ls.service.IExpenseService;
import com.ls.service.IUserService;
import com.ls.vo.Audit;
import com.ls.vo.Comm;
import com.ls.vo.Cost;
import com.ls.vo.ExpenseAccount;
import com.ls.vo.ExpenseDetails;
import com.ls.vo.User;

@Controller

@RequestMapping("/expense/")
public class expenseContorller {
		
	@Autowired 
	private IExpenseService expenseService;
	
	@Autowired
	private ICostService costService;
	@RequestMapping("loadadd.do")
	public String loadadd(Cost cost,Model model) {
		if(cost==null) {
			cost=new Cost();
		}
		cost.setCostMark("0");
		List<Cost> list=costService.list(cost);
		model.addAttribute("list",list);
		return "expense/expense_add";
	}
	
	@RequestMapping("add.do")
	public String add(HttpSession session,ExpenseAccount ea,Integer[] costId,Double[] expenseDetailsAmount,Model model) {
		
		User userinfo=(User) session.getAttribute("user");
		System.out.println(userinfo);
		if(userinfo!=null) {
			ea.setUserId(userinfo.getUserId());
			ea.setExpenseState(Comm.EXPENSE_ONE);	
		}
		expenseService.add(ea,costId,expenseDetailsAmount);
		
		return loadadd(null,model);
	}
	
	/**
	 * 时间属性编辑器
	 * @param bin
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder bin) {
		
		bin.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	
	
	//报销查询（查询所有报销的）
	@RequestMapping("list.do")
	public String listAll(ExpenseAccount ea,Model model) {
		
		List<ExpenseAccount> list=expenseService.list(ea);
		model.addAttribute("list",list);
		return "expense/expense_list";
	}
	//选中一个进行详细查询
	@RequestMapping("show.do")
	public String listone(ExpenseAccount ea,Model model,HttpSession session) {
		
		
		ExpenseAccount eas=expenseService.findone(ea.getExpenseId());
		model.addAttribute("eas",eas);
		List<ExpenseDetails> eds=expenseService.findsone(ea.getExpenseId());
		model.addAttribute("eds",eds);
		List<Audit>  list=expenseService.findme(ea.getExpenseId());
		
		model.addAttribute("list",list);
		return "expense/expense_show";
	}
	
	
	//经理审核，审核状态为expense_state=1
	@RequestMapping("loadAuditManager.do")
	public String audit(ExpenseAccount ea,Model model) {
		
		ea.setExpenseState("1");
		List<ExpenseAccount> lists=expenseService.finds(ea);
		//System.out.println(lists);
		model.addAttribute("list",lists);
		return "expense/expense_audit_manager";
	}
	//部门经理的进入审核某个详细的报销单中查看
	@RequestMapping("loadManager.do")
	public String loadmanager(ExpenseAccount ea,Model model) {
		//System.out.println(ea);
		ExpenseAccount eas=expenseService.findone(ea.getExpenseId());
		model.addAttribute("eas",eas);
		List<ExpenseDetails> eds=expenseService.findsone(ea.getExpenseId());
		model.addAttribute("eds",eds);
		return "expense/expense_manager";
	}
	
	//经理审核的结果提交到数据库中
	@RequestMapping("manager.do")
	public String manager(ExpenseAccount ea,Model model,HttpSession session,Audit audit) {
		User userinfo=(User) session.getAttribute("user");
		audit.setUserId(userinfo.getUserId());
		audit.setExpenseId(ea.getExpenseId());
		audit.setAuditName(userinfo.getUserName());
		Date day=new Date();    
		
		audit.setAuditTime(day);
		System.out.println(audit);
		expenseService.addAudit(audit);
		expenseService.update(audit);
		return audit(ea,model);
	
	}
	
	
	//财务经理进行审核（查看所有）审核状态为expense_state=2
	@RequestMapping("loadAuditFinance.do")
	public String loadaudits(ExpenseAccount ea,Model model) {
		
		ea.setExpenseState("2");
		List<ExpenseAccount> lists=expenseService.finds(ea);
		model.addAttribute("list",lists);
		return "expense/expense_audit_finance";
	}
	//查看某个的详细信息
	@RequestMapping("loadFinance.do")
	public String audits(ExpenseAccount ea,Model model) {
		ExpenseAccount eas=expenseService.findone(ea.getExpenseId());
		model.addAttribute("eas",eas);
		List<ExpenseDetails> eds=expenseService.findsone(ea.getExpenseId());
		model.addAttribute("eds",eds);
		return "expense/expense_finance";
	}
	//财务经理是更新数据库audit_history中的表的审核状态expense_state
	@RequestMapping("finance.do")
	public String finance(ExpenseAccount ea,Model model,HttpSession session,Audit audit) {
		User userinfo=(User) session.getAttribute("user");
		audit.setUserId(userinfo.getUserId());
		audit.setExpenseId(ea.getExpenseId());
		audit.setAuditName(userinfo.getUserName());
		Date day=new Date();    
		
		audit.setAuditTime(day);
		expenseService.addAudit(audit);
		expenseService.update(audit);
		return loadaudits(ea,model);
	}
	
	
	//我的报销
	
	@RequestMapping("mylist.do")
	public String  mylist(ExpenseAccount ea,Model model,HttpSession session) {
		User userinfo=(User) session.getAttribute("user");
		List<ExpenseAccount> list=expenseService.findMy(userinfo.getUserId());
		model.addAttribute("list",list);
		return "expense/expense_mylist";
	}
	//查看明细
	@RequestMapping("myshow.do")
	public String myshow(ExpenseAccount ea,Model model,HttpSession session) {
		
		ExpenseAccount eas=expenseService.findone(ea.getExpenseId());
		model.addAttribute("eas",eas);
		List<ExpenseDetails> eds=expenseService.findsone(ea.getExpenseId());
		model.addAttribute("eds",eds);
		
		List<Audit>  list=expenseService.findme(ea.getExpenseId());
		model.addAttribute("list",list);
		return "expense/expense_myshow";
	}
	
	//我的审核
	
	@RequestMapping("myauditlist.do")
	public String myauditlist(HttpSession session,ExpenseAccount ea,Model model) {
		User userinfo=(User) session.getAttribute("user");
		List<ExpenseAccount> lists=expenseService.findMyself(userinfo.getUserName());
		model.addAttribute("list",lists);	
		return "expense/expense_myauditlist";
	}
	@RequestMapping("loadupdate.do")
	public String loadupdate(ExpenseAccount ea,Model model,Cost cost) {
		ExpenseAccount eas=expenseService.findone(ea.getExpenseId());
		model.addAttribute("exp",eas);
		List<ExpenseDetails> eds=expenseService.findsone(ea.getExpenseId());
		model.addAttribute("list",eds);
		if(cost==null) {
			cost=new Cost();
		}
		cost.setCostMark("0");
		List<Cost> list=costService.list(cost);
		model.addAttribute("costlist",list);
		return  "expense/expense_update";
	}
	//修改报销表
	@RequestMapping("update.do")
	public String update(HttpSession session,ExpenseAccount ea,Integer[] costId,Double[] expenseDetailsAmount,Model model) {
		User userinfo=(User) session.getAttribute("user");
		System.out.println(userinfo);
		if(userinfo!=null) {
			ea.setUserId(userinfo.getUserId());
			ea.setExpenseState(Comm.EXPENSE_ONE);	
		}
		expenseService.updates(ea,costId,expenseDetailsAmount);
		return null;
	} 
	

}
