package com.cogaip.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Defaulter extends DAO {
	// TODO: specify Defaulter Specific DAO methods.
	ResultSet selectAutoDefaulters() throws ClassNotFoundException, SQLException;
	ResultSet selectManualDefaulters() throws ClassNotFoundException, SQLException;
	ResultSet selectCommentsForBorrower(int borrowerId) throws SQLException;
	ResultSet selectReDefaulters() throws ClassNotFoundException, SQLException;
	ResultSet selectValidateErrors() throws ClassNotFoundException, SQLException;
	ResultSet selectAutoWeavers() throws ClassNotFoundException, SQLException;
	int updateDefaultStatusByUserId(int userId, int statusId) throws ClassNotFoundException, SQLException;
}
