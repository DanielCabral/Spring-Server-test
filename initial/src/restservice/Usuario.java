package com.example.restservice;

public class Usuario {

	private final long id;
	private final int idade;
	private final String curso;
	private final String content;

	public Usuario(long id, String content, int idade, String curso) {
		this.id = id;
		this.content = content;
		this.idade = idade;
		this.curso = curso;
	}

	public int getIdade() {
		return idade;
	}

	public String getCurso() {
		return curso;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
