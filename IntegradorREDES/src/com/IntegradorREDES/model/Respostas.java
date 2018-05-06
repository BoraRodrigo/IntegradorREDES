package com.IntegradorREDES.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_respota")
public class Respostas {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private String resposta;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getResposta() {
			return resposta;
		}
		public void setResposta(String resposta) {
			this.resposta = resposta;
		}
		
		public Respostas() {
			
		}
		public Respostas( String resposta) {
			this.resposta = resposta;
		}
		

		

}
