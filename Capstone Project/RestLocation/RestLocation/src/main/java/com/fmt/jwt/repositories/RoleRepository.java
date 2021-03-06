package com.fmt.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmt.enums.ERole;
import com.fmt.model.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer>{

	/**
	 * Find user by username
	 * @param username
	 * @return
	 */
	Optional<Roles> findByName(ERole name);
}
