package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import model.DE;

public class J05_ {

	// (1) 도시 이름을 매개변수로 전달하면 해당 도시에서 근무하는 사원들의
	// 모든 사원 정보와 부서 정보를 리스트 현태로 반환하는 메서드
	// (employees와 departments를 JOIN한 모든 정보)

	// (2) 부서명을 매개변수로 전달하면 해당 부서에 속한
	// 모든 사원 정보와 직책 정보가 조회되는 메서드
	// (employees와 jobs를 JOIN한 모든 정보 )


	public static void main(String[] args) {

		DBConnector connector = new DBConnector("HR", " 1234");

		List<DE> des = new ArrayList<>();
	
		try (Connection conn = connector.getConnection();
		) {

			String sql = "SELECT * FROM employees e, departments d, locations l"
					+ " WHERE city = 'seattle' AND e.department_id = d.department_id AND d.location_id = l.location_id";

			try (PreparedStatement pstmt = conn.prepareStatement(sql); 
					ResultSet rs = pstmt.executeQuery();
				) {
				while (rs.next()) {

					DE de = new DE(rs);
					des.add(de);

					System.out.println(de);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		for (DE de : des) {
			System.out.println(des);
		}


		
	}
}
