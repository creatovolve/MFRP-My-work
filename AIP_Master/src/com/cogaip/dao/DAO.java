/**
 * 
 */
package com.cogaip.dao;

import java.sql.ResultSet;

/**
 * @author 513080
 *
 */
public interface DAO {
	public int insertRecord();
	public int updateRecord();
	public ResultSet selectRecord();
	public int deleteRecord();	
}
