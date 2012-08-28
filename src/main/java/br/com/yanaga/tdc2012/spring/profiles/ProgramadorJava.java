package br.com.yanaga.tdc2012.spring.profiles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProgramadorJava {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	public ProgramadorJava() {
	}

	public ProgramadorJava(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
