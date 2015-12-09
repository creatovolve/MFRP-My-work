package com.cogaip.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cogaip.constants.DEFAULTER;
import com.cogaip.util.DBUtil;

public class DefaulterDAO implements Defaulter {
	
	private Connection con;
	private PreparedStatement psAutoDefaulter;
	private PreparedStatement psManualDefaulter;
	private PreparedStatement psReDefaulter;
	private PreparedStatement psAutoWeaver;
	private PreparedStatement psValidateError;
	private PreparedStatement psComment;
	private PreparedStatement psUpdateDefaultStatus;
	
	public int insertRecord() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateRecord() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ResultSet selectRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteRecord() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet selectCommentsForBorrower(int borrowerId) throws SQLException {
		// TODO Auto-generated method stub
		String query = DEFAULTER.SELECT_COMMENT_FOR_DEFAULTER;
		psComment = con.prepareStatement(query);
		psComment.setInt(1, borrowerId);
		return psComment.executeQuery();
	}

	@Override
	public ResultSet selectAutoDefaulters() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtil.openConnection();
		String query = DEFAULTER.SELECT_AUTO_DEFAULTER;
		psAutoDefaulter = con.prepareStatement(query);
		return psAutoDefaulter.executeQuery();
	}

	@Override
	public ResultSet selectManualDefaulters() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		con = DBUtil.openConnection();
		String query = DEFAULTER.SELECT_MANUAL_DEFAULTER;
		psManualDefaulter = con.prepareStatement(query);
		return psManualDefaulter.executeQuery();
	}

	@Override
	public ResultSet selectReDefaulters() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtil.openConnection();
		String query = DEFAULTER.SELECT_REDEFAULTER;
		psReDefaulter = con.prepareStatement(query);
		return psReDefaulter.executeQuery();
	}

	@Override
	public ResultSet selectValidateErrors() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtil.openConnection();
		String query = DEFAULTER.SELECT_VALIDATE_ERROR;
		psValidateError = con.prepareStatement(query);
		return psValidateError.executeQuery();
	}

	@Override
	public ResultSet selectAutoWeavers() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtil.openConnection();
		String query = DEFAULTER.SELECT_AUTO_WEAVER;
		psAutoWeaver = con.prepareStatement(query);
		return psAutoWeaver.executeQuery();
	}

	@Override
	public int updateDefaultStatusByUserId(int userId, int statusId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = DBUtil.openConnection();
		String query = DEFAULTER.UPDATE_DEFAULT_STATUS;
		psUpdateDefaultStatus = con.prepareStatement(query);
		psUpdateDefaultStatus.setInt(1, userId);
		return psUpdateDefaultStatus.executeUpdate();
	}
	
}
