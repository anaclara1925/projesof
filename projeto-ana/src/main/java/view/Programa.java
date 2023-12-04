package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import antlr.collections.List;
import control.AlunoControl;
import model.Aluno;

public class Programa {
	public static void main(String[] args) {
		
		Aluno novo = new Aluno(null, "bruno", "clinica","");		
		AlunoControl controle = new AlunoControl();	
		controle.inserir(novo);
		
		novo = controle.buscarPorId(1);
		System.out.println(novo.getNome());
		
		novo.setNome("bruno queiroz"); 
		controle.alterar(novo);
		
		List<Aluno> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Aluno obj = (Aluno) iterator.next();
			System.out.println(obj.getNome());
		}
	}
}
