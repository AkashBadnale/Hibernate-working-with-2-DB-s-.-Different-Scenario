package com.ab.hibernateWorkingWithTwoDB;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 *
 */
@Entity
public class Student 
{
	@Id
     private int id;
     private String name;
     private String surname;
     private int age;
	
     public Student() {
		super();
	}

     public Student(int id, String name, String surname, int age) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
   
	
}//Student

