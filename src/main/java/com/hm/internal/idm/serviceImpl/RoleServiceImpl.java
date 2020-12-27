package com.hm.internal.idm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.internal.idm.dao.RoleRepository;
import com.hm.internal.idm.entity.Role;
import com.hm.internal.idm.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleReo;
	
	@Override
	public List<Role> getAllRoles() {
		return roleReo.findAll();
	}

	@Override
	public Boolean createRole(Role roleObject) {
		Role role=roleReo.save(roleObject);
		if(role!=null)
			return true;
		else
		return false;
	}

	@Override
	public Boolean deleteRole(int id) {
		roleReo.deleteById((long) id);
		return true;
	}

	

}
