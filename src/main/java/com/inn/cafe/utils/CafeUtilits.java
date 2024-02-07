// Spring Project By Soham//
package com.inn.cafe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtilits {
	
	private CafeUtilits() {
		
	}

	public static  ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus) {
		return new ResponseEntity<String>("{\"message\":\""+ responseMessage +"\"}", httpStatus);
	}
}
