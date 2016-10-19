package cn.qishizhijia.mt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qishizhijia.mt.pojo.MtStaff;
import cn.qishizhijia.mt.service.Impl.TestService;

@Controller
public class TestCtl {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="mytest/getTest.htmls", method=RequestMethod.GET)
	public @ResponseBody List<MtStaff> test(){
		System.out.println("...");
		return testService.test();
	}
	
}
