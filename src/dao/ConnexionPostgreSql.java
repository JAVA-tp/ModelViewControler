package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPostgreSql {
	
	private static AccessBDD access = new AccessBDD(); 
	
	private static Connection connect;
	private static String url = "jdbc:postgresql://172.16.99.2:5432/tdabre";
	
	
	public static Connection getInstance() {
		if (connect == null) {
			try {
				connect = DriverManager.getConnection(url, access.getLogin(), access.getPassword());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connect;
	}
	
	public static void Stop() {
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
