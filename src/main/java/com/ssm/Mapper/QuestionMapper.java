package com.ssm.Mapper;

import java.util.List;

import com.ssm.pojo.Question;

public interface QuestionMapper {
	
	public List<Question> findquestions();
	public void deletequestion(int id);
	public void insertquestion(Question question);
	public List<Question> findques(String username);

}
