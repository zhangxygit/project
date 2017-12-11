package com.zxy.service;

import com.zxy.bean.Company;

/**
 * @Title: CompanyService.java
 * @Description:
 * @Company: HeJia
 * @author zhangxiying
 * @date 2017年12月8日 下午12:05:26
 * @version 1.0
 */
public interface CompanyService {

	/**
	 * 测试事务
	 * 
	 * @param com1
	 * @param com2
	 */
	public void insert(Company com1, Company com2);
}
