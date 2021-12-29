package com.mphasis.vehicleRentalSystem.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.vehicleRentalSystem.dao.UserRepository;
import com.mphasis.vehicleRentalSystem.domain.User;



@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Transactional
	public List<User> fetchUsers() {
		List<User> userList=userRepository.findAll();
		return userList;
		
	}
	@Transactional
	public User saveUser(User user) {
		
		return userRepository.save(user);
		
	}
	@Transactional
	public void updateUser(User user) {
	userRepository.save(user);	
	
	}
	@Transactional
	public void deleteUser(int userId) {
		//empRepository.delete(emp);	
		System.out.println("service method called");
	userRepository.deleteById(userId);
	
	}
	@Transactional 
	  public User getUser(int id) { 
	  Optional<User> optional= userRepository.findById(id);
	  User user=optional.get();
	  return user;
	  

}
	
}
