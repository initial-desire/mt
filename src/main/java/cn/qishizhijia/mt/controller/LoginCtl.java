package cn.qishizhijia.mt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qishizhijia.mt.service.LoginService;

@Controller
public class LoginCtl {

	@Autowired 
	private LoginService loginService;
	
	public @ResponseBody String userLogin(String loginname, String loginpass){
		String info = loginService.userLogin(loginname, loginpass);
		return info;
	}
	
}
