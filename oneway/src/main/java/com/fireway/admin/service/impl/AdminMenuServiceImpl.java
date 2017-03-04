package com.fireway.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fireway.admin.service.AdminMenuService;
import com.fireway.base.BasePageDTO;
import com.fireway.dao.AdminMenuMapper;
import com.fireway.domain.AdminMenu;

@Service("adminMenuService")
public class AdminMenuServiceImpl implements AdminMenuService {

	@Resource
	private AdminMenuMapper adminMenuMapper;

	@Override
	public void save(AdminMenu record) {
		adminMenuMapper.insert(record);
	}

	@Override
	public void deleteById(String id) {
		adminMenuMapper.deleteByPrimaryKey(id);
	}


	@Override
	public void updateSelectById(AdminMenu record) {
		adminMenuMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<AdminMenu> findAll() {
		
		return adminMenuMapper.findAll();
	}

	@Override
	public List<AdminMenu> findByPage(BasePageDTO pageDTO) {
		return null;
	}

	@Override
	public AdminMenu findById(String id) {
		
		return adminMenuMapper.selectByPrimaryKey(id);
	}

	
	
}
