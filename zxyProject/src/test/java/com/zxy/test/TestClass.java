package com.zxy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zxy.dao.CompanyDao;

/**
 * @Title: TestClass.java
 * @Description:
 * @Company: HeJia
 * @author zhangxiying
 * @date 2017年11月30日 下午2:44:17
 * @version 1.0
 */
public class TestClass {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"spring-context.xml");
		CompanyDao companyDao = (CompanyDao) ac.getBean("companyDaoImpl");
		companyDao.getComName("CM1008-0001,CM1008-0005");
		// Company list = companyDao.getCompanyById("CM1008-0001");
		// // Map<String, Object> map = companyDao.getComName("CM1008-0001");
		// System.out.println("公司名称：");
		// CompanyService companyService = (CompanyService) ac
		// .getBean("companyServiceImpl");
		// Company com1 = new Company();
		// com1.setId_com("test_00006");
		// com1.setName_com("测试公司6");
		// Company com2 = new Company();
		// com2.setId_com("test_00002");
		// com2.setName_com("测试公司2");
		// companyService.insert(com1, com2);
		System.out.println("测试");

	}
}
