package com.example.overwatchbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.overwatchbackend.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
