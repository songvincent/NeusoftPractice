package com.ssm.service;

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

public class ProjectService implements ProjectMapper  {

	public void projectinsert(Project project) {
		// TODO Auto-generated method stub
		
	}

	
//查出所有项目
	public List<Project> findProject() {
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
            
        	projectList=projectMapper.findProject();
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		return projectList;
		
	}

//删除指定项目
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		
		InputStream inputStream = null;
		
		
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
            
        	projectMapper.deleteProject(id);
        	
        	sqlSession.commit();
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }	
		
	}


	
//找到某一项目
	public Project findone(int id) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		Project project=new Project();
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {      
        	ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);          
        	project=projectMapper.findone(id);
        	//sqlSession.commit();
        } finally {
            sqlSession.close();
        }
		return project;	
	}

//修改项目
	public void updateProject(Project project) {
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
        	ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);          
        	projectMapper.updateProject(project);
        	//projectMapper.updateProject(projectname,pdescription,person,id);
        	sqlSession.commit();
        } finally {
            sqlSession.close();
        }
		
	}

//添加项目

	public void insertProject(Project project) {
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
        	ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);          
        	projectMapper.insertProject(project);
      
        	sqlSession.commit();
        } finally {
            sqlSession.close();
        }
		
	}
	
}
	
	


