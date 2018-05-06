package com.IntegradorREDES.bean;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.IntegradorREDES.dao.RespostasDao;
import com.IntegradorREDES.model.Perguntas;
import com.IntegradorREDES.model.Respostas;
import com.IntegradorREDES.service.PerguntasService;
import com.IntegradorREDES.service.RespostasService;

@ManagedBean(name = "PerguntasManegedBean")
@SessionScoped
public class PerguntasManegedBean {
	private String perguntas;
	private Perguntas pergunta;
	private List<Perguntas> listaperguntas;
	
	
	
	private Respostas respostas;
	private List<Respostas> listaresposta;
	private String resposta;
	
		
	public PerguntasManegedBean()throws ClassNotFoundException, SQLException, IOException  {
			PerguntasService perguntasService= new PerguntasService();
			Perguntas perguntas = new Perguntas();
			System.out.println(perguntas.getId());
			listaperguntas = perguntasService.listar();
			
			
			
	}
	
	public void resposta() {
		
		RespostasService respostasService= new RespostasService();
		respostas = new Respostas();
		listaresposta = respostasService.listar();
		
		
		resposta=listaresposta.get(pergunta.getId()).getResposta();
		
	}

	public Respostas getRespostas() {
		return respostas;
	}

	public void setRespostas(Respostas respostas) {
		this.respostas = respostas;
	}

	public List<Respostas> getListaresposta() {
		return listaresposta;
	}

	public void setListaresposta(List<Respostas> listaresposta) {
		this.listaresposta = listaresposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(String perguntas) {
		this.perguntas = perguntas;
	}

	public Perguntas getPergunta() {
		return pergunta;
	}

	public void setPergunta(Perguntas pergunta) {
		this.pergunta = pergunta;
	}

	public List<Perguntas> getListaperguntas() {
		return listaperguntas;
	}

	public void setListaperguntas(List<Perguntas> listaperguntas) {
		this.listaperguntas = listaperguntas;
	}
	
	
	
}
