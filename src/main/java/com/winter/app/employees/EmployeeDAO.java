package com.winter.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.utils.DBConnection;

public class EmployeeDAO {
	
	public EmployeeDTO detail(EmployeeDTO employeeDTO)throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql ="SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, employeeDTO.getEmployee_id());
		
		ResultSet rs = st.executeQuery();
		EmployeeDTO result = null;
		if(rs.next()) {
			result = new EmployeeDTO();
			result.setLast_name(rs.getString("LAST_NAME"));
			result.setEmail(rs.getString("EMAIL"));
			result.setHire_date(rs.getDate("HIRE_DATE"));
			result.setJob_id(rs.getString("JOB_ID"));
			result.setSalary(rs.getDouble("SALARY"));
			result.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			result.setManager_id(rs.getLong("MANAGER_ID"));
			result.setPhone_number(rs.getString("PHONE_NUMBER"));
			result.setDepartment_id(rs.getLong("DEPARTMENT_ID"));
			
		}
		
		DBConnection.disConnction(rs, st, con);
		
		return result;
		
	}
	
	public EmployeeDTO login(EmployeeDTO employeeDTO)throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql ="SELECT EMPLOYEE_ID, PASSWORD, FIRST_NAME FROM EMPLOYEES"
				+ " WHERE EMPLOYEE_ID=? AND PASSWORD=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, employeeDTO.getEmployee_id());
		st.setString(2, employeeDTO.getPassword());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			employeeDTO.setFirst_name(rs.getString("FIRST_NAME"));
		}else {
			employeeDTO=null;
		}
		
		DBConnection.disConnction(rs, st, con);
		
		return employeeDTO;
		
		
	}
	
	public int add(EmployeeDTO employeeDTO)throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql ="INSERT INTO EMPLOYEES "
				+ "values (EMPLOYEES_SEQ.NEXTVAL, ?,?,?,?,SYSDATE, ?,?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, employeeDTO.getFirst_name());
		st.setString(2, employeeDTO.getLast_name());
		st.setString(3, employeeDTO.getEmail());
		st.setString(4, employeeDTO.getPhone_number());
		st.setString(5, employeeDTO.getJob_id());
		st.setDouble(6, employeeDTO.getSalary());
		st.setDouble(7, employeeDTO.getCommission_pct());
		st.setLong(8, employeeDTO.getManager_id());
		st.setLong(9, employeeDTO.getDepartment_id());
		st.setString(10, employeeDTO.getPassword());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnction(st, con);
		
		return result;
		
	}
	
	public int update(EmployeeDTO employeeDTO)throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql ="update employees set first_name=?, last_name=? where employee_id=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, employeeDTO.getFirst_name());
		st.setString(2, employeeDTO.getLast_name());
		st.setLong(3, employeeDTO.getEmployee_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnction(st, con);
		
		return result;
		
	}

}
