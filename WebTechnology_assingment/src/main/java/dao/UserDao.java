package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnectivity;
import model.User;

public class UserDao {
	public static void addUser(User u) {
		
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "insert into uaer (fname,lname,email,mobile,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getMobile());
			pst.setString(5, u.getPassword());
			pst.executeUpdate();
			System.out.println("Data is inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<User>showUserById(int id) {
	       List<User> list = new ArrayList<User>();
	       
	       try {
	    	   Connection conn = DBConnectivity.createConnection();
	    	   String sql = "select * from user where id=?";
	    	   PreparedStatement pst = conn.prepareStatement(sql);
	    	   pst.setInt(1, id);
	    	   ResultSet rs = pst.executeQuery();
	    	   
	    	   while(rs.next()) {
	    		   User u = new User();
	    		   u.setId(rs.getInt("id"));
	    		   u.setFname(rs.getString("fname"));
	    		   u.setLname(rs.getString("lname"));
	    		   u.setEmail(rs.getString("email"));
	    		   u.setMobile(rs.getLong("mobile"));
	    		   u.setPassword(rs.getString("password"));
	    		   list.add(u);
	    	   }
	    	   
		} catch (Exception e) {
			e.printStackTrace();
		}
	     
	       return list;
	}
	
	public static List<User>showUser(int id) {
	       List<User> list = new ArrayList<User>();
	       
	       try {
	    	   Connection conn = DBConnectivity.createConnection();
	    	   String sql = "select * from user where id=?";
	    	   PreparedStatement pst = conn.prepareStatement(sql);
	    	   ResultSet rs = pst.executeQuery();
	    	   
	    	   while(rs.next()) {
	    		   User u = new User();
	    		   u.setId(rs.getInt("id"));
	    		   u.setFname(rs.getString("fname"));
	    		   u.setLname(rs.getString("lname"));
	    	       u.setEmail(rs.getString("email"));
	    		   u.setMobile(rs.getLong("mobile"));
	    		   u.setPassword(rs.getString("password"));
	    		   list.add(u);
	    	   }
	    	   
		} catch (Exception e) {
			e.printStackTrace();
		}
	     
	       return list;
	}
}
