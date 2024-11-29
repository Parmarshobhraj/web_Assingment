package Message_Passing_System;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnectivity;

public class MsgController {
	public void sendMessage(Message m) {
	      
		 try {
			 Connection conn = DBConnectivity.createConnection();
			 String sql = "insert into Msg (from,to,msg) values(?,?,?)";
			 PreparedStatement pst = conn.prepareStatement(sql);
			 pst.setString(1, m.getFrom());
			 pst.setString(2, m.getTo());
			 pst.setString(3, m.getMsg());
			 pst.executeUpdate();
			 System.out.println("Msg Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
	  }

}
