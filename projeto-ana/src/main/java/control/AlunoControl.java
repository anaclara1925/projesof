package control;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoControl {
private EntityManager em;
	
	public  AlunoControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
}
	
}
