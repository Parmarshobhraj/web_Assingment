package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306//User","root","");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
		public static Connection createConnectionMsg() {
			Connection connection = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306//message","root","");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return connection;
		}

}
