package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	
	// 객체를 생성하는걸 private로 묶는다 싱글톤 방식 (객체의 유일성을 위해서 하나의 객체만을 연결한다.. 뭐.. 그런거)
	private static DatabaseConnector dbc = new DatabaseConnector();
	private Connection conn = null; // DB관련 접속 규격 (java에서 지원하는거임)
	
	// url, user, password 필요함
	// jdbcDriver
	private String jdbcDriver = "com.mysql.jdbc.Driver";
	//url
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	
	private DatabaseConnector() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "javauser", "mysql");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("url 연결 정보가 옳지 않습니당");
			e.printStackTrace();
		}
	}
	
	// 싱글톤 방식
	public static DatabaseConnector getInstance() {
		return dbc;
	}
	
	//connection도 다 private로 막았기 때문에 메서드 써야함
	public Connection getConnection() {
		return conn;
	}
	

}
