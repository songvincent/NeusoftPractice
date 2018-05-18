package com.ssm.Mapper;

import java.util.List;

import com.ssm.pojo.Item;

public interface ItemMapper {
	
	public List<Item> findAll();
	public void deleteitem(int id);

}
