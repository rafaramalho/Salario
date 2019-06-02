package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperties {

	public static String driver;
	public static String usuario;
	public static String senha;
	public static String url;
    
	static
	{
 
        Properties properties = new Properties();
        try {
			properties.load(new FileInputStream(new File(new File("").getAbsolutePath() + "/jdbc.properties").getAbsolutePath()));
		} catch (Exception e) {
			System.out.println("Não achou a arquivo de propriedade.");
		}
 
        usuario = properties.getProperty("jdbc.user");
        senha = properties.getProperty("jdbc.pass");
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("jdbc.url");
		
//        System.out.println("Dados da conexao");
//        properties.forEach((k, v) -> System.out.println(k +"="+v));
	}

}
