package org.jsp.userDetails.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_details","root","root");
			PreparedStatement st = con.prepareStatement("DELETE FROM user WHERE id=?");
			st.setInt(1, 111);
			int eu = st.executeUpdate();
			System.out.println(eu+"Deleted the user details ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
