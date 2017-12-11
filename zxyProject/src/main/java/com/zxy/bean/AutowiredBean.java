package com.zxy.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Title: AutowiredBean.java
 * @Description:
 * @Company: HeJia
 * @author zhangxiying
 * @date 2017年11月30日 下午3:19:51
 * @version 1.0
 */
@Component
public class AutowiredBean {
	@Autowired
	private ComponentBean componentBean;

	public void testAutowired() {
		System.out.println("componentBean:" + componentBean);
	}

}
