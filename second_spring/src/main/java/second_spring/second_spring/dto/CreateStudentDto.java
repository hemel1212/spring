package second_spring.second_spring.dto;

import java.time.LocalDate;

public class CreateStudentDto {

	private String name;
	private String clazz;
	private int age;
	private String address;
	private LocalDate dob;

	public CreateStudentDto() {

	}

	public CreateStudentDto(String name, String clazz, int age, String address, LocalDate dob) {
		super();
		this.name = name;
		this.clazz = clazz;
		this.age = age;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
