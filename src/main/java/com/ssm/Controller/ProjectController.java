package com.ssm.Controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Project;
import com.ssm.service.ProjectService;

@Controller
public class ProjectController {
	
	@RequestMapping("deleteproject")
	public String deleteProject(HttpServletRequest request){
		String id=request.getParameter("id");
		int idint=Integer.parseInt(id);
		
		ProjectService projectService = new ProjectService();
		projectService.deleteProject(idint);
		return "delesuccess";
		
	}
	
	@RequestMapping("findone")
	public String findone(HttpServletRequest request,Model model){
		
		String id=request.getParameter("id");
		int idint=Integer.parseInt(id);
		
		ProjectService projectService = new ProjectService();
		Project pro=projectService.findone(idint);
		model.addAttribute("project", pro);
		return "updateproject";
		
	}
	
	@RequestMapping("updateproject")
	public String updateProject(HttpServletRequest request) throws UnsupportedEncodingException
	{
		Project project=new Project();
		String id=request.getParameter("id");
		String projectna=request.getParameter("projectname");
		//String projectname=new String(projectna,"utf-8");
		//String projectname=URLEncoder.encode(projectna, "UTF-8");
		
		byte[] utf8Bytes = projectna.getBytes("iso-8859-1"); 
		String projectname = new String(utf8Bytes, "utf-8");
		
		String pDescripti=request.getParameter("description");
		
		byte[] utf8Bytes2 = pDescripti.getBytes("iso-8859-1"); 
		String pDescription = new String(utf8Bytes2, "utf-8");
		//String prodes=URLEncoder.encode(pDescription, "UTF-8");
		
		String pperson=request.getParameter("person");
		byte[] utf8Bytes3 = pperson.getBytes("iso-8859-1"); 
		String person = new String(utf8Bytes3, "utf-8");
		
		//String pperson=URLEncoder.encode(person, "UTF-8");
		
		int idint=Integer.parseInt(id);
		ProjectService projectService = new ProjectService();
		//String projectname,String pDescription,String person,int id
		
		project.setId(idint);
		project.setpDescription(pDescription);
		project.setPerson(person);
		project.setProjectName(projectname);
		
		projectService.updateProject(project);
		return "updateprosucess";
		
	}
	
	@RequestMapping("createproject")
	public String preinsertProject(){
		
		return "createproject";
	}
	
	@RequestMapping("createprojectsucces")
	public String insertProject(HttpServletRequest request) throws UnsupportedEncodingException{
		
		String p1=request.getParameter("projectid");
		byte[] utf8Bytes1 = p1.getBytes("iso-8859-1"); 
		String projectid = new String(utf8Bytes1, "utf-8");
		
		String p2=request.getParameter("keyword");
		byte[] utf8Bytes2 = p2.getBytes("iso-8859-1"); 
		String keyword = new String(utf8Bytes2, "utf-8");
		
		String p3=request.getParameter("projectname");
		byte[] utf8Bytes3 = p3.getBytes("iso-8859-1"); 
		String projectname = new String(utf8Bytes3, "utf-8");
		
		String p4=request.getParameter("pdescription");
		byte[] utf8Bytes4 = p4.getBytes("iso-8859-1"); 
		String pdescription = new String(utf8Bytes4, "utf-8");
		
		String p5=request.getParameter("createdate");
		byte[] utf8Bytes5 = p5.getBytes("iso-8859-1"); 
		String createdate = new String(utf8Bytes5, "utf-8");
		
		String p6=request.getParameter("person");
		byte[] utf8Bytes6 = p6.getBytes("iso-8859-1"); 
		String person = new String(utf8Bytes6, "utf-8");
		
		Project project=new Project();
		project.setId(16);
		project.setProjectId(projectid);
		project.setKeyword(keyword);
		project.setProjectName(projectname);
		project.setpDescription(pdescription);
		project.setCreateDate(createdate);
		project.setPerson(person);
		
		ProjectService projectservice=new ProjectService();
		projectservice.insertProject(project);
		
		return "createprojectsucces";
	}
	
}
