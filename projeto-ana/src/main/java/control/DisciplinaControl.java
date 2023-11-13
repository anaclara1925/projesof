package control;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class DisciplinaControl {
	private EntityManager em;
	
	public DisciplinaControl()
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
	em = emf.createEntityManager();
}

}
