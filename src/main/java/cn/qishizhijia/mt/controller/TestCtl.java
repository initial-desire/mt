package cn.qishizhijia.mt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qishizhijia.mt.pojo.MtStaff;
import cn.qishizhijia.mt.service.TestService;

@Controller
public class TestCtl {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="mytest/{ttt}")
	public @ResponseBody List<MtStaff> test(){
		return testService.test();
	}
	
}
