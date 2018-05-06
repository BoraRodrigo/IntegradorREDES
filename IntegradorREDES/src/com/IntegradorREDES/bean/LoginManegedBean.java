package com.IntegradorREDES.bean;

import java.io.IOException;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.IntegradorREDES.model.Jogador;
import com.IntegradorREDES.service.LoginSERVICE;

@ManagedBean(name = "loginManagedBean")
@SessionScoped
public class LoginManegedBean {
	private static final long serialVersionUID = 4024239853460771489L;
	
	Jogador jogador = new Jogador();
	LoginSERVICE loginSERVICE = new LoginSERVICE();

	private String cpf;
	private String senha;
	
	String retorna = "";
	
	
	
	public LoginManegedBean() {
		Jogador jogador = new Jogador();
		LoginSERVICE loginSERVICE = new LoginSERVICE();
	}

	public String logar() throws ClassNotFoundException, SQLException, IOException {
		retorna = loginSERVICE.login(cpf, senha);//, empregado, empregador
		return retorna;
	}

	

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public LoginSERVICE getLoginSERVICE() {
		return loginSERVICE;
	}

	public void setLoginSERVICE(LoginSERVICE loginSERVICE) {
		this.loginSERVICE = loginSERVICE;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRetorna() {
		return retorna;
	}

	public void setRetorna(String retorna) {
		this.retorna = retorna;
	}
	
	
}
