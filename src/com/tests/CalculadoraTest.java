package com.tests;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.beans.Desconto;
import com.beans.Funcionario;
import com.calculation.Calculadora;
import com.model.DescontoDAO;
import com.model.FuncionarioDAO;

public class CalculadoraTest {

	@Test
	public void CalculaDescontoFuncionario() throws SQLException {
		FuncionarioDAO funcDao = new FuncionarioDAO();
		DescontoDAO descDao = new DescontoDAO();
		
		Funcionario func = funcDao.buscaPorId(1);
		List<Desconto> descontos = descDao.buscaPorIdCliente(1);
		
		Calculadora c = new Calculadora();
		c.calcularDescontos(func, descontos);
		System.out.println(func);
		
		assertTrue(func.getValorSalarioFinal() > 0);
	}

}
