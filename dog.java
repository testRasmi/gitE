package com.gitYo;

public class dog {
	
	int dogAge;
	public dog (String name) {
		System.out.println("your dog name is "+name);	
	}
	
	public void setAge(int age) {
		dogAge= age;
	}
	
	public int getAge() {
		System.out.println("your dog is "+dogAge);
		return dogAge;
	}
	
	

}
