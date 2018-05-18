package com.ssm.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ssm.Mapper.QuestionMapper;
import com.ssm.pojo.Question;

public class QuestionService implements QuestionMapper {

	public List<Question> findquestions() {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		
		List<Question> questionList= new ArrayList<Question>();
		
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        try {
            // 获取mapper            
        	QuestionMapper questionMapper = sqlSession.getMapper(QuestionMapper.class);  
        	questionList=questionMapper.findquestions();
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		//return projectList;
        return questionList;
		//return null;
	}

	public void deletequestion(int id) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;		
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();     
        try {
            // 获取mapper            
        	QuestionMapper questionMapper = sqlSession.getMapper(QuestionMapper.class);  
        	questionMapper.deletequestion(id);
        	sqlSession.commit();
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		
		
		
		
	}

	public void insertquestion(Question question) {
		// TODO Auto-generated method stub
		
		InputStream inputStream = null;		
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();     
        try {
            // 获取mapper            
        	QuestionMapper questionMapper = sqlSession.getMapper(QuestionMapper.class);  
        	//questionMapper.deletequestion(id);
        	questionMapper.insertquestion(question);
        	sqlSession.commit();
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		
	}


	public List<Question> findques(String username) {
		InputStream inputStream = null;
		List<Question> questionList= new ArrayList<Question>();
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        try {
            // 获取mapper            
        	QuestionMapper questionMapper = sqlSession.getMapper(QuestionMapper.class);  
        	questionList=questionMapper.findques(username);
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		//return projectList;
        return questionList;
	}

}
