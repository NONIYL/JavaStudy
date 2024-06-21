package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.DBConnector;
import model.Coffee;

public class J05_CRUD_T {
	
	//(1) 모든 커피 목록을 리스트 형태로 반환하는 메서드
	//(2) 커피 이름으로 검색한 결과를 리스트 형태로 반환하는 메서드 (LIKE) 
	//(3) 새로운 커피를 추가하는 메서드 (추가할 때 시퀀스 사용) 
	private static  DBConnector connector = new DBConnector("HR", "1234");
	
	//(4) 이미 존재하는 컾의 정보를 수정할 수 있는 메서드 (기본키는 수정 불가능
	public static boolean updateCoffe(Coffee coffee) {
		// 전달받은 coffee의 id값으로 update 
		String sql = "UPDATE coffee SET"
				+ " coffee_price = ?, coffee_name = ?"
				+ "WHERE coffee_id = ?";
		
		// update를 실행했는데 변한 행이 0이라면 수정 실패, 1이면 성공
		try(
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1,  coffee.getCoffe_price());
			pstmt.setString(2, coffee.getCoffee_name());
			pstmt.setInt(3, coffee.getCoffee_id());
			
			return pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	
	}
	//(5) 커피ID를 매개변수로 전달 받으면 해당 커피를 삭제하고 삭제 여부를 반환해주는 메서드
	public static void main(String[] args) {
		boolean result = updateCoffe(new Coffee(1, "아메리카라노", 2000));
		
		System.out.println("수정 성공? " + result);
	}

}
