package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionFactory {

	private static ConnectionFactory instance;
	
	public Connection createConnection() throws SQLException{
		
		try {
			Class.forName(LoadProperties.driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado!" + e);
		}
		
        return DriverManager.getConnection(LoadProperties.url, LoadProperties.usuario, LoadProperties.senha);
	}
	
	public static ConnectionFactory getInstance() {
        if (instance == null) {
            instance = new ConnectionFactory();
        }
        return instance;
    }
	
}
