package com.praksa.team4.entities.dto;

import javax.persistence.Column;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDTO {
	@Column
	@NotNull(message = "Username must be specified")
    @Size(min = 2, max = 30, message = "User name must be between {min} and {max} characters long.")
	private String username;
	
	@Column
	//@JsonIgnore
	//@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.*[A-Z]).{8,100}$", message = "Password must be at least 8 characters long and contain a lowercase, an upercase letter and a number")
    @NotNull(message = "Password must be specified")
    @Size(min = 8, max = 100, message = "Password must be between {min} and {max} characters long.")
	private String password;
	
	@Column
	@NotNull(message = "Name must be included.")
	@Size(min = 2, max = 30, message = "Name must be between {min} and {max} characters long.")
	private String name;
	
	@Column
	@NotNull(message = "Lastname must be included.")
	@Size(min = 2, max = 30, message = "Lastname must be between {min} and {max} characters long.")
	private String lastname;
	
	@Column
	@NotNull(message = "Email must be included.")
	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
	message="Email is not valid.")
	private String email;
	
	@Column
	private String role;
	
	@Version
	private Integer version;

	public UserDTO() {
		super();
	}

	public UserDTO(
			@NotNull(message = "Username must be specified") @Size(min = 2, max = 30, message = "User name must be between {min} and {max} characters long.") String username,
			@NotNull(message = "Password must be specified") @Size(min = 8, max = 100, message = "Password must be between {min} and {max} characters long.") String password,
			@NotNull(message = "Name must be included.") @Size(min = 2, max = 30, message = "Name must be between {min} and {max} characters long.") String name,
			@NotNull(message = "Lastname must be included.") @Size(min = 2, max = 30, message = "Lastname must be between {min} and {max} characters long.") String lastname,
			@NotNull(message = "Email must be included.") @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Email is not valid.") String email,
			String role, Integer version) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.version = version;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
