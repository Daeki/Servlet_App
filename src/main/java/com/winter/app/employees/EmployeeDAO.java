package com.winter.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.winter.app.utils.DBConnection;

public class EmployeeDAO {
	
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

}
