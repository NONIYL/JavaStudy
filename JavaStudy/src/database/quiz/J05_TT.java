package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import model.EmpDept;

public class J05_TT {
	
/*
 (1) 도시 이름을 매개변수로 전달하면 해당 도시에서 근무하는 사원들의
	 모든 사원 정보와 부서 정보를 리스트 현태로 반환하는 메서드
	 (employees와 departments를 JOIN한 모든 정보)
 
 */

	private static DBConnector connector = new DBConnector("HR", "1234");

	public static List<EmpDept> getEmployeeByCityname(String cityname) {
		List<EmpDept> list = new ArrayList<>();

		String sql = "SELECT " 
				+ "employee_id, " 
				+ "first_name, " 
				+ "last_name, " 
				+ "email, " 
				+ "phone_number,"
				+ "hire_date, " 
				+ "job_id, " 
				+ "salary, " 
				+ "commission_pct, "
				+ "employees.manager_id AS \"Emp_MANAGER_ID\"," 
				+ "department_id, " 
				+ "department_name, "
				+ "departments.manager_id AS \"DEPT_MANAGER_ID\"," 
				+ "location_id FROM "
				+ "employees INNER JOIN departments USING(department_id) " 
				+ "INNER JOIN locations USING(location_id) "
				+ "WHERE locations.city = ?";

		try (
			Connection conn = connector.getConnection(); 
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, cityname);

			try (ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					EmpDept empDept = new EmpDept(rs);
					list.add(empDept);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		for (EmpDept emp : getEmployeeByCityname("Seattle")) {
			System.out.println(emp);
		}
	}
}
