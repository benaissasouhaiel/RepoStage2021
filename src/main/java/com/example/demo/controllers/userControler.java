package com.example.demo.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.UserStage;
import com.example.demo.service.Iuserservice;



@RestController
public class userControler {
	
     @Autowired
     Iuserservice iuser;

	//http://localhost:8085/register
	@PostMapping("/register")
	    public void register(@RequestBody()  UserStage user ) throws IOException {
	        UserStage user1 = new UserStage();
	       // Role ro=re.findById(idrole).orElse(null);
		//	user.getRole().add(ro);
	        //userrep.addRoleToUser(user1.getUsername(),"USER");
	        
	        //nexmo
//	       NexmoClient client = NexmoClient.builder().apiKey("762cd284").apiSecret("ymrKMgxhEaH9BjBD").build();
//	       
//	      TextMessage message = new TextMessage("Vonage APIs",
//	                "21625303829",
//	               "un nouveau compte utilisateur a ete creer"
//	      );
	//
//	       SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);
	//
//	       if (response.getMessages().get(0).getStatus() == MessageStatus.OK) {
//	           System.out.println("Message sent successfully.");
//	        }
	        iuser.saveUser(user);
	        return;
	       
	    }

}
