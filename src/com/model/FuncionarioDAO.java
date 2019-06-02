package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Funcionario;
import com.utils.ConnectionFactory;

public class FuncionarioDAO {

	private Connection conn;
	private PreparedStatement pstm;
	private ResultSet resultSet;
	
	private final String SELECT=" SELECT * FROM FUNCIONARIO ";
	private final String SELECT_ID =" SELECT * FROM FUNCIONARIO WHERE ID_CLIENTE = ?";
	
	public List<Funcionario> buscaTodos() throws SQLException{
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		conn = ConnectionFactory.getInstance().createConnection();
		pstm = conn.prepareStatement(SELECT);
		resultSet = pstm.executeQuery();
		try {			
			while(resultSet.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setId(resultSet.getInt("id_cliente"));
				funcionario.setNome(resultSet.getString("nm_cliente"));
				funcionario.setvalorSalario(resultSet.getDouble("vl_salario_bruto"));
				
				funcionarios.add(funcionario);
			}
	
		} catch (Exception e) {
			System.err.println("Ocorreu um erro, causa:"+e.getMessage());
			e.printStackTrace();
		}finally{
			conn.close();
		}
		
		return funcionarios;
		
	}

	public Funcionario buscaPorId(int id) throws SQLException {

		conn = ConnectionFactory.getInstance().createConnection();
		pstm = conn.prepareStatement(SELECT_ID);
		pstm.setInt(1, id);
		resultSet = pstm.executeQuery();
		Funcionario funcionario = new Funcionario();
		
		if(resultSet.next()) {
			funcionario.setId(resultSet.getInt("id_cliente"));
			funcionario.setNome(resultSet.getString("nm_cliente"));
			funcionario.setvalorSalario(resultSet.getDouble("vl_salario_bruto"));
		}
		
		return funcionario;
	}
}
