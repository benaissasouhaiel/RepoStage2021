package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UserStage;
import com.example.demo.repository.UserRepository;


@Service
public class userservice implements Iuserservice {

	@Autowired
	UserRepository userrep;
	@Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public UserStage loadUserByUsername(String username) {
		
		return userrep.findByUsername(username);
	}
	
	@Override
	public void saveUser(UserStage user) {
		
		
     String hashPW =bCryptPasswordEncoder.encode(user.getPassword());
     user.setPassword(hashPW);
     userrep.save(user);
//     String token = UUID.randomUUID().toString();
//     ConfirmationToken confiramationtoken = new ConfirmationToken(
//    		token,
//    		LocalDateTime.now(),
//    		LocalDateTime.now().plusMinutes(15),
//    		user
//    		
//    		 );
  //   confirmationTokenService.saveConfiramationtoken(confiramationtoken);
     
//     String link = "http://localhost:8085/confirm?token=" + token;
//     emailSender.send(
//    		 user.getEmail(),
//             buildEmail(user.getUsername(), link));    	//return	userrep.save(user);
          return ;

	}

}
