package session14;

// import from sql
import java.sql.*;

public class DatabaseConnect {

	// JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/selenium";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "Mithra2022";
   
   public static void main(String[] args) {
	   
	   Connection conn = null;
	   Statement stmt = null;
	   
	   try{
	   
		   //STEP 2: Register JDBC driver
	      Class.forName(JDBC_DRIVER);
	      
	      //STEP 3: Open a connection
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	
	      //STEP 4: Execute a query
	      stmt = conn.createStatement();
	      
	      String sql = "select * from selenium_batch1";
	      ResultSet rs = stmt.executeQuery(sql);
	
	      //STEP 5: Extract data from result set
	      while(rs.next()){
	    	  	  
	         //Retrieve by column name
	         int id  = rs.getInt("student_id");
	         String name = rs.getString("student_fname");
	
	         //Display values
	         System.out.print("ID: " + id +", Value: " + name +"\n");
	
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	      
	   }catch(SQLException se){
	      
		   //Handle errors for JDBC
	      se.printStackTrace();
	      
	   }catch(Exception e){
	      
		   //Handle errors for Class.forName
	      e.printStackTrace();
	      
	   }finally{
	     
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se){
	    	  se.printStackTrace();
	      }
	      
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	   
   
   }
}