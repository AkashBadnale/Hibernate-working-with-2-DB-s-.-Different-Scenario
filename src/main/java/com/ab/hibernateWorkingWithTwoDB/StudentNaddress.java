package com.ab.hibernateWorkingWithTwoDB;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentNaddress {

	@Id
    private int id;
    private String name;
    private String surname;
    private int age;
    
    private  String  streetName;
    private  String  areaName;
    private int pinCode;
    private  String  villageName;
    private  String   districtName;
    private  String  stateName;
    private String  countryName;
	
    public StudentNaddress() {
		super();
	}

	public StudentNaddress(int id, String name, String surname, int age,  String streetName,
			String areaName, int pinCode, String villageName, String districtName, String stateName,
			String countryName) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		
		this.streetName = streetName;
		this.areaName = areaName;
		this.pinCode = pinCode;
		this.villageName = villageName;
		this.districtName = districtName;
		this.stateName = stateName;
		this.countryName = countryName;
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

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "StudentNaddress [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age +  ", streetName=" + streetName + ", areaName=" + areaName + ", pinCode=" + pinCode
				+ ", villageName=" + villageName + ", districtName=" + districtName + ", stateName=" + stateName
				+ ", countryName=" + countryName + "]";
	}
    
    
}//StudentNaddress
