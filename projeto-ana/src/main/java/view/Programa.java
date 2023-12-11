package view;

import java.util.*;

import control.AlunoControl;
import model.Aluno;

public class Programa {
	public static void main(String[] args) {
		
		Aluno novo = new Aluno(null, "bruno", "iftm","");		
		AlunoControl controle = new AlunoControl();	
		controle.inserir(novo);
		
		novo = controle.buscarPorId(1);
		System.out.println(novo.getNome());
		
		novo.setNome("bruno queiroz pinto"); 
		controle.alterar(novo);
		
		controle.excluirPorId(3);	
		
		List<Aluno> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Aluno obj = (Aluno) iterator.next();
			System.out.println(obj.getId() + "-"+obj.getNome() + " - " + obj.getEndereco());
		}
		

	}
}
