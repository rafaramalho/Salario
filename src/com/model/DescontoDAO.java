package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Desconto;
import com.utils.ConnectionFactory;

public class DescontoDAO {

	private Connection conn;
	private PreparedStatement pstm;
	private ResultSet resultSet;
	
	private final String SELECT_BY_ID_CLIENTE =" SELECT * FROM DESCONTOS WHERE ID_CLIENTE = ?";
	
	public List<Desconto> buscaPorIdCliente(int idCliente) throws SQLException{
		List<Desconto> descontos = new ArrayList<Desconto>();
		conn = ConnectionFactory.getInstance().createConnection();
		pstm = conn.prepareStatement(SELECT_BY_ID_CLIENTE);
		pstm.setInt(1, idCliente);
		resultSet = pstm.executeQuery();
		try {			
			while(resultSet.next()){
				Desconto desconto = new Desconto();
				desconto.setId(resultSet.getInt("id_desconto"));
				desconto.setIdFuncionario(resultSet.getInt("id_cliente"));
				desconto.setValorDesconto(resultSet.getDouble("vl_desconto"));
				descontos.add(desconto);
			}
	
		} catch (Exception e) {
			System.err.println("Ocorreu um erro, causa:"+e.getMessage());
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
		return descontos;
		
	}

}
