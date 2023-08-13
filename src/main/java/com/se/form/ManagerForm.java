package com.se.form;

public class ManagerForm {

	private String managerId;
	private String name;
	private String mobileNo;
	private String emailId;
	private String salary;
	private String experience;
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "ManagerForm [managerId=" + managerId + ", name=" + name + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", salary=" + salary + ", experience=" + experience + "]";
	}
	
	
}
