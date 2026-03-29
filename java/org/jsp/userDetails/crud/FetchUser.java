package org.jsp.userDetails.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_details","root","root");
			PreparedStatement st = con.prepareStatement("SELECT * FROM user WHERE id=?");
			st.setInt(1, 113);
		 ResultSet eq = st.executeQuery();
		while(eq.next()) {
			System.out.println(
					eq.getInt(1) + " " +
			         eq.getString(2) + " "+
						eq.getString(3)
			);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
