package com.example.demo.Dto;

public class UserDto {

	  private String name;
	    private String email;

	    // Constructors
	    public UserDto() {}

	    public UserDto(String name, String email) {
	        this.name = name;
	        this.email = email;
	    }

	    // Getters and Setters
	    public String getName() { return name; }
	    public String getEmail() { return email; }
	    public void setName(String name) { this.name = name; }
	    public void setEmail(String email) { this.email = email; }
}
