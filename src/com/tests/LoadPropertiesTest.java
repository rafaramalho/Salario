package com.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utils.LoadProperties;

public class LoadPropertiesTest {

	@Test
	public void PropertiesJDBCTest() {
		assertNotNull(LoadProperties.url);
		assertNotNull(LoadProperties.driver);
		assertNotNull(LoadProperties.usuario);
		assertNotNull(LoadProperties.senha);
	}

}
