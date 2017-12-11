package com.zxy.dao;

import java.util.Map;

import com.zxy.bean.Company;

/**
 * @Title: CompanyDao.java
 * @Description:
 * @Company: HeJia
 * @author zhangxiying
 * @date 2017年12月8日 上午10:35:06
 * @version 1.0
 */
public interface CompanyDao {

	public Map<String, Object> getComName(String comId);

	public Company getCompanyById(String comId);

	public void insert1(Company company);

	public void insert2(Company company);

}
