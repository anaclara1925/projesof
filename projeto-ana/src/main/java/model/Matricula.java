package model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matricula implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer  id;
	private Integer  ano;
	private Integer  semestre;
	private Integer  fkaluno;
	private Integer  fkdisciplina;
	
	public Matricula(Integer id, Integer ano, Integer semestre, Integer fkaluno, Integer fkdisciplina) {
		super();
		this.id = id;
		this.ano = ano;
		this.semestre = semestre;
		this.fkaluno = fkaluno;
		this.fkdisciplina = fkdisciplina;
	}

	public Matricula() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Integer getFkaluno() {
		return fkaluno;
	}

	public void setFkaluno(Integer fkaluno) {
		this.fkaluno = fkaluno;
	}

	public Integer getFkdisciplina() {
		return fkdisciplina;
	}

	public void setFkdisciplina(Integer fkdisciplina) {
		this.fkdisciplina = fkdisciplina;
	}
	
	
	
}
