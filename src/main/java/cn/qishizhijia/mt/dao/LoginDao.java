package cn.qishizhijia.mt.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.qishizhijia.mt.pojo.LoginInfo;

public interface LoginDao {

	@Select("SELECT * FROM logininfo WHERE liloginname=#{liloginname} LIMIT 1")
	LoginInfo getLoginInfoByLoginName(@Param("liloginname") String liloginname);
	
	
	
}
