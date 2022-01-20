package br.com.jogodasorte.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JogoDoMilhao");
	
	public static EntityManager criarEntityManager() {
		return emf.createEntityManager();
	}
}