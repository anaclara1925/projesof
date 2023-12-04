package control;

import javax.persistence.Persistence;
import model.Disciplina;
import model.Matricula;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class DisciplinaControl {
	private EntityManager em;

	public DisciplinaControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	public void inserir(Disciplina objeto) {
		try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	public void alterar(Disciplina objeto) {
		try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	public void excluir(Disciplina objeto) {
		 try {
	            em.getTransaction().begin();
	            em.remove(objeto);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
public void excluirPorId(Integer id) {
	try {
        Disciplina objeto = buscarPorId(id);
        excluir(objeto);
     } catch (Exception ex) {
        ex.printStackTrace();
     }

}
	public Disciplina buscarPorId(Integer id) {return em.find(Disciplina.class, id);}
	public List<DisciplinaControl> buscarTodos() {String nomeClasse = Disciplina.class.getName();
	return em.createQuery("FROM " + nomeClasse).getResultList();
}
	//outros métodos de busca que achar necessário.
}