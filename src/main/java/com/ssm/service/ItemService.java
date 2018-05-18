package com.ssm.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ssm.Mapper.ItemMapper;
import com.ssm.pojo.Item;


public class ItemService implements ItemMapper {

	public List<Item> findAll() {
		InputStream inputStream = null;
		
		List<Item> itemList= new ArrayList<Item>();
		
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
        	ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
            
        	itemList=itemMapper.findAll();
        	
        	
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		return itemList;
	}

	public void deleteitem(int id) {
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
        	ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);            
        	itemMapper.deleteitem(id); 
        	
        	sqlSession.commit();
        } finally {
            // 最后一定关闭SqlSession
            sqlSession.close();
        }
		
		
	}

}
