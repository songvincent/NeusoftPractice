package com.ssm.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Item;
import com.ssm.service.ItemService;

@Controller

public class ItemController {
	
	@RequestMapping("itemlist")
	public String finditems(Model model)
	{
		ItemService itemService=new ItemService();
		List<Item> itemList=itemService.findAll();
		
		model.addAttribute("itemList", itemList);
		return "itemlist";
	}
	
	@RequestMapping("deleteitem")
	public String deleteitem(HttpServletRequest request){
		String idstr=request.getParameter("id");
		int id=Integer.parseInt(idstr);
		
		ItemService itemService=new ItemService();
		itemService.deleteitem(id);
		return "deleteitemsucess";
	}
	
	@RequestMapping("updateitem")
	public String updateitem(HttpServletRequest request,Model model){
		String tranid=request.getParameter("id");
		model.addAttribute("tranid", tranid);
		return "updateitem";
	}
	
	//@RequestMapping("afterupdate")
	

}
