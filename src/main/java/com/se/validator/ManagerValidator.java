package com.se.validator;

import java.util.ArrayList;
import java.util.List;

import com.se.form.ManagerForm;

public class ManagerValidator implements Validator {
	List<String> errors = null;

	@Override
	public List<String> validate(Object form) {
		errors = new ArrayList<>();
		ManagerForm managerForm = (ManagerForm) form;
		
		if ( managerForm.getManagerId().isEmpty() == true
				|| Integer.parseInt(managerForm.getManagerId()) <= 0) {
			errors.add("Mananger Id should not be null");
		}

		if (managerForm.getName() == null || managerForm.getName().trim().length() == 0) {
			errors.add("Manager name should not be null");
		}

		if (managerForm.getMobileNo().length() == 0) {
			errors.add("Mobile no should not be empty");
		}

		if (managerForm.getSalary().isEmpty() == true || Double.parseDouble(managerForm.getSalary()) <= 0) {
			errors.add("Salary should not be zero");

		}
		if ( managerForm.getExperience().isEmpty() == true
				|| Integer.parseInt(managerForm.getExperience()) <= 0) {
			errors.add("Expearienceshouls not be zero");
		}

		return errors;
	}

}
