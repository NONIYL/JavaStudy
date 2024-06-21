package database.dbpool;

import java.util.ArrayList;
import java.util.List;

public class MyConnectionPool {
	
	List<MyConnection> pool = new ArrayList<>();
	
	public MyConnectionPool(int size) {
		for (int i = 0; i < size; ++i) {
			pool.add(new MyConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "1234"));
			
		}
	}
	
	public MyConnection borrowConnection() {
		while (true)
		for (MyConnection conn : pool) {
			if (!conn.using) {
				// 사용 가능한 연결을 발견하면 사용중으로 표시하고 리턴
				conn.use(); 
				return conn;
			}
		}
	}
}
	

