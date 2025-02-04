package com.winter.app.tests.departments;

import java.util.List;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;

public class DepartmentDAOTest {

	public static void main(String[] args) {
		DepartmentDAO departmentDAO = new DepartmentDAO();
		try {
			List<DepartmentDTO> ar = departmentDAO.getList();
			System.out.println(ar.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
