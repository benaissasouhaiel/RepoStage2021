package com.example.demo.service;

import com.example.demo.entities.UserStage;

public interface Iuserservice {
	 public UserStage loadUserByUsername(String username);

	 public void saveUser(UserStage user);

}
