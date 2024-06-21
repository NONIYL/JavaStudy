package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;


public class J05_DataModelClass {
	
	/*
	 	# 데이터 모델 클래스
	 	
	 	- 주로 DB에서 꺼낸 데이터를 담아놓는 용도의 클래스를 의미한다(DTO, VO)
	 	- 꺼내온 데이터를 클래스 형태로 담아두면 컬렉션이나 매개변수에 활용하기 편해진다
	 	- 조회하는 데이터의 형태대로 만들어 두고 활용한다
	 	
	 */
	
	public static void main(String[] args) {
		
		DBConnector connector = new DBConnector("HR", " 1234");
		
		// 데이터 모델 클래스를 활용하면 
		// SELECT로 여러 행을 조회 할 때 조회한 데이터를 리스트에 담아 둘 수 있다
		// List<생성자> 이름 = new ArrayList<>();
		List<Employee> employees = new ArrayList<>();
		
		try (
			Connection conn = connector.getConnection();
		) {
				
		  String sql = "SELECT * FROM employees";
		  
		  try(
			  PreparedStatement pstmt = conn.prepareStatement(sql);
				  ResultSet rs = pstmt.executeQuery();
		  ) {
			  while (rs.next()) {
				  //DB에서 꺼낸 하나의 레코드가 하나의 인스턴스가 된다 
				  //아래처럼의 귀찮은 과정 생략가능(맨아래 //)
				  Employee emp = new Employee(rs);
				  //행으로 생성한 인스턴스를 리스트에 추가하겠다
				 // System.out.println(emp);
				  employees.add(emp); //List에서 꺼내온거 
				  
			  }
			  
		  }
				
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		// 리스트를 활용해 코드를 진행 할 수 있다
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}


// 컬럼 이름 대신 컬럼의 순서를 넣는 오버로딩도 있다  ▼
//				while (rs.next()) {
//				  Integer employee_id = rs.getInt(1);  //rs.getInt("employee_id"));
//				  String first_name = rs.getString(2);
//				  String last_name = rs.getString(3);
//				  String email = rs.getString(4);
//				  String phone_number = rs.getString(5);
//				  Date hire_Date = rs.getDate(6);
//				  String job_id = rs.getNString(7);
//				  //not null이 아님 컬럼은 null값이 나올 수도 있으므로 
//				  //Wrapper 클래스로 받아주는 것이 좋다 
//				  //Double commission_pct = rs.getDouble(9); --> Double or Float 둘 다 사용가능
//				  Float salary = rs.getFloat(8);
//				  Float commission_pct = rs.getFloat(9);
//				  Integer manager_id = rs.getInt(10);
//				  Integer department_id = rs.getInt(11);
//				  
//				  System.out.printf("%s\t%s\n", first_name, salary);



