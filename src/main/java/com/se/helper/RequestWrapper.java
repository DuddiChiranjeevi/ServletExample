package com.se.helper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class RequestWrapper {

	public Object  wrap(HttpServletRequest req, String fqClassName) throws ClassNotFoundException, Throwable {
		
		//System.out.println(Class.forName(fqClassName));
		Class<?> formObj=Class.forName(fqClassName);
	
		Object obj=formObj.newInstance();
		
		Map<String, String []> paramMap=new HashMap<>();
		paramMap=req.getParameterMap();
		
		
		paramMap.forEach((paramName,paramValue) ->{
		String setterMethod="set"+paramName.toUpperCase().charAt(0)+paramName.substring(1);
	
		try {
		Method method=formObj.getDeclaredMethod(setterMethod, new Class[] {String.class} );
		method.invoke(obj, new Object[] {paramValue[0]});
		}catch(Throwable t) {
			t.printStackTrace();
		}
		}
		);
		
		return obj;
		
	}
}
