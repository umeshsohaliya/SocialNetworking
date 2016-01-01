package com.rta.conne;

import java.sql.*;

public class conne {
	public static Connection GetConnection() throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/rta","root","");
		return con;
	}

}
