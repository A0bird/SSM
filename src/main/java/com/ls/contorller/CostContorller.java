package com.ls.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ls.service.ICostService;
import com.ls.vo.Cost;

@Controller
@RequestMapping("/cost/")
public class CostContorller {
	
	@Autowired
	private ICostService costService;
	
	@RequestMapping("list.do")
	public String list(Cost cost, Model model) {
		if(cost==null) {
			cost=new Cost();
		}
		cost.setCostMark("0");
		List<Cost> list=costService.list(cost);
		model.addAttribute("list",list);
		return "cost/cost_list";
	}
	@RequestMapping("loadadd.do")
	public String loadadd() {
		
		return "cost/cost_add";
	}
	
	@RequestMapping("add.do")
	public String add(Cost cost,Model model) {
		if(cost==null) {
			cost=new Cost();
		}
		cost.setCostMark("0");
		costService.add(cost);
		return list(cost,model);
	}
	@RequestMapping("loadupdate.do")
	public String loadupdate(Cost cost,Model model) {
		
		
		Cost costs=costService.findById(cost.getCostId());
		model.addAttribute("cost",costs);
		return "cost/cost_update";
	}
	
	@RequestMapping("update.do")
	public String update(Cost cost, Model model) {
		
		costService.update(cost);
		
		return list( cost, model);
	}
	@RequestMapping("delete.do")
	public String delete(Integer[] costId, Model model) {
		
		
		costService.delete(costId);
		
		return list(null, model);
	}
}
