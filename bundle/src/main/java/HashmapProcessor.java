package com.opensourcearchitect;

import java.sql.SQLException;

public class HashmapProcessor {
	
	public void store() throws SQLException {
		System.out.println("Inside Hashmap Processor");
		throw new SQLException("FAILED: Error writing to database");
	}
}