package org.jsp.userDetails.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_details","root","root");
			PreparedStatement st = con.prepareStatement("UPDATE user SET name=?, email=? WHERE id=?");
			st.setString(1, "Rashmi.B.R");
			st.setString(2, "rashmibr@gmail.com");
			st.setInt(3, 113);
			
			int eu = st.executeUpdate();
			System.out.println(eu+"Row is updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
