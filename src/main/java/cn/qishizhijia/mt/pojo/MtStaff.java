package cn.qishizhijia.mt.pojo;

import java.io.Serializable;

public class MtStaff implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3354773151642279309L;

	
	private int staffID;
	private String staffName;
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	
	
}
