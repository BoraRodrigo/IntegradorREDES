package com.IntegradorREDES.bean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.IntegradorREDES.model.Jogador;
import com.IntegradorREDES.service.JogadorService;

@ManagedBean(name = "JogadorManagedBean")
@SessionScoped
public class JogadorManegedBean {

	private Jogador jogador;
	private List<Jogador> listJogador;
	private JogadorService jogadorService;
	private String nome;

	public JogadorManegedBean() throws ClassNotFoundException, SQLException, IOException {

		jogadorService = new JogadorService();
		jogador = new Jogador();

		listJogador = jogadorService.listar();
	}
	
	public String inserirJogador() throws SQLException, ClassNotFoundException, IOException{
		System.out.println("Cadastrando...");
		jogadorService.inserirJogador(jogador);
		
		this.listJogador = jogadorService.listar();
		return "/login.xhtml";//mapear 
	}
	
	public void buscarpornome() throws SQLException, ClassNotFoundException, IOException{
		System.out.println("Searching...");
		this.listJogador = jogadorService.buscarpornome(jogador.getNome());
	}

	
	//Get e seter
	
	
	public Jogador getJogador() {
		return jogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public List<Jogador> getListJogador() {
		return listJogador;
	}

	public void setListJogador(List<Jogador> listJogador) {
		this.listJogador = listJogador;
	}

	public JogadorService getJogadorService() {
		return jogadorService;
	}

	public void setJogadorService(JogadorService jogadorService) {
		this.jogadorService = jogadorService;
	}
	

}
