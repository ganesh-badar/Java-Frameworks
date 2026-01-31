package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
 public static Connection getConnection() 
 {
	 Connection con=null;
	 
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_db?useSSL=false","root","Ganesh@1351");
	 }
	 catch(Exception e) {
		 e.getStackTrace();
	 }
	 return con;
	 
 }
}
