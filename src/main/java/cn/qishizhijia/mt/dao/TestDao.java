package cn.qishizhijia.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.qishizhijia.mt.pojo.MtStaff;

public interface TestDao {

	@Select("select * from ms_staff")
	List<MtStaff> queryStaffList();
	
}
