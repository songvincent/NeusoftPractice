package com.ssm.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Project;
import com.ssm.pojo.User;
import com.ssm.service.ProjectService;
import com.ssm.service.UserService;

@Controller
//@RequestMapping("/S")
public class LoginController {
	
	@RequestMapping("login")
	public String login(HttpServletRequest request,Model model){
		
		String username=request.getParameter("username");
		String pwd=request.getParameter("password");
		UserService userService=new UserService();
		User user=userService.findpwd(username);
		
		request.getSession().setAttribute("username", username);
		
		if(pwd.equals(user.getUserPwd()))
		{
		//Projects
		ProjectService projectService = new ProjectService();
		List<Project> prolist=projectService.findProject();
		
		model.addAttribute("Projects", prolist);
		
		return "project";
		}
		else 
		{
			return "loginerror";
		}
		
	}
	
	@RequestMapping("loginn.action")
	public String loginn(HttpServletRequest request,Model model){
		
		ProjectService projectService = new ProjectService();
		List<Project> prolist=projectService.findProject();
		
		model.addAttribute("Projects", prolist);
		
		return "project";
	}

}
