package com.hm.internal.idm.dto;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

public class ResponseObject {

	public Integer code;
	public String  message;
	public Integer applicationErrorCode;
	
	
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getApplicationErrorCode() {
		return applicationErrorCode;
	}
	public void setApplicationErrorCode(Integer applicationErrorCode) {
		this.applicationErrorCode = applicationErrorCode;
	}
	
}
