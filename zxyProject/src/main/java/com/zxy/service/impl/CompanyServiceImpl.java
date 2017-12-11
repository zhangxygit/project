package com.zxy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxy.bean.Company;
import com.zxy.dao.CompanyDao;
import com.zxy.service.CompanyService;

/**
 * @Title: CompanyServiceImpl.java
 * @Description:
 * @Company: HeJia
 * @author zhangxiying
 * @date 2017年12月8日 下午12:06:22
 * @version 1.0
 */
@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	/**
	 * 测试事务
	 */
	@Transactional
	public void insert(Company com1, Company com2) {
		companyDao.insert1(com1);
		companyDao.insert2(com2);
	}

}
