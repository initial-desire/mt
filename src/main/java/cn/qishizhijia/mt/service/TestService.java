package cn.qishizhijia.mt.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.qishizhijia.mt.dao.TestDao;
import cn.qishizhijia.mt.pojo.MtStaff;

@Service
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" })
public class TestService {

	@Autowired
	private TestDao testDao;
	
	public List<MtStaff> test(){
		List<MtStaff> list = testDao.queryStaffList();
		return list;
	}
	
	@Test
	public void ttt(){
		List<MtStaff> list = testDao.queryStaffList();
		for (MtStaff s : list) {
			System.out.println("...@"+s.getStaffName());
		}
		System.out.println(".................");
	}
	
}
