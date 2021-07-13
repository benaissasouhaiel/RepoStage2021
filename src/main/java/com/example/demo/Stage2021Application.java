package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.Iuserservice;



@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@ComponentScan
@SpringBootApplication
(exclude = { SecurityAutoConfiguration.class })
public class Stage2021Application {
	@Autowired
	Iuserservice accountService;
	public static void main(String[] args) {
		SpringApplication.run(Stage2021Application.class, args);
	}
	
	@Bean
	// public void run(String... arg0) throws Exception{
 CommandLineRunner start(Iuserservice accountService){
      return args->{
		      
	 
	     // accountService.saveUser(new User(null,"admin", null, null, "1234", 1, 1, "a", null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
	     //   accountService.saveUser(new User(null,"user", null, null, "1234", 1, 1, "a", null, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null));

		  //   accountService.save(new Role("USER"));
         //   accountService.save(new Role("ADMIN"));
////	            Stream.of("user1","user2","user3","admin").forEach(un->{
////	                accountService.ajouterUser(un,"1234","1234");
////	            });
	           // accountService.addRoleToUser("admin","ADMIN");
        };
	    
	 }
	
    
	@Bean
	public  BCryptPasswordEncoder  getBCPE(){
		return new BCryptPasswordEncoder();
	}
//	@Bean
//	public  BCryptPasswordEncoder  getBCPE(){
//		return new BCryptPasswordEncoder();
//	}
}
