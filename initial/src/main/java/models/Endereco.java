package models;

public class Endereco {
	private final long id;
	private final String logradouro;
	private final int numero;
	private final String complemento;
	private final String bairro;
	private final String cep;
	private final String cidade;
	private final String uf;
	
	public Endereco(long id, String logradouro, int numero, String complemento, String bairro, String cep,
			String cidade, String uf) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public long getId() {
		return id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}
	
	
}
