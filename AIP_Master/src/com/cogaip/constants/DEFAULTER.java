package com.cogaip.constants;

public class DEFAULTER {
	public static final String SELECT_AUTO_DEFAULTER = "SELECT * FROM aip_view_defaulter "+
														"WHERE borrower_rating >= 8 "+
														"AND ( accrual_status = 2 " +
																"accrual_status = 3 " +
																"accrual_status = 4 " +
																"accrual_status = 5)";
	
	public static final String SELECT_MANUAL_DEFAULTER = "SELECT * FROM aip_view_defaulter "+
														"WHERE borrower_rating >= 5 "+
														"AND borrower_rating < 8 "+
														"AND ( accrual_status = 1 "+
																"accrual_status = 6 "+
																"accrual_status = 7)";
	
	public static final String SELECT_REDEFAULTER = "SELECT * FROM aip_view_defautler "+
													"WHERE default_status = 'Redefault'";
	
	public static final String SELECT_AUTO_WEAVER = "SELECT * FROM aip_view_defautler "+
													"WHERE default_status = 'Auto Weaver'";
	
	public static final String SELECT_VALIDATE_ERROR = "SELECT * FROM aip_view_defautler "+
														"WHERE default_status = 'Validate Error'";
	
	public static final String SELECT_COMMENT_FOR_DEFAULTER = "SELECT comments, date FROM aip_comment_master "+
																"WHERE user_id = ?";
	
	public static final String UPDATE_DEFAULT_STATUS = "UPDATE aip_user_default_status "+
														"SET default_status_id = ?"+
														"WHERE user_id = ?";
}
