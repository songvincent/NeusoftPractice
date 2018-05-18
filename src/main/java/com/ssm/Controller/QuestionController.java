package com.ssm.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Question;
import com.ssm.service.QuestionService;

@Controller

public class QuestionController {
	
	@RequestMapping("questionlist")
	public String Questionlist(Model model){
		
		QuestionService questionService = new QuestionService();
		List<Question> questionList=questionService.findquestions();
		
		model.addAttribute("questionList", questionList);
		
		return "questionlist";
	}
	
	@RequestMapping("deletequestion")
	public String deleteQuestion(HttpServletRequest request){
		String idstr=request.getParameter("id");
		int id=Integer.parseInt(idstr);
		
		QuestionService questionService = new QuestionService();
		questionService.deletequestion(id);
		return "deletequestionsuccess";
	}
	
	@RequestMapping("createquestion")
	public String createQuestion()
	{
		return "newquestion";
	}
	
	@RequestMapping("afternewquestion")
	public String insertquestion(HttpServletRequest request)
	{
		//questionid projectid qdescription finder priority status createdate solvedate solveperson
		
		String questionid=request.getParameter("questionid");
		String projectid=request.getParameter("projectid");
		String qde=request.getParameter("qdescription");
		String finder=request.getParameter("finder");
		
		String pri=request.getParameter("priority");
		int priority=Integer.parseInt(pri);
		
		String sta=request.getParameter("status");
		int status=Integer.parseInt(sta);
		
		String createdate=request.getParameter("createdate");
		String solvedate=request.getParameter("solvedate");
		String solveperson=request.getParameter("solveperson");
		
		
		QuestionService questionService = new QuestionService();
		Question question=new Question();
		
		question.setCreatedate(createdate);
		question.setFinder(finder);
		question.setId(15);
		question.setPriority(priority);
		question.setProjectid(projectid);
		question.setQdescription(qde);
		question.setQuestionid(questionid);
		question.setSolvedate(solvedate);
		question.setSolveperson(solveperson);
		question.setStatus(status);
		
		questionService.insertquestion(question);
		
		
		
		return "insertquessucess";
	}
	
	@RequestMapping("distribution")
	
	public String distribute(HttpServletRequest request,Model model)
	{
		String username=(String) request.getSession().getAttribute("username");
		QuestionService questionService=new QuestionService();
		List<Question> questionList=questionService.findques(username);
		//questionList
		model.addAttribute("questionList", questionList);
		return "partquestionlist";
	}
	
	
}
