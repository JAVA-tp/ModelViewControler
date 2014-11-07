package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPostgreSql {
	
	AccessBDD access = new AccessBDD(); 
	
	private static Connection connect;
	private static String url = "http://172.16.99.2/phppgadmin/";
	
	
	public Connection getInstance() {
		if (connect == null) {
			try {
				connect = DriverManager.getConnection(url, access.getUser(), access.getPass());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connect;
	}
}
