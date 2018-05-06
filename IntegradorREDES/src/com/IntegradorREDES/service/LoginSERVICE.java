package com.IntegradorREDES.service;

import java.util.List;

import com.IntegradorREDES.dao.JogadorDao;
import com.IntegradorREDES.dao.LoginDAO;
import com.IntegradorREDES.model.Jogador;

public class LoginSERVICE {
	LoginDAO loginDAO = new LoginDAO();
	JogadorDao jogadorDao = new JogadorDao();
	
	
	public String  login(String cpf, String senha){
		List<Jogador> listajogador = jogadorDao.listAll();
		
		for(int i=0; i<listajogador.size(); i++) {
			if(cpf.equals(listajogador.get(i).getCpf())&&(senha.equals(listajogador.get(i).getSenha()))) {
				System.out.println("Vereficou cpf e senha igual ");
				loginDAO.loginJogador(cpf, senha);
				
			
				return "/inicialEvento.xhtml";
				
			}
			
		}
		System.out.println("Login xhtml");
		return "/login.xhtml";
		
	}

}
