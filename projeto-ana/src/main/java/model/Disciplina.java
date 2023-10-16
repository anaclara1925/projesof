
package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer  id;
	private Integer  carga_horaria;
	private String nome;
	private String ementa;
	private String conteudo;
	public Disciplina(Integer id, Integer carga_horaria, String nome, String ementa, String conteudo) {
		super();
		this.id = id;
		this.carga_horaria = carga_horaria;
		this.nome = nome;
		this.ementa = ementa;
		this.conteudo = conteudo;
	}
	
	public Disciplina() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(Integer carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
