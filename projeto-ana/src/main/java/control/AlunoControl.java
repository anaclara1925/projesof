package control;

import java.util.List;
import model.Aluno;
import model.Matricula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoControl {
private EntityManager em;
	
	public  AlunoControl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
}
	public void inserir(Aluno objeto) {
		 try {
	            em.getTransaction().begin();
	            em.persist(objeto);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	public void alterar(Aluno objeto) {
		try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	public void excluir(Aluno objeto) {
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
        Aluno objeto = buscarPorId(id);
        excluir(objeto);
     } catch (Exception ex) {
        ex.printStackTrace();
     }
}
	public Aluno buscarPorId(Integer id) {return em.find(Aluno.class, id);}
	
	public List<Aluno> buscarTodos() {String nomeClasse = Aluno.class.getName();
	return em.createQuery("FROM " + nomeClasse).getResultList();
}
	//outros métodos de busca que achar necessário

}
