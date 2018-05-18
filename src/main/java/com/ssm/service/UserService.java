package com.ssm.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ssm.Mapper.UserMapper;
import com.ssm.pojo.User;

public class UserService implements UserMapper {

	public List<User> findusers() {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		
		List<User> userList= new ArrayList<User>();
		
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        try {
            // 获取mapper            
        	UserMapper projectMapper = sqlSession.getMapper(UserMapper.class);
            
        	userList=projectMapper.findusers();
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		//return projectList;
		return userList;
	}

	public void deleteUser(int id) {
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
        	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            
        	userMapper.deleteUser(id);
        	sqlSession.commit();
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }		
	}

	public void updateUser(User user) {
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
        	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            
        	userMapper.updateUser(user);
        	sqlSession.commit();
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }	
		
	}

	
	public User findOne(int id) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		User user=new User();
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        try {
            // 获取mapper            
        	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        	user=userMapper.findOne(id);	       	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }	
		return user;
	}

	
	
	public void insert(User user) {
		// TODO Auto-generated method stub
		
		InputStream inputStream = null;
		//User user=new User();
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        try {
            // 获取mapper            
        	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        	userMapper.insert(user);   	
        	sqlSession.commit();
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }	
		
	}

	//为了寻找密码查询
	public User findpwd(String username) {
		// TODO Auto-generated method stub
		InputStream inputStream = null;
		User user=new User();
        try {
            inputStream = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        
        try {
            // 获取mapper            
        	UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        	user=userMapper.findpwd(username);       	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }	
		return user;
		
	}
	

	
	
	

}
