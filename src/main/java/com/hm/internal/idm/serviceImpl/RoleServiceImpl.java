package com.hm.internal.idm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hm.internal.idm.dao.RoleRepository;
import com.hm.internal.idm.entity.Role;
import com.hm.internal.idm.service.RoleService;

public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleReo;
	
	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean createRole(Role roleObject) {
		Role role=roleReo.save(roleObject);
		if(role!=null)
			return true;
		else
		return false;
	}

}
