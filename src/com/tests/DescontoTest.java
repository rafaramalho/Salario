package com.tests;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.beans.Desconto;
import com.model.DescontoDAO;

public class DescontoTest {

	@Test
	public void BuscaDescontoPorIdClienteTest() throws SQLException {
		DescontoDAO descDao = new DescontoDAO();
		List<Desconto> descontos = descDao.buscaPorIdCliente(1);
		descontos.forEach((Desconto) -> System.out.println(Desconto));
		assertNotNull(descontos);
	}

}
