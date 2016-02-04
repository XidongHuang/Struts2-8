package com.tony.struts2.validation.app;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidationAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int age;
	
	private String password;
	private String password2;

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword2() {
		return password2;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("age: " + age);
		
		
		return SUCCESS;
	}
	
}