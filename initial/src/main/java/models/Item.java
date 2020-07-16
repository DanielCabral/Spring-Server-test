package models;

public class Item {
	private final long id;
	private final String descricao;
	private final String foto;
	private final long idCategoria;
	private final String cep;
	private final String tipoDeProduto;
	private final String tipoDeEntrega;
	private final double preco;
	public Item(long id, String descricao, String foto, long idCategoria, String cep, String tipoDeProduto,
			String tipoDeEntrega, double preco) {
		this.id = id;
		this.descricao = descricao;
		this.foto = foto;
		this.idCategoria = idCategoria;
		this.cep = cep;
		this.tipoDeProduto = tipoDeProduto;
		this.tipoDeEntrega = tipoDeEntrega;
		this.preco = preco;
	}
	
	public long getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getFoto() {
		return foto;
	}
	public long getIdCategoria() {
		return idCategoria;
	}
	public String getCep() {
		return cep;
	}
	public String getTipoDeProduto() {
		return tipoDeProduto;
	}
	public String getTipoDeEntrega() {
		return tipoDeEntrega;
	}
	public double getPreco() {
		return preco;
	}
	
	
}
