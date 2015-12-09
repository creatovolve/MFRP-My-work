package com.cogaip.model;

public class DefaulterTO extends BorrowerTO {
	private String defaultStatus;
	private int daysPastDue;
	private String comments;
	public DefaulterTO() {
		super();
	}
	/**
	 * @param defaultStatus
	 * @param daysPastDue
	 */
	public DefaulterTO(String defaultStatus, int daysPastDue, String comments) {
		super();
		this.defaultStatus = defaultStatus;
		this.daysPastDue = daysPastDue;
		this.comments = comments;
	}
	/**
	 * @return the defaultStatus
	 */
	public String getDefaultStatus() {
		return defaultStatus;
	}
	/**
	 * @param defaultStatus the defaultStatus to set
	 */
	public void setDefaultStatus(String defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	/**
	 * @return the daysPastDue
	 */
	public int getDaysPastDue() {
		return daysPastDue;
	}
	/**
	 * @param daysPastDue the daysPastDue to set
	 */
	public void setDaysPastDue(int daysPastDue) {
		this.daysPastDue = daysPastDue;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
