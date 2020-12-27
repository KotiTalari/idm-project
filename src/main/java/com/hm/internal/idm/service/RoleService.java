package com.hm.internal.idm.service;

import java.util.List;

import com.hm.internal.idm.dto.RoleDto;
import com.hm.internal.idm.entity.Role;

public interface RoleService {

	
	public List<Role> getAllRoles();
	public Boolean createRole(Role roleObject);
	public Boolean deleteRole(int id);
	public Role findByDescription(String description);
	public Role findById(int id);
	public boolean updateRoleByid(int id ,RoleDto roleObject);
	
	
}
