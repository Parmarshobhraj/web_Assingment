package Message_Passing_System;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnectivity;

public class UserController {
	public void createUser(User u) {
        
		 try {
			 Connection conn = DBConnectivity.createConnection();
			 String sql = "insert into uaer (fname,lname,email,mobile) values(?,?,?,?)";
			 PreparedStatement pst = conn.prepareStatement(sql);
			 pst.setString(1, u.getFname());
			 pst.setString(2, u.getLname());
			 pst.setString(3, u.getEmail());
			 pst.setString(4, u.getMobile());
			 pst.executeUpdate();
			 System.out.println("User Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
   }

}
