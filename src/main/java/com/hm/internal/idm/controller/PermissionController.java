package com.hm.internal.idm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="api")
public class PermissionController {
	
	

	@GetMapping(value="/permission")
	public String getAllPermissions() {
		return "Welcome IDM";
	}
}
