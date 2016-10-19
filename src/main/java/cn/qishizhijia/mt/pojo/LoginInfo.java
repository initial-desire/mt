package cn.qishizhijia.mt.pojo;

import java.io.Serializable;

public class LoginInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int liid;
	private int liuiid;
	private String liloginname;
	private String liloginpass;
	private String linickname;
	private String liavatar;
	private int listate;
	
	public int getLiid() {
		return liid;
	}
	public void setLiid(int liid) {
		this.liid = liid;
	}
	public int getLiuiid() {
		return liuiid;
	}
	public void setLiuiid(int liuiid) {
		this.liuiid = liuiid;
	}
	public String getLiloginname() {
		return liloginname;
	}
	public void setLiloginname(String liloginname) {
		this.liloginname = liloginname;
	}
	public String getLiloginpass() {
		return liloginpass;
	}
	public void setLiloginpass(String liloginpass) {
		this.liloginpass = liloginpass;
	}
	public String getLinickname() {
		return linickname;
	}
	public void setLinickname(String linickname) {
		this.linickname = linickname;
	}
	public String getLiavatar() {
		return liavatar;
	}
	public void setLiavatar(String liavatar) {
		this.liavatar = liavatar;
	}
	public int getListate() {
		return listate;
	}
	public void setListate(int listate) {
		this.listate = listate;
	}
	
	
	
}
