package SeleniumWebDriver_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Database {

	@Test
	public void  database() throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
    System.out.println("Driver loaded");
    
   Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/selenium","root", "9745754904");
    System.out.println("connected to mySQLDb");
    
    List actualList= new ArrayList();
   Statement st = con.createStatement();
   
 ResultSet rs  = st.executeQuery("select firstname, email from seleniumuser");
   
   while(rs.next()) {
	   
	 String name =  rs.getString("firstname");
	 String email =  rs.getString("email");
	 
	 System.out.println("nme is " +name );
	 
	 System.out.println("email is " +email);
	 
	actualList.add(email);
	actualList.add(name);
	   }
   
	  
  
	System.out.println("Name and email in ArrayList  is " +actualList);
	
   /* Insert query
   String query = " Insert into seleniumuser (FirstName, Email)values(?,?)";
	  		
 
 // create the mysql insert preparedstatement
 PreparedStatement preparedStmt = con.prepareStatement(query);
 preparedStmt.setString(1, "<harish>");
 preparedStmt.setString(2, "<harish@gmail.com>");

  //execute the preparedstatement
 preparedStmt.execute();
 
 */
 con.close(); 
 
	   
   }
   
   
   
   
   
}
