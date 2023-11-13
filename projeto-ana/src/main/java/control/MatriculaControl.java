package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MatriculaControl {
	private EntityManager em;
	
	public MatriculaControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
}
	
}