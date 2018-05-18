package com.ssm.test;


import java.util.Iterator;
import java.util.List;

import com.ssm.pojo.Item;
import com.ssm.pojo.Project;
import com.ssm.pojo.Question;
import com.ssm.pojo.User;
import com.ssm.service.ItemService;
import com.ssm.service.ProjectService;
import com.ssm.service.QuestionService;
import com.ssm.service.UserService;

public class Testtwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ProjectService projectService = new ProjectService();
		/*List<Project> prolist=projectService.findProject();
		
		Iterator it = prolist.iterator();
    	while(it.hasNext()) {
    	  System.out.println(((Project) it.next()).getKeyword());
    	}*/
		//projectService.deleteProject(1);
		//Project pro=projectService.findone(2);
		//System.out.println(pro.getKeyword());
		//projectService.updateProject("测试id", "测试", "song", 1);
		/*Project project=new Project();
		project.setId(8);
		project.setProjectId("456");
		project.setKeyword("test");
		project.setProjectName("测试用名");
		project.setpDescription("测试描述");
		project.setCreateDate("2017-12-30");
		project.setPerson("person");
		
		projectService.insertProject(project);*/
		
		//user检测
		/*UserService userService=new UserService();
		User user=userService.findpwd("tom");
		System.out.println(user.getUserPwd());
		if(user.getUserPwd().equals("123"))
		{
			System.out.println("相等");
		}
		else
			System.out.println("不等");*/
		
		/*List<User> userList=userService.findusers();
		
		Iterator it = userList.iterator();
    	while(it.hasNext()) {
    	  System.out.println((it.next()));
    	}*/
		/*User user=new User();
		user.setEmail("tom@163.com");
		user.setId(3);
		user.setRealName("tomtom");
		user.setRoleid(1);
		user.setUserPwd("123456");
		user.setUserName("tomstark");
		//user.setUserPwd(userPwd);
		userService.insert(user);*/
		
		//Question检测
		/*QuestionService questionService = new QuestionService();
		/*List<Question> questionList=questionService.findquestions();
		
		Iterator it = questionList.iterator();
    	while(it.hasNext()) {
    	  System.out.println((it.next()));
    	}*/
		//questionService.deletequestion(1);
		/*Question question=new Question();
		question.setCreatedate("2018-05-09");
		question.setFinder("finder");
		question.setId(15);
		question.setPriority(5);
		question.setProjectid("20180518");
		question.setQdescription("test of description");
		question.setQuestionid("0518");
		question.setSolvedate("2018-05-19");
		question.setSolveperson("wen");
		question.setStatus(0);
		
		questionService.insertquestion(question);*/
		
		//item检测
		
		
		
		//ItemService itemService=new ItemService();
		/*List<Item> itemList=itemService.findAll();
		
		Iterator it = itemList.iterator();
    	while(it.hasNext()) {
    	  System.out.println(((Item) (it.next())).getFunction());
    	}*/
		
		//itemService.deleteitem(1);
		
		QuestionService questionService=new QuestionService();
		List<Question> questionList=questionService.findques("song");
		
		Iterator it = questionList.iterator();
    	while(it.hasNext()) {
    	  System.out.println((( it.next())));
    	}
		

	}

}
