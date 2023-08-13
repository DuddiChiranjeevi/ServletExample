package com.se.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.se.config.JDBCConfig;
import com.se.pojo.Employee;

public class EmployeeDao {

	public int newEmployeeRegister(Employee emp) throws Throwable {
		Connection con = null;
		PreparedStatement pstmt = null;
		int noOfRecordesInserted = 0;

		try {
			con = JDBCConfig.getConection();
			pstmt = con.prepareStatement(
					"insert into employee (emp_id,emp_nm,mobile_no,email_id,salary) values(?,?,?,?,?)");
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getMobileNo());
			pstmt.setString(4, emp.getEmailId());
			pstmt.setInt(5, emp.getSalary());
			noOfRecordesInserted = pstmt.executeUpdate();
			System.out.println("In dao: "+emp.getEmpId());

		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}

		return noOfRecordesInserted;

	}
}
