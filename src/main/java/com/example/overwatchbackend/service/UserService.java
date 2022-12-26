package com.example.overwatchbackend.service;

import java.util.List;

import com.example.overwatchbackend.domain.Role;
import com.example.overwatchbackend.domain.User;

public interface UserService {
	User saveUser(User user);

	Role saveRole(Role role);

	User getUser(String username);

	List<User> getUsers();
}
