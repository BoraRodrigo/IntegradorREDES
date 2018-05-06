package com.IntegradorREDES.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Dao {
	private ConnectJogador db = new ConnectJogador();
	protected Connection connect;
	
	public void openConnection() throws ClassNotFoundException, SQLException{
		JOptionPane.showInternalMessageDialog(null, " Base de dados ");
		connect = db.getConnection();
		JOptionPane.showInternalMessageDialog(null, " Base de dados ");
	}
	
	public void closeConnection() {
		if(connect != null) {
			try {
				connect.close();
			} catch(SQLException e) {
				System.out.println("Erro ao Conctar a BASE DE DADOS");
				JOptionPane.showInternalMessageDialog(null, "Erro ao acessar a Base de dados "+e);
			}
		}
	}
}
