package com.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.beans.Desconto;
import com.beans.Funcionario;
import com.calculation.Calculadora;
import com.model.DescontoDAO;
import com.model.FuncionarioDAO;

public class Controller {

	public static List<Funcionario> listaFuncionarios(){
		FuncionarioDAO funcDao = new FuncionarioDAO();
		DescontoDAO descontoDao = new DescontoDAO();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		try {
			
			for (Funcionario funcionario : funcDao.buscaTodos()) {
				
				// Busca descontos por funcionario
				List<Desconto> descontosFuncionario = descontoDao.buscaPorIdCliente(funcionario.getId());
				
				
				// Calcula descontos
				Calculadora calculadora = new Calculadora();
				calculadora.calcularDescontos(funcionario, descontosFuncionario);
				
				funcionarios.add(funcionario);
			}
			
		}catch (Exception e) {
			System.out.println("Erro:" + e.getCause());
            e.printStackTrace();
		}
		
		Collections.sort(funcionarios);
		return funcionarios;
	}
	
}
