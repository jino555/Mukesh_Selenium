package SDETMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employees", "root", "9745754904");

		Statement st = con.createStatement();

		String s = "select * from wipro";
		String s1 = "insert into wipro values(5,'florisa')";
		String s2 ="delete from  wipro where name = 'anju' ";
		String s3 = "update wipro set name ='james' where sno =2";
		ResultSet  rs = st.executeQuery(s);
		
		while (rs.next()) {
			
			String name = rs.getString("name");
			int sno  = rs.getInt("sno");
			System.out.println( +sno  +"----- "  +name);
			
			
			
			
			
			
		}
		con.close();
	}
	
}
