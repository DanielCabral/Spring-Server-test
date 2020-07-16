package models;

import java.util.Date;

public class Aluguel {
	private final long id;
	private final long idItem;
	private final long idLocatario;
	private final String idLocador;
	private final Date dataInicial;
	private final String dataFinal;
	private final String status;
	
	public Aluguel(long id, long idItem, long idLocatario, String idLocador, Date dataInicial, String dataFinal,
			String status) {
		this.id = id;
		this.idItem = idItem;
		this.idLocatario = idLocatario;
		this.idLocador = idLocador;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.status = status;
	}
	
	public long getId() {
		return id;
	}
	public long getIdItem() {
		return idItem;
	}
	public long getIdLocatario() {
		return idLocatario;
	}
	public String getIdLocador() {
		return idLocador;
	}
	public Date getDataInicial() {
		return dataInicial;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public String getStatus() {
		return status;
	}
	
	
	
}
