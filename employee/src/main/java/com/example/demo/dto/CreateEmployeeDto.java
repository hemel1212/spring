package com.example.demo.dto;

public class CreateEmployeeDto {

	private String name;
	private String designation;
	private int age;
	private String address;
	private int salary;

	public CreateEmployeeDto() {

	}

	public CreateEmployeeDto(String name, String designation, int age, String address, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
