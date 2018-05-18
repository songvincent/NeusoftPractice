package com.ssm.Mapper;

import java.util.List;

import com.ssm.pojo.Project;

public interface ProjectMapper {
	
	public void projectinsert(Project project);
	public List<Project> findProject();
	public void deleteProject(int id);
	public Project findone(int id);
	public void updateProject(Project project);
	//public void updateProject(String projectname,String pdescription,String person,int id);
	public void insertProject(Project project);

}
