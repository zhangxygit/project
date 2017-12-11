package com.zxy.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zxy.bean.Company;
import com.zxy.dao.CompanyDao;

/**
 * @Title: CompanyDaoImpl.java
 * @Description:
 * @Company: HeJia
 * @author zhangxiying
 * @date 2017年12月8日 上午10:35:59
 * @version 1.0
 */
@Repository
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Map<String, Object> getComName(String comId) {
		String sql = "select name_com from ctlm1001 where id_com in(?)";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql,
				new Object[] { comId });
		String sql2 = "select name_com from ctlm1001 where id_com = ?";
		return jdbcTemplate.queryForMap(sql2, new Object[] { comId });
	}

	public Company getCompanyById(String comId) {
		String sql = "select * from ctlm1001 where id_com=?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(
				Company.class), new Object[] { comId });
		// return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(
		// Company.class), new Object[] { comId });

	}

	public void insert1(Company company) {
		String sql = "insert into ctlm1001 (id_com, name_com) values (?, ?)";
		jdbcTemplate.update(sql,
				new Object[] { company.getId_com(), company.getName_com() });

	}

	public void insert2(Company company) {
		String sql = "insert into ctlm1001 (id_com, name_com) values (?, ?)";
		jdbcTemplate.update(sql,
				new Object[] { company.getId_com(), company.getName_com() });

	}

}
