package com.zxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxy.bean.Company;

/**
 * @Title: TestController.java
 * @Description:
 * @Company: HeJia
 * @author zhangxiying
 * @date 2017年12月8日 下午2:31:35
 * @version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/aa")
	@ResponseBody
	public Company test() {
		Company com = new Company();
		com.setId_com("test001");
		com.setName_com("测试");
		return com;
	}

}
