package com.calculation;

import java.util.List;

import com.beans.Desconto;
import com.beans.Funcionario;

public class Calculadora {

	public void calcularDescontos(Funcionario funcionario, List<Desconto> descontosFuncionario) {
		double descontoTotal = 0;
		
		for (Desconto desconto : descontosFuncionario) {
			descontoTotal += desconto.getValorDesconto();
		}
		
		double salariofinal = funcionario.getvalorSalario() - descontoTotal;
		funcionario.setValorSalarioFinal(salariofinal);
	}

}