package com.beans;

public class Desconto {

	private int id;
	private int idFuncionario;
	private double valorDesconto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	@Override
	public String toString() {
		return "Desconto [valorDesconto=" + valorDesconto + "]";
	}
	
	
}
