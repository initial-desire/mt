package cn.qishizhijia.mt.service.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qishizhijia.mt.dao.LoginDao;
import cn.qishizhijia.mt.pojo.LoginInfo;
import cn.qishizhijia.mt.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public String userLogin(String loginname, String loginpass) {
		LoginInfo userLogin = loginDao.getLoginInfoByLoginName(loginname);
		Map<String, String> resultMap = new HashMap<String, String>();
		if(userLogin!=null){
			if(loginpass.equals(userLogin.getLiloginpass())){
				resultMap.put("result", "登录成功");
			}else{
				resultMap.put("result", "用户名和密码不匹配");
			}
		}else{
			resultMap.put("result", "用户名不存在");
		}
		return resultMap.toString();
	}

}
