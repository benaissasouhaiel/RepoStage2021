package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.UserStage;



@Repository
	public interface UserRepository extends JpaRepository<UserStage, Integer> {

    public UserStage findByUsername(String username);

}
