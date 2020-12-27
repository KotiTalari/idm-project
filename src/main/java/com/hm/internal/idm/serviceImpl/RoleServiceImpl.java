package com.hm.internal.idm.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.internal.idm.dao.RoleRepository;
import com.hm.internal.idm.dto.RoleDto;
import com.hm.internal.idm.entity.Role;
import com.hm.internal.idm.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleReo;
	

	@Autowired
	RolesMapperService rolesMapperService;
	
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

	@Override
	public Role findByDescription(String description) {
		//Role r = roleReo.findByDescription(description);
		return roleReo.findByDescription(description);
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method 
	return	roleReo.findById((long) id).get();
	}

	public boolean updateRoleByid(int id ,RoleDto roleObject) {
		boolean flag=false;
		 Role obj = rolesMapperService.getRoleObject(roleObject);
		 Optional< Role> objj= roleReo.findById((long) id);
		 
		 if(!objj.isEmpty()) {
			 Role obj2= roleReo.findById((long) id).get();
			 obj2.setName(obj.getName());
			 obj2.setDescription(obj.getDescription());
			 obj2.setPermissions(obj.getPermissions());
			 roleReo.save(obj2);
			 flag=true;
		 }
		return flag;
		 
	}
	

}
