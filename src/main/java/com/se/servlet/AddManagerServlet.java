package com.se.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.se.common.CommonRequestService;
import com.se.form.ManagerForm;
import com.se.service.SNJRegistrationService;

public class AddManagerServlet  extends HttpServlet{
	private SNJRegistrationService snjRegistrationService =new SNJRegistrationService();

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ManagerForm managerForm=null;
//		RequestWrapper requestWrapper=null;
//		//List<String> errors=null;
		
		try {
//			managerForm=new ManagerForm();
//			requestWrapper =new RequestWrapper();
//			//errors=new ArrayList<>();
//			managerForm=(ManagerForm) requestWrapper.wrap(req, "com.se.form.ManagerForm");
			
			
//			if (managerForm.getName() == null || managerForm.getName() .trim().length() == 0) {           
//				req.setAttribute("error", "Employee name should not be null");                         
//				RequestDispatcher rd = req.getRequestDispatcher("/add-manager.jsp");             
//				rd.forward(req, resp);                                                                 
//			}                                                                                          
//			                                                                                           
//			if (managerForm.getMobileNo().length()==0) {                                                   
//				req.setAttribute("error", "mobile no should not be empty");                            
//				RequestDispatcher rd = req.getRequestDispatcher("/add-manager.jsp");             
//				rd.forward(req, resp);                                                                 
//			}                                                                                          
//			                                                                                           
//			if(managerForm.getSalary().isEmpty()==true||Double.parseDouble(managerForm.getSalary()) <=0) {     
//				req.setAttribute("error", "salary should not be zero");                                
//				RequestDispatcher rd = req.getRequestDispatcher("/add-manager.jsp");             
//				rd.forward(req, resp);                                                                 
//			}     
//			if(managerForm.getExperience() ==null||managerForm.getExperience().isEmpty()==true||Integer.parseInt(managerForm.getExperience()) <=0) {     
//				req.setAttribute("error", "Expearienceshouls not be zero");                                
//				RequestDispatcher rd = req.getRequestDispatcher("/add-manager.jsp");             
//				rd.forward(req, resp);                                                                 
//			}   
//			
			
//			
//			if (managerForm.getName() == null || managerForm.getName() .trim().length() == 0) {           
//				errors.add("Employee name should not be null");                                                              
//			}                                                                                          
//			                                                                                           
//			if (managerForm.getMobileNo().length()==0) {                                                   
//				errors.add("Mobile no should not be empty");                                                                                           
//			}                                                                                          
//			                                                                                           
//			if(managerForm.getSalary().isEmpty()==true||Double.parseDouble(managerForm.getSalary()) <=0) {     
//				errors.add("Salary should not be zero");                                
//				                                                             
//			}     
//			if(managerForm.getExperience() ==null||managerForm.getExperience().isEmpty()==true||Integer.parseInt(managerForm.getExperience()) <=0) {     
//				errors.add("Expearienceshouls not be zero");                                                                                                
//			}  
//			  Validator validator=new ManagerValidator();
//			   List<String> errors=  validator.validate(managerForm);
//			
//			if(errors.size() >0) {
//				req.setAttribute("errors", errors);
//				req.setAttribute("managerForm", managerForm);
//				RequestDispatcher requestDispatcher=req.getRequestDispatcher("/add-manager.jsp");
//				requestDispatcher.forward(req, resp);
//				return;
//			}
			
			CommonRequestService commonRequestService=new CommonRequestService();
		Object managerForm=	commonRequestService.apply(req, resp, "com.se.form.ManagerForm","com.se.validator.ManagerValidator","/add-manager.jsp");
		if(managerForm ==null) {
			return;
		}
			snjRegistrationService.registerNewManager((ManagerForm) managerForm);
			
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("/WEB-INF/success.jsp");
			req.setAttribute("message", "Member registerd with an  id: "+((ManagerForm) managerForm).getManagerId());
		
			requestDispatcher.forward(req, resp);
			
		}catch(Throwable t) {
			t.printStackTrace();
			
		}
		
	
	
	
	}
	
}
