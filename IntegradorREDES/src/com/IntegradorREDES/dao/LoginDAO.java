package com.IntegradorREDES.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.IntegradorREDES.model.Jogador;
import com.IntegradorREDES.util.ConnectDao;

public class LoginDAO {
	EntityManagerFactory emf = ConnectDao.getInstance();
	
	public List<Jogador> loginJogador(String cpf, String senha){
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("select e from Jogador e where e.cpf = ? and e.senha = ?");
		q.setParameter(0, cpf);
		q.setParameter(1, senha);
		
		List<Jogador> listaEmpregado = q.getResultList();
		
		em.getTransaction().commit();
		return listaEmpregado;
	}

}
