package com.IntegradorREDES.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import com.IntegradorREDES.util.ConnectDao;

public class GenericDao<E> implements InterfaceGenericDao<E> {

	private EntityManager em;

	private final Class<E> entityClass;

	public GenericDao(Class<E> entityClass) {
		this.entityClass = entityClass;
	}
	@Override
	public void inserir(E entity) {

		em = ConnectDao.getInstance().createEntityManager();

		try {

			em.getTransaction().begin();

			em.persist(entity);

			em.getTransaction().commit();

		} catch (Exception e) {

			em.getTransaction().rollback();

		} finally {
			em.close();
		}

	}

	@Override
	public void excluir(Integer id) {

		em = ConnectDao.getInstance().createEntityManager();

		try {

			em.getTransaction().begin();

			em.remove(em.getReference(entityClass, id));

			em.getTransaction().commit();

		} catch (Exception e) {

			em.getTransaction().rollback();

		} finally {
			em.close();
		}

	}

	@Override
	public List<E> listarTodos() {

		em = ConnectDao.getInstance().createEntityManager();

		em.getTransaction().begin();

		CriteriaQuery<E> query = em.getCriteriaBuilder().createQuery(entityClass);
		query.select(query.from(entityClass));

		List<E> lista = em.createQuery(query).getResultList();

		em.getTransaction().commit();// *
		em.close();

		return lista;

	}

	@Override
	public void alterar(E entity) {
		// TODO Auto-generated method stub
		
	}
}
