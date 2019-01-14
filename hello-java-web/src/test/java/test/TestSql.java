package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class TestSql {
	
	@Test
	public void test() {
		
		String url="";
		String name="";
		String pw="";
				
		try (Connection conn=DriverManager.getConnection(url,name,pw)){
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
