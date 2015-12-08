package com.cogaip.dao;

import java.sql.ResultSet;

public interface Login extends DAO {
	//overridden the parent interface method
	public ResultSet selectRecord(String userName);
}
