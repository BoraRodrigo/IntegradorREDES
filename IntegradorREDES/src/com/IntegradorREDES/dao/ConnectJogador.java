package com.IntegradorREDES.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJogador {
	
	private Connection con;
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public ConnectJogador(){
		driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		url = "jdbc:sqlserver://localhost:1433/Integrador5";
	
		username = "sa";
		password = "1234";
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Class.forName(driver);
		this.con = DriverManager.getConnection(url , username , password);
		
		return this.con;
	}
}
