package com.fmt.model;

import java.util.HashSet;
import java.util.Set;
import com.fmt.model.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Users", uniqueConstraints = {@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email")})
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String passwords;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Users_Roles", joinColumns = @JoinColumn(name = "u_id"),
			inverseJoinColumns = @JoinColumn(name = "r_id"))
	private Set<Roles> roles = new HashSet<>();

	public Users() {
		super();
	}

	public Users(String username, String email, String passwords) {
		super();
		this.username = username;
		this.email = email;
		this.passwords = passwords;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}  
	
	
	
}
