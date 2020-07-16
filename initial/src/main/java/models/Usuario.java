package models;

public class Usuario {

	private final long id;
	private final String cpf;
	private final String telefone;
	private final String nome;
	private final String email;
	private final String dataDeNascimento;
	private final String Senha;
	private final Endereco endereco;
	
	public Usuario(long id, String cpf, String telefone, String nome, String email, String dataDeNascimento,
			String senha, Endereco endereco) {
		this.endereco = endereco;
		this.id = id;
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
		Senha = senha;
	}
	public long getId() {
		return id;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public String getSenha() {
		return Senha;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	
}
