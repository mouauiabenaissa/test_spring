package com.example.overwatchbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.overwatchbackend.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String role);
}
