package com.GymBackend_TEST.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.GymBackend_TEST.entity.Cart;
import com.GymBackend_TEST.entity.User;

public interface CartDao extends CrudRepository<Cart, Integer>
{
	public List<Cart> findByUser(User user);

}
