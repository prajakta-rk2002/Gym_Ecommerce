package com.GymBackend_TEST.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GymBackend_TEST.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String> 
{
	
	public User findByUserName(String userName);
}