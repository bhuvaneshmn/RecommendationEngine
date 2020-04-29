package com.project.service;

import com.project.dto.UserDTO;
import com.project.model.User;

public interface UserService {

	User findUser(String name, String password);

	void registerUser(UserDTO userDTO);

}
