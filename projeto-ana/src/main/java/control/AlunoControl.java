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
	public void alterar(AlunoControl objeto) {
		try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	public void excluir(AlunoControl objeto) {
		try {
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
public void excluirPorId(Integer id) {}
	public Aluno buscarPorId(Integer id) {return em.find(Aluno.class, id);}
	public List<AlunoControl> buscarTodos() {return null;}
	//outros métodos de busca que achar necessário

}
