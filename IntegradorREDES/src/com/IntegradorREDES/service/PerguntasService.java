package com.IntegradorREDES.service;

import java.util.List;

import com.IntegradorREDES.dao.FactoryDao;
import com.IntegradorREDES.dao.PerguntasDAO;
import com.IntegradorREDES.model.Perguntas;

public class PerguntasService {
	PerguntasDAO dao = new PerguntasDAO();
	public List<Perguntas>listar(){
		return FactoryDao.createGenericDao(Perguntas.class).listarTodos();
	}

}
