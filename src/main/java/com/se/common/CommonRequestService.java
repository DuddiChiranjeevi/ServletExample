package com.se.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.se.helper.RequestWrapper;
import com.se.validator.Validator;

public class CommonRequestService {

public Object apply(HttpServletRequest req,HttpServletResponse resp,String formClass,String validatorClass,String page) throws ClassNotFoundException, Throwable {
	
	RequestWrapper requestWrapper=new RequestWrapper();
	Object form=requestWrapper.wrap(req,formClass);
	
	Validator validator=(Validator) Class.forName(validatorClass).newInstance();
	
	List<String> errors=validator.validate(form);
	
	if(errors.size()>0) {
		req.setAttribute("errors", errors);
		req.setAttribute("form", form);
		req.getRequestDispatcher(page).forward(req, resp);
	}
	return form;
	
}
}
