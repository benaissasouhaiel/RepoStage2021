package com.example.demo.config;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.UserStage;
import com.example.demo.service.Iuserservice;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	Iuserservice iuserservice;
//	@Autowired
//	UserRepository userRepository;
	
	
	
//	@Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = iuserservice.loadUserByUsername(username);
//        if(user==null) throw new UsernameNotFoundException(username);
//        Collection<GrantedAuthority> authorities= new ArrayList<>();
//       user.getRole().forEach(r->{
//           authorities.add(new SimpleGrantedAuthority(r.getRole()));
//        });
//       return  new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),authorities);
//    }




	
	
	
	

	@Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("------->   " + userName);
        UserStage user = iuserservice.loadUserByUsername(userName);
        System.out.println("------->   " + user.getIduser());


        if (user == null) throw new UsernameNotFoundException(userName);
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        user.getRole().forEach(r -> {
//       //     log.info("rolee :{}",r);
//
            authorities.add(new SimpleGrantedAuthority(r.getRole()));
            System.out.println("------->   " + r.getRole());

        });
       System.out.println("--ruser.getUsername()rr----->   " + user.getUsername());
        System.out.println("--getPassword----->   " + user.getPassword());
        System.out.println("--authorities----->   " +authorities);

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }
	
//	
	
//	@Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//		  User user = iuserservice.loadUserByUsername(userName);        
//		  if(user==null) throw new UsernameNotFoundException("invalid user");
//        Collection<GrantedAuthority> authorities=new ArrayList<>();
//        user.getRole().forEach(r->{
//            authorities.add(new SimpleGrantedAuthority(r.getRole()));
//        });
//        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),authorities);
//    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//	Optional<User> user =	userRepository.findByUserName(userName); 
//	
//	user.orElseThrow(()-> new UsernameNotFoundException("Not found :" + userName));
//	
//	return user.map(MyUserDetails::new).get(); 
//	}
//	

}

