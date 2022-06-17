package com.gee.klient.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gee.klient.models.Credential;
import com.gee.klient.models.app.StandardResponse;

@RestController
public class Login {
	
	@PostMapping("login")
	public StandardResponse login(@RequestBody Credential loginrequest) {
		
		loginrequest
		return null;
		
	}
}
