package com.se.validator;

import java.util.ArrayList;
import java.util.List;

import com.se.form.EmployeeForm;

public class EmployeeValidator implements Validator {
List<String> errors=null;
EmployeeForm form=null;
	

	@Override
	public List<String> validate(Object form) {
		errors=new ArrayList<>();
	  EmployeeForm empForm= (EmployeeForm) form ;
	  
	  if (empForm.getEmpName() == null || empForm.getEmpName().trim().length() == 0) {
			errors.add("Name should not be null");
		}

		if (empForm.getMobileNo().length() == 0) {
			errors.add("Mobile number should not be empty");
		}

		if (empForm.getSalary().isEmpty() == true || Double.parseDouble(empForm.getSalary()) <= 0) {
			errors.add("Salary should not be empty or Zero");
		}


		return errors;
	}

}
