package com.IntegradorREDES.util;

import java.io.IOException;
import java.sql.SQLException;

import com.IntegradorREDES.dao.JogadorDao;
import com.IntegradorREDES.model.Jogador;

public class teste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		JogadorDao dao = new JogadorDao();
		Jogador jogador = new Jogador();
		
		jogador.setCpf("123");
		jogador.setEmail("123");
		jogador.setNome("Rodrigo");
		dao.inserirJogador(jogador);
	}
}
