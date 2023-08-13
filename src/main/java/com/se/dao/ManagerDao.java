package com.se.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.se.config.JDBCConfig;
import com.se.pojo.Manager;

public class ManagerDao {

	public int registerNewManager(Manager manager) throws Throwable {
		Connection con=null;
	PreparedStatement pstmt=null;
	int noOfRecordesInserted=0;
	try {
		con=JDBCConfig.getConection();
		pstmt=con.prepareStatement("insert into manager(manager_id,manager_nm,mobile_no,email_id,salary,experience) values(?,?,?,?,?,?)");
		pstmt.setInt(1, manager.getManagerId());
		pstmt.setString(2, manager.getName());
		pstmt.setString(3, manager.getMobileNo());
		pstmt.setString(4, manager.getEmailId());
		pstmt.setDouble(5, manager.getSalary());
		pstmt.setInt(6, manager.getExperience());
	 noOfRecordesInserted=	pstmt.executeUpdate();
		System.out.println(noOfRecordesInserted);
		
	}catch (Throwable t){
		t.printStackTrace();
		throw t;
	}
		
		return noOfRecordesInserted;
		
	}
}
