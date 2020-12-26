package com.hm.internal.idm.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.internal.idm.dao.PermissionRepository;
import com.hm.internal.idm.dao.RoleRepository;
import com.hm.internal.idm.dao.UserRepository;
import com.hm.internal.idm.entity.Role;
import com.hm.internal.idm.entity.User;
import com.hm.internal.idm.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	RoleRepository roleRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	PermissionRepository permissionRepo;
	
	@Override
	public Object getAllPermission() {
		
      List<Role> users=roleRepo.findAll();
      List<User> roles= userRepo.findAll();
      
      Map<Object, Object> response = new HashMap<>();
      response.put("users", users);
      response.put("roles", roles);
      return response;
	}

	
	@Override
	public Object getAllPermissionByFeature(String feature) {
		
		permissionRepo.findByFeature(feature);
		return null;
	}

}
