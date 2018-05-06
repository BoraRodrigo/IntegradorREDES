package com.IntegradorREDES.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import com.IntegradorREDES.model.Perguntas;
import com.IntegradorREDES.util.ConnectDao;

public class PerguntasDAO {
	
	RespostasDao dao = new RespostasDao();
EntityManagerFactory emf = ConnectDao.getInstance();
	
	public List<Perguntas> listAll() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("FROM tb_perguntas");
		em.getTransaction().commit();
		return q.getResultList();
	}
	
	
	
}
