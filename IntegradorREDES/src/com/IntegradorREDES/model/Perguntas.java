package com.IntegradorREDES.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_perguntas")
public class Perguntas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String pergunta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	
	public Perguntas() {
		
	}
	
	public Perguntas(int id, String pergunta) {
		
	this.id=id;
		this.pergunta = pergunta;
	}
	
	

}
