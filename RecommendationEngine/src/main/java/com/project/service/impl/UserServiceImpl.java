package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.UserDTO;
import com.project.model.User;
import com.project.repository.UserRepository;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	public User findUser(String name, String password) {
		
		User emp = userRepository.findByNameAndPassword(name, password);
		return emp;
		
	}

	@Override
	public void registerUser(UserDTO userDTO) {
		
		User emp = new User();
		
		emp.setName(userDTO.getName());
		emp.setPassword(userDTO.getPassword());
		emp.setMobileNumber(userDTO.getMobileNumber());
		emp.setCity(userDTO.getCity());
		emp.setAge(userDTO.getAge());
		
		emp.setEmailid(userDTO.getEmailid());
		
		userRepository.save(emp);
		
	}
}
