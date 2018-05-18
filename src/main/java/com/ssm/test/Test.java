package com.ssm.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ssm.Mapper.ProjectMapper;
import com.ssm.pojo.Project;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		
		List<Project> projectList= new ArrayList<Project>();
		
        try {
            // CONFIG_LOCATION的值即为MyBatis配置文件的路径
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        try {
            // 获取mapper            
        	ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);
            // 调用mapper方法
        	/*if(null!=questionMapper.find("201754051"))
        	{
        		Student question = questionMapper.find("201754051");
                System.out.println(question.getPassword());
        	}
        	else 
        		System.out.println("账号错误");*/
        	//courseList=courseMapper.findCourse();
        	
        	projectList=projectMapper.findProject();
        	
        	Iterator it = projectList.iterator();
        	while(it.hasNext()) {
        	  System.out.println(((Project) it.next()).getKeyword());
        	}
        	
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		
		

	}

}
