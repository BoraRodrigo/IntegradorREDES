package com.IntegradorREDES.service;

import java.util.List;

import com.IntegradorREDES.dao.FactoryDao;
import com.IntegradorREDES.dao.RespostasDao;
import com.IntegradorREDES.model.Respostas;

public class RespostasService {
	RespostasDao dao = new RespostasDao();
	public List<Respostas>listar(){
		return FactoryDao.createGenericDao(Respostas.class).listarTodos();
	}

}
