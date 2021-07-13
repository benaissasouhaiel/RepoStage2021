package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.JwtTokenUtil;
import com.example.demo.entities.JwtRequest;
import com.example.demo.entities.UserStage;
import com.example.demo.service.Iuserservice;



	@RestController
	@CrossOrigin
	public class JwtAuthenticationController {

		@Autowired
		private AuthenticationManager authenticationManager;

		@Autowired
		private JwtTokenUtil jwtTokenUtil;

		@Autowired
		private UserDetailsService userDetailsService;
		
		@Autowired
        Iuserservice userse;

		
		
	    @ResponseBody
		@RequestMapping(value ="/authenticate", method = RequestMethod.POST,
				produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
		public String createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
	System.out.println(authenticationRequest.getUsername());
	System.out.println("a");
	authenticationManager.authenticate(
	        new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
	        final UserStage user = userse.loadUserByUsername(authenticationRequest.getUsername());
	        if (user != null) {
	            final String token = jwtTokenUtil.generateToken(user);
	            
	            
	                  
	            
	            
	            
	            
	            return token ;
	        }

			return null;
		

		}
}
