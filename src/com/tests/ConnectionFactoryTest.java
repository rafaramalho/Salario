package com.tests;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.utils.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
    public void testCreateConnection() throws SQLException {
        Connection conn = ConnectionFactory.getInstance().createConnection();
		assertNotNull(conn);
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

}
