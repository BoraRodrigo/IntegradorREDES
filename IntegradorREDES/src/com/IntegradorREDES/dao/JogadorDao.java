package com.IntegradorREDES.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.IntegradorREDES.model.Jogador;
import com.IntegradorREDES.util.ConnectDao;

public class JogadorDao {
	
	EntityManagerFactory emf = ConnectDao.getInstance();
	
	public List<Jogador> listAll() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("FROM Jogador");
		em.getTransaction().commit();
		return q.getResultList();
	}
	
	public void inserirJogador(Jogador jogador) throws SQLException, ClassNotFoundException, IOException {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		jogador.setId(null);//Essa porra de id me ferro então antes de persistir no banco lembre que o id tem que ser nulo
		em.persist(jogador);
		
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Jogador> buscarpornome(String  nome) throws ClassNotFoundException, SQLException, IOException{
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("FROM Jogador where nome like ?");
		q.setParameter(0, nome);
		
		em.getTransaction().commit();
		//em.close();
		
		return q.getResultList();
	}


}
