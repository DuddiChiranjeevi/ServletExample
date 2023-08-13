package com.se.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.se.common.CommonRequestService;
import com.se.form.EmployeeForm;
import com.se.service.SNJRegistrationService;

public class NewEmployeeServlet extends HttpServlet {

	private SNJRegistrationService snjRegistrationService = new SNJRegistrationService();
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		EmployeeForm empForm = null;
//		RequestWrapper wrapper = null;
//
//	//	List<String> errors = null;

		try {
//			empForm = new EmployeeForm();
//			wrapper = new RequestWrapper();
//			//errors = new ArrayList<>();
//
//			empForm = (EmployeeForm) wrapper.wrap(req, "com.se.form.EmployeeForm");
//			

//			if (empForm.getEmpName() == null || empForm.getEmpName().trim().length() == 0) {
//				req.setAttribute("error", "Employee name should not be null");
//				RequestDispatcher rd = req.getRequestDispatcher("/register-employee.jsp");
//				rd.forward(req, resp);
//			}
//
//			if (empForm.getMobileNo().length()==0) {
//				req.setAttribute("error", "mobile no should not be empty");
//				RequestDispatcher rd = req.getRequestDispatcher("/register-employee.jsp");
//				rd.forward(req, resp);
//			}
//			
//			if(empForm.getSalary().isEmpty()==true||Double.parseDouble(empForm.getSalary()) <=0) {
//				req.setAttribute("error", "salary should not be zero");
//				RequestDispatcher rd = req.getRequestDispatcher("/register-employee.jsp");
//				rd.forward(req, resp);
//			}

//			if (empForm.getEmpName() == null || empForm.getEmpName().trim().length() == 0) {
//				errors.add("Name should not be null");
//			}
//
//			if (empForm.getMobileNo().length() == 0) {
//				errors.add("Mobile number should not be empty");
//			}
//
//			if (empForm.getSalary().isEmpty() == true || Double.parseDouble(empForm.getSalary()) <= 0) {
//				errors.add("Salary should not be empty or Zero");
//			}
			
//			Validator validator=new EmployeeValidator();
//		    List<String> errors	=validator.validate(empForm);
//
//			snjRegistrationService.registerNewEmployee(empForm);
//			if (errors.size() > 0) {
//				req.setAttribute("errors", errors);
//				req.setAttribute("empForm", empForm);
//				RequestDispatcher rd = req.getRequestDispatcher("/register-employee.jsp");
//				rd.forward(req, resp);
//				return;
//			}
			CommonRequestService commonRequestService=new CommonRequestService();
			Object empForm=	commonRequestService.apply(req, resp, "com.se.form.EmployeeForm","com.se.validator.EmployeeValidator","/register-employee.jsp");
			if(empForm == null) {
				return;
			}
			snjRegistrationService.registerNewEmployee((EmployeeForm) empForm);
			req.setAttribute("message", "Records inserted with Id : " + ((EmployeeForm) empForm).getEmpId());
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/success.jsp");
			rd.forward(req, resp);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

