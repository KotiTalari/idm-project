package com.hm.internal.idm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.internal.idm.entity.Role;
import com.hm.internal.idm.service.RoleService;

@RequestMapping(value="api")
@RestController
public class RoleController {

	@Autowired
	RoleService roleService;
	
	
	@PostMapping(value="/roles")
	public ResponseEntity<Object>  createRole(@RequestBody Role roleObject) {
		ResponseEntity<Object> response=null;
		 Boolean result= roleService.createRole(roleObject);
		 response=new ResponseEntity<Object>("Saved Successfully", HttpStatus.OK);
		 return response;
	}
	
	
}
