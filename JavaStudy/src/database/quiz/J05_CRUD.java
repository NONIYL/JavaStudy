package database.quiz;

//public class J05_CRUD {
	

//	public static void main(String[] args) {
//		DBConnector connector = new DBConnector("HR", " 1234");
//	
//	//(1) 모든 커피 목록을 리스트 형태로 반환하는 메서드
//
//	List<COFFEE> coffee = new ArrayList<>();
//	 
//    try (
//    	Connection conn = connector.getConnection();
//	) {
//    	
//    	String sql = "SELECT "
//    			+ "coffee_id, "
//    			+ "coffee_name, "
//    			+ "coffe_price, "
//    			+ "FROM coffee2";
// 
//    	try(
//    		PreparedStatement pstmt = conn.prepareStatement(sql);
//    			ResultSet rs = pstmt.executeQuery();
//    	) {
//    		while(rs.next()) {
//    		
//    		COFFEE cof = new COFFEE(rs);
//    		coffee.add(cof);
//     			
//    		}
//    	}
// 
//    } catch (SQLException e) {
//		e.printStackTrace();
//	}
//    
//    for (COFFEE coffee1 : coffee) {
//    	System.out.println(coffee1);
//    }
//    
//    //(3) 새로운 커피를 추가하는 메서드 (추가할 때 시퀀스 사용) 
//    String sql2 = "INSERT INTO coffee VALUES(?, ?, ?)";
//    
//    try(
//    	PreparedStatement pstmt = conn.prepareStatement(sql2);
//    ) {
//    	p
//    }
//    	
//	
	
    
    
    
    
    
    
    
    //(2) 커피 이름으로 검색한 결과를 리스트 형태로 반환하는 메서드 (LIKE) 
    
    
    
	

 

	
	//(4) 이미 존재하는 컾의 정보를 수정할 수 있는 메서드 (기본키는 수정 불가능)
    
    
	
	//(5) 커피ID를 매개변수로 전달 받으면 해당 커피를 삭제하고 삭제 여부를 반환해주는 메서드
	
//    }
//}
