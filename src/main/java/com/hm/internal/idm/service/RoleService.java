package com.hm.internal.idm.service;

import java.util.List;

import com.hm.internal.idm.entity.Role;

public interface RoleService {

	
	public List<Role> getAllRoles();
	public Boolean createRole(Role roleObject);
}
