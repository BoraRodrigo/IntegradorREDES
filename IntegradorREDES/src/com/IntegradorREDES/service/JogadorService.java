package com.IntegradorREDES.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.IntegradorREDES.dao.FactoryDao;
import com.IntegradorREDES.dao.JogadorDao;
import com.IntegradorREDES.model.Jogador;

public class JogadorService {
	JogadorDao dao = new JogadorDao();
	public List<Jogador>listar(){
		return FactoryDao.createGenericDao(Jogador.class).listarTodos();
	}
	
	public void inserirJogador(Jogador jogador) throws SQLException, ClassNotFoundException, IOException{
		dao.inserirJogador(jogador);
	}
	
	public List<Jogador> buscarpornome(String name) throws SQLException, ClassNotFoundException, IOException{
		List<Jogador> list = new ArrayList<Jogador>();
		list= dao.buscarpornome(name);
		return list;
	}

}
