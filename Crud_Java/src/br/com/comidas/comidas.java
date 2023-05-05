package br.com.comidas;

import java.sql.Date;

public class comidas {
	private String Nome;
	private Double valor;
	private String Criador;
	private Date data;
	
	public comidas(String Nome,Double valor, String Criador, Date data) {
		this.setNome(Nome);
		this.setValor(valor);
		this.setCriador(Criador);
		this.setData(data);
	}

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
	public String getname() {
		return Nome;
	}
	public  void setNome(String Nome) {
		this.Nome = Nome;
	}
}
