package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findById(int id);
	public void deleteById(int id);
}