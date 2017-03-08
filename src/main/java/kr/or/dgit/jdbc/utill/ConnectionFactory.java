package kr.or.dgit.jdbc.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final ConnectionFactory instance = new ConnectionFactory();
	private ConnectionFactory(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.printf("MySQL Driver not Found!!");
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public static Connection getConnection(){
		return instance.createConnection();
	}

	private Connection createConnection() {
		Connection connection = null;
		try {
			String url = "jdbc:mysql://localhost:3306/mybatis";
			String user = "user_mybatis";
			String password = "rootroot";
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error : Unable to Connection DataBase");
		}
		return connection;
	}
}