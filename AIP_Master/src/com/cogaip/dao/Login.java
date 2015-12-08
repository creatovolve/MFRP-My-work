package com.cogaip.dao;

import java.sql.ResultSet;

public interface Login extends DAO {
	public ResultSet selectRecord(String userName);
}
