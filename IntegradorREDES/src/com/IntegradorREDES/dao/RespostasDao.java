package com.IntegradorREDES.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;


import com.IntegradorREDES.model.Respostas;
import com.IntegradorREDES.util.ConnectDao;

public class RespostasDao {
EntityManagerFactory emf = ConnectDao.getInstance();
	
	public List<Respostas> listAll() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("FROM tb_respota");
		em.getTransaction().commit();
		return q.getResultList();
	}
	
	
	
	

}
