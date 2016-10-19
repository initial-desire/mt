package cn.qishizhijia.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.qishizhijia.mt.pojo.MtStaff;

public interface TestDao {

	@Select("select * from ms_staff")
	List<MtStaff> queryStaffList();

	@Insert("update ms_staff set staffName = 'test' where staffId = 67")
	public int update();
}
