package com.fmt.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmt.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	/**
	 * Find user by username
	 * @param username
	 * @return
	 */
	Optional<Users> findByUsername(String username);
	/**
	 * Check exist an user by username
	 * @param username
	 * @return
	 */
	Boolean existByUsername(String username);
	/**
	 * Check exist an user email
	 * @param username
	 * @return
	 */
	Boolean existByEmail(String email);
}
