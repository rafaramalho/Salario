package com.beans;

public class Funcionario implements Comparable<Funcionario> {

	private int id;
	private String nome;
	private double valorSalario;
	private double valorSalarioFinal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getvalorSalario() {
		return valorSalario;
	}
	public void setvalorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}
	
	public double getValorSalarioFinal() {
		return valorSalarioFinal;
	}
	public void setValorSalarioFinal(double valorSalarioFinal) {
		this.valorSalarioFinal = valorSalarioFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorSalarioFinal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(valorSalarioFinal) != Double.doubleToLongBits(other.valorSalarioFinal))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "|Nome= " + nome + "|Salario bruto= " + valorSalario + "|Salario liquido= " + valorSalarioFinal + "|";
	}
	
	@Override
	public int compareTo(Funcionario outroFunc) {
		if(this.getValorSalarioFinal() < outroFunc.getValorSalarioFinal()) {
			return 1;
		}else if(this.getValorSalarioFinal() > outroFunc.getValorSalarioFinal()) {
			return -1;
		}
		
		return 0;
	}
	
}
