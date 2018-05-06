package com.IntegradorREDES.dao;

import java.util.List;

public interface InterfaceGenericDao<E>{
	
	void inserir(E entity);
	void alterar(E entity);
	void excluir(Integer id);
	List<E> listarTodos();
}
