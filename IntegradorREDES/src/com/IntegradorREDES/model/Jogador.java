package com.IntegradorREDES.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceUnit;
import javax.persistence.PersistenceUnits;
import javax.persistence.Table;
import javax.transaction.Transactional;


@PersistenceUnits({@PersistenceUnit(unitName="Integrador5")})
@Entity

@Table(name = "tb_jogador")



public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	//Construtor
	public Jogador() {
		
	}
	public Jogador( String nome, String email, String cpf,String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.senha= senha;
	}

	
}
