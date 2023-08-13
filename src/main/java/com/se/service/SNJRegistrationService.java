package com.se.service;

import com.se.dao.EmployeeDao;
import com.se.dao.ManagerDao;
import com.se.form.EmployeeForm;
import com.se.form.ManagerForm;
import com.se.pojo.Employee;
import com.se.pojo.Manager;

public class SNJRegistrationService {
 private EmployeeDao employeeDao=new EmployeeDao();
 private ManagerDao managerDao=new ManagerDao();
 
 public int registerNewEmployee(EmployeeForm employeeForm) {
	 try {
		 Employee employee=new Employee();
		System.out.println( "In service:"+employee.getEmpId());
		employeeForm.setEmpId(String.valueOf(employee.getEmpId()));
	//	 employee.setEmpId(Integer.parseInt(employeeForm.getEmpId()));
		 employee.setEmpName(employeeForm.getEmpName());
		 employee.setMobileNo(employeeForm.getMobileNo());
		 employee.setEmailId(employeeForm.getEmailId());
		 employee.setSalary(Integer.parseInt(employeeForm.getSalary()));
		
	return	employeeDao.newEmployeeRegister(employee);
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
	return 0;
 }
 
 public int registerNewManager(ManagerForm form) {
	 try {
		Manager manager=new Manager();
		manager.setManagerId(Integer.parseInt(form.getManagerId()));
		manager.setName(form.getName());
		manager.setMobileNo(form.getMobileNo());
		manager.setEmailId(form.getEmailId());
		manager.setSalary(Double.parseDouble(form.getSalary()));
		manager.setExperience(Integer.parseInt(form.getExperience()));
	return managerDao.registerNewManager(manager);
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
	return 0;
 }
}
