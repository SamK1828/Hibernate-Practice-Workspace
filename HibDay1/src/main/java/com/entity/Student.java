package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BatchStudentInfo")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sName;
	@Column(name = "Address")
	private String city;
	private int age;
	private String collegeName;

	public Student() {

	}

	public Student(String sName, int sid, String city, int age, String collegeName) {
		super();
		this.sName = sName;
		this.sid = sid;
		this.city = city;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", city=" + city + ", age=" + age + ", collegeName="
				+ collegeName + "]";
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
