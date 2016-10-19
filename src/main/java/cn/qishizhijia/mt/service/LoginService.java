package cn.qishizhijia.mt.service;

public interface LoginService {

	/**
	 * 用户登录
	 * @param loginname
	 * @param loginpass
	 * @return
	 */
	public String userLogin(String loginname, String loginpass);
	
}
