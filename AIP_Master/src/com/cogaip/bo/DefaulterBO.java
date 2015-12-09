package com.cogaip.bo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cogaip.dao.DefaulterDAO;
import com.cogaip.model.DefaulterTO;
import com.cogaip.dao.Defaulter;

public class DefaulterBO {

	private Defaulter defaulter = new DefaulterDAO();

	public List<DefaulterTO> selectAutoDefaulters() {
		// TODO Auto-generated method stub
		List<DefaulterTO> autoDefaulterList = new ArrayList<DefaulterTO>();
		ResultSet resultSet = null;
		DefaulterTO defaulterTO = null;

		/*
		 * String firstName = ""; String lastName = ""; int borrowerRating = 0;
		 * int accrualStatus = 0; String ifscCode = ""; long accountNumber = 0;
		 * String defaultStatus = ""; int daysPastDue = 0;
		 */
		
		try {
			resultSet = defaulter.selectAutoDefaulters();
			while (resultSet.next()) {
				defaulterTO = constructDefaulterTO(resultSet);
				autoDefaulterList.add(defaulterTO);
			}
			System.out.println("List Size: " + autoDefaulterList.size());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("ClassNotFoundException");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("SQLException");
		}
		return autoDefaulterList;
	}

	public List<DefaulterTO> selectManualDefaulters() {
		// TODO Auto-generated method stub
		List<DefaulterTO> manualDefaulterList = new ArrayList<DefaulterTO>();
		ResultSet resultSet = null;
		DefaulterTO defaulterTO = null;

		/*
		 * String firstName = ""; String lastName = ""; int borrowerRating = 0;
		 * int accrualStatus = 0; String ifscCode = ""; long accountNumber = 0;
		 * String defaultStatus = ""; int daysPastDue = 0;
		 */

		try {
			resultSet = defaulter.selectManualDefaulters();
			while (resultSet.next()) {
				defaulterTO = constructDefaulterTO(resultSet);
				manualDefaulterList.add(defaulterTO);
			}
			System.out.println("List Size: " + manualDefaulterList.size());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("ClassNotFoundException");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("SQLException");
		}
		return manualDefaulterList;
	}

	public List<DefaulterTO> selectRedefaulters() {
		// TODO Auto-generated method stub
		List<DefaulterTO> reDefaulterList = new ArrayList<DefaulterTO>();
		ResultSet resultSet = null;
		DefaulterTO defaulterTO = null;

		/*
		 * String firstName = ""; String lastName = ""; int borrowerRating = 0;
		 * int accrualStatus = 0; String ifscCode = ""; long accountNumber = 0;
		 * String defaultStatus = ""; int daysPastDue = 0;
		 */
		
		try {
			resultSet = defaulter.selectReDefaulters();
			while (resultSet.next()) {
				defaulterTO = constructDefaulterTO(resultSet);
				reDefaulterList.add(defaulterTO);
			}
			System.out.println("List Size: " + reDefaulterList.size());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("ClassNotFoundException");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("SQLException");
		}
		return reDefaulterList;
	}

	public List<DefaulterTO> selectAutoWeavers() {
		// TODO Auto-generated method stub
		List<DefaulterTO> autoWeaverList = new ArrayList<DefaulterTO>();
		ResultSet resultSet = null;
		DefaulterTO defaulterTO = null;

		/*
		 * String firstName = ""; String lastName = ""; int borrowerRating = 0;
		 * int accrualStatus = 0; String ifscCode = ""; long accountNumber = 0;
		 * String defaultStatus = ""; int daysPastDue = 0;
		 */
		
		try {
			resultSet = defaulter.selectAutoWeavers();
			while (resultSet.next()) {
				defaulterTO = constructDefaulterTO(resultSet);
				autoWeaverList.add(defaulterTO);
			}
			System.out.println("List Size: " + autoWeaverList.size());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("ClassNotFoundException");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("SQLException");
		}
		return autoWeaverList;
	}

	public List<DefaulterTO> selectValidateErrors() {
		// TODO Auto-generated method stub
		List<DefaulterTO> validateErrorList = new ArrayList<DefaulterTO>();
		ResultSet resultSet = null;
		DefaulterTO defaulterTO = null;

		/*
		 * String firstName = ""; String lastName = ""; int borrowerRating = 0;
		 * int accrualStatus = 0; String ifscCode = ""; long accountNumber = 0;
		 * String defaultStatus = ""; int daysPastDue = 0;
		 */

		try {
			resultSet = defaulter.selectValidateErrors();
			while (resultSet.next()) {
				defaulterTO = constructDefaulterTO(resultSet);
				validateErrorList.add(defaulterTO);
			}
			System.out.println("List Size: " + validateErrorList.size());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("ClassNotFoundException");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("SQLException");
		}
		return validateErrorList;
	}
	
	private DefaulterTO constructDefaulterTO(ResultSet resultSet) throws SQLException {
		String adminComments = "";
		
		DefaulterTO defaulterTO = new DefaulterTO();

		defaulterTO.setFirstName(resultSet.getString("first_name"));
		defaulterTO.setLastName(resultSet.getString("last_name"));
		defaulterTO.setBorrowerRating(resultSet
				.getInt("borrower_rating"));
		defaulterTO
				.setAccrualStatus(resultSet.getInt("accrual_status"));
		defaulterTO.setIfscCode(resultSet.getString("ifsc_code"));
		defaulterTO
				.setAccountNumber(resultSet.getInt("account_number"));
		defaulterTO.setDefaultStatus(resultSet
				.getString("default_status"));
		defaulterTO.setDaysPastDue(resultSet.getInt("days_past_due"));

		ResultSet comments = defaulter
				.selectCommentsForBorrower(resultSet.getInt("user_id"));
		while (comments.next()) {
			adminComments += comments.getString("date") + ": "
					+ comments.getString("comments") + "<br>\n";
		}
		defaulterTO.setComments(adminComments);
		
		return defaulterTO;		
	}
	

	public int updateDefaultStatusByUserId(int[][] userStatus) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int updateCount=0;
		for (int i = 0; i < userStatus.length; i++) {
			 if(defaulter.updateDefaultStatusByUserId(userStatus[i][0], userStatus[i][1]) > 0) {
				 updateCount++; 
			 }
		}
		return updateCount;
	}
}
