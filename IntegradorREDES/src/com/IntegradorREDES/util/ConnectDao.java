package com.IntegradorREDES.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectDao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador5");
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}

}
