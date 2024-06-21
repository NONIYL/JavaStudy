package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J03_DBPractice {
	
	/*
	 
	 (1) 관리자 계정으로 DB에 새 계정을 추가한다 
	 
	 (2) 관리자 계정으로 새 계정에 권한을 부여한다 
	 
	 (3) 해당 계정에 새 테이블을 추가한다 
	 	(기본키로 시퀀스를 사용해야 하고, 제약 조건을 종류별로 모두 사용해야 한다) 
	 	
	 (4) 프로그램에서 스캐너로 데이터를 입력하면 DB에 행이 추가되어야 한다
	 
	 (5) 콘솔에서 여태까지 추가된 모든 행을 조회 할 수 있어야 한다
	 
	 */

	public static void main(String[] args) {
		

		DBConnector connector = new DBConnector("RRR", "1313"); 
		try(
			Connection conn = connector.getConnection();
		) {
			String sql1 = "INSERT INTO oder VALUES(?, ?, ?)";
			
			try(
				PreparedStatement pstmt = conn.prepareStatement(sql1);
			) {
				pstmt.setString(1, "25" );
				pstmt.setInt(2, 6 );
				pstmt.setString(3, "망사 메쉬 니트" );
				
				pstmt.setString(1, "48" );
				pstmt.setInt(2, 7 );
				pstmt.setString(3, "플로우 원피스" );
				
				int row = pstmt.executeUpdate();
				System.out.printf("%d행이 성공적으로 추가되었습니다.\n", row);

			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
}