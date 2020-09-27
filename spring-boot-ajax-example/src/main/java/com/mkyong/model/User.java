package com.mkyong.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;


@Entity  
//defining class name as Table name  
@Table 

public class User {

    @NotBlank(message = "username can't empty!")
    @Id  
	//defining id as column name  
	@Column 
    String username;
    @Column 
    String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
        this.username = username;
    }
}