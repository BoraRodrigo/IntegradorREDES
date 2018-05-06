package com.IntegradorREDES.dao;

public class FactoryDao {
		
	public static <E> InterfaceGenericDao<E> createGenericDao(Class<E> entityClass){
		return new GenericDao<E>(entityClass);
	}
}
