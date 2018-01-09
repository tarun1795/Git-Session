package com.accolite.miniau;

import java.util.List;

public class HelloWorld {

	private String message;
	private List<Integer> intList;
	
	public List<Integer> getIntList() {
		return intList;
	}
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	public void born()
	{
		System.out.println("Object Born");
	}
	public void dead()
	{
		System.out.println("Object dead");
	}
	public String getMessage() {
		System.out.println(message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
