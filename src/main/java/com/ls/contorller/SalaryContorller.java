package com.ls.contorller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ls.dao.ISalaryDao;
import com.ls.service.IUserService;
import com.ls.vo.Salary;
import com.ls.vo.User;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

@Controller
@RequestMapping("/salary/")
public class SalaryContorller {

	@Autowired
	private IUserService userService;
	
	@Autowired 
	private ISalaryDao salaryService;
	
	@RequestMapping("loadadd.do")
	public String loadadd(User user,Model model) {
		
		user.setUserMark("0");
		List<User> users=userService.list(user);
		//System.out.println(users);
		model.addAttribute("users",users);
		
		return "salary/salary_add";
	}
	
	@RequestMapping("add.do")
	public String add(Salary salary,Model model) {
		
		
		salaryService.add(salary);
		
		
		return list(salary,model);
	}
	@RequestMapping("list.do")
	public String list(Salary salary,Model model) {
		
		List<Salary> list=salaryService.list(salary);
		model.addAttribute("list",list);
		return "salary/salary_list";
	}
	@RequestMapping("find.do")
	public String find(Salary salary,Model model) {
		List<Salary> lists=salaryService.find(salary);
		model.addAttribute("list",lists);
		return "salary/salary_list";
	}
	@RequestMapping("put.do")
	public void show(Salary salary) throws Exception {
		File salarys=new File("E://salary.xls");
		
		salarys.createNewFile();
		
		WritableWorkbook workbook=Workbook.createWorkbook(salarys);
		
		WritableSheet sheet=workbook.createSheet("sheet1", 0);
		
		Label lable=null;
		String[] title= {"编号","姓名","工资发放时间","工资"};
		
		for(int i=0;i<title.length;i++) {
			
			lable=new Label(i,0,title[i]);
			
			sheet.addCell(lable);
		}
		
		List<Salary> list=salaryService.list(salary);
		for(int i=0;i<list.size();i++) {

			lable=new Label(0,i+1,list.get(i).getPaymentId());
			
			sheet.addCell(lable);
			
			lable=new Label(1,i+1,list.get(i).getUserName());
			
			sheet.addCell(lable);
			
			lable=new Label(2,i+1,list.get(i).getPaymentTime());
			sheet.addCell(lable);
			
			 lable=new Label(3,i+1,list.get(i).getPaymentMoney());
			sheet.addCell(lable);
		}
		workbook.write();
		workbook.close();	
	}
}
