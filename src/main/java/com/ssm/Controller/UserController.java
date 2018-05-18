package com.ssm.Controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;

import com.ssm.pojo.User;
import com.ssm.service.ProjectService;
import com.ssm.service.UserService;

@Controller
public class UserController {
	
	@RequestMapping("usermanage")
	public String manage(Model model){
		UserService userService = new UserService();
		List<User> userList=userService.findusers();
		model.addAttribute("Users", userList);
		return "UserList";
		
	}
	
	@RequestMapping("finduser")
	public String finduser()
	{
		return "condition";
	}
	
	
	
	@RequestMapping("afterfinduser")
	public String findauser(HttpServletRequest request,Model model){
		String username=request.getParameter("username");
		UserService userService = new UserService();
		User user=userService.findpwd(username);
		
		model.addAttribute("us", username);		
		return "finduserres";
	}
	
	
	@RequestMapping("createuser")
	public String createUser()
	{
		return "newuser";
	}
	
	@RequestMapping("createusersucces")
	public void sucess(HttpServletRequest request){
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String realname=request.getParameter("realname");
		String permission=request.getParameter("permission");
		String useremail=request.getParameter("useremail");
		
		User user=new User();
		user.setEmail(useremail);
		user.setId(3);
		user.setRealName(realname);
		//user.setRoleid(1);
		user.setUserPwd(password);
		user.setUserName(username);
		//user.setUserPwd(userPwd); user.setRoleid(1);
		
		if(permission=="volvo") user.setRoleid(1);
		else user.setRoleid(2);
		
		UserService userService=new UserService();
		userService.insert(user);
		
		
		
	}
	
	@RequestMapping("updateuser")
	public String updateUser(HttpServletRequest request,Model model){
		
		String idstr=request.getParameter("id");
		int idint=Integer.parseInt(idstr);
		
		UserService userService=new UserService();
		User user=userService.findOne(idint);
		model.addAttribute("user", user);
		return "updateuser";
	}

	@RequestMapping("afterupdate")
	public String updatecommit(HttpServletRequest request) throws UnsupportedEncodingException
	{
		String id=request.getParameter("id");
		int idint=Integer.parseInt(id);
		
		String usernametmp=request.getParameter("username");
		byte[] utf8Bytes1 = usernametmp.getBytes("iso-8859-1"); 
		String username = new String(utf8Bytes1, "utf-8");
		
		String passwordtmp=request.getParameter("password");
		byte[] utf8Bytes2 = passwordtmp.getBytes("iso-8859-1"); 
		String password = new String(utf8Bytes2, "utf-8");
		
		String realnametmp=request.getParameter("realname");
		byte[] utf8Bytes3 = realnametmp.getBytes("iso-8859-1"); 
		String realname = new String(utf8Bytes3, "utf-8");
		
		String emailtmp=request.getParameter("useremail");
		byte[] utf8Bytes4 = emailtmp.getBytes("iso-8859-1"); 
		String email = new String(utf8Bytes4, "utf-8");
		
		User user=new User();
		
		user.setEmail(email);
		user.setId(idint);
		user.setRealName(realname);
		user.setUserPwd(password);
		user.setUserName(username);
		
		UserService userService=new UserService();
		userService.updateUser(user);
		
		return "updateusersucess";
		
	}
	
	///Sheng/deleteuser.action
	@RequestMapping("deleteuser")
	public String deleteUser(HttpServletRequest request)
	{
		String idstr=request.getParameter("id");
		int idint=Integer.parseInt(idstr);
		
		UserService userService = new UserService();
		userService.deleteUser(idint);
		return "deleteUsersucess";
	}
	
	
}
