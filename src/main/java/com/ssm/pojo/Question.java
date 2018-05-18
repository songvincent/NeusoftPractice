package com.ssm.pojo;

import java.io.Serializable;

public class Question implements Serializable {
	
	private int id;
	private String questionid;
	private String projectid;
	private String qdescription;
	private String finder;
	private int priority;//值越低，越紧急
	private int status;//0表示已解决，1表示未解决
	private String createdate;
	private String solvedate;
	private String solveperson;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionid() {
		return questionid;
	}
	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public String getQdescription() {
		return qdescription;
	}
	public void setQdescription(String qdescription) {
		this.qdescription = qdescription;
	}
	public String getFinder() {
		return finder;
	}
	public void setFinder(String finder) {
		this.finder = finder;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getSolvedate() {
		return solvedate;
	}
	public void setSolvedate(String solvedate) {
		this.solvedate = solvedate;
	}
	public String getSolveperson() {
		return solveperson;
	}
	public void setSolveperson(String solveperson) {
		this.solveperson = solveperson;
	}
	
	


}
