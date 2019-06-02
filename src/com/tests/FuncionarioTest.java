package com.tests;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.beans.Funcionario;
import com.model.FuncionarioDAO;

public class FuncionarioTest {

	@Test
	public void BuscaTodosFuncionariosTest() throws SQLException {
		FuncionarioDAO func = new FuncionarioDAO();
		List<Funcionario> funcionarios = func.buscaTodos();
		funcionarios.forEach((Funcionario) -> System.out.println(Funcionario));
		assertNotNull(funcionarios);
	}

	@Test
	public void BuscaFuncionarioPorIdTest() throws SQLException {
		FuncionarioDAO funcDao = new FuncionarioDAO();
		Funcionario func = funcDao.buscaPorId(1);
		System.out.println("Busca por ID:"+ func);
		assertNotNull(func);
	}

}
