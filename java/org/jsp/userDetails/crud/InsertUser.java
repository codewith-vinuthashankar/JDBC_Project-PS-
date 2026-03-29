package org.jsp.userDetails.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUser {
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_details","root","root");
		PreparedStatement st = con.prepareStatement("INSERT INTO user VALUES(?,?,?)");
		st.setInt(1, 111);
		st.setString(2, "vinutha");
		st.setString(3, "vinutha@gmail.com");
	int eu = st.executeUpdate();
	System.out.println(eu+" row updated");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
