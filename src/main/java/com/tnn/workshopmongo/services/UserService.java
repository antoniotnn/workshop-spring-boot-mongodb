package com.tnn.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnn.workshopmongo.domain.User;
import com.tnn.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
