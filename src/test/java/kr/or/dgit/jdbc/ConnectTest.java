package kr.or.dgit.jdbc;
import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc.utill.ConnectionFactory;

public class ConnectTest {
	private static Connection connection;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		connection = ConnectionFactory.getConnection();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		connection = null;
	}

	@Test
	public void testConnection() {
		Assert.assertNotNull(connection);
	}
}
