package br.com.comidas;

import java.sql.Date;

public class comidas {
	// variaveis
	private String Nome;
	private Double valor;
	private String Criador;
	private Date data;
	private int ID;
	
	//Construtor do aobjeto Comida
	public comidas(String Nome,Double valor, String Criador) {
		this.setNome(Nome);
		this.setValor(valor);
		this.setCriador(Criador);
	}
	
	// Métodos Get e Set das variaveis

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getCriador() {
		return Criador;
	}

	public void setCriador(String criador) {
		Criador = criador;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	public String getNome() {
		return Nome;
	}
	public  void setNome(String Nome) {
		this.Nome = Nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
