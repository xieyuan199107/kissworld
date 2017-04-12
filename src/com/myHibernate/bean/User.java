package com.myHibernate.bean;

import java.io.Serializable;

public class User implements Serializable{ 
	private Long id;
	private String  username;
	private String password;
	private String email;
	private String telephone;
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getTelephone(){
		return telephone;
	}
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	
	public User(){
		super();
	}
	
	public User(String username,String password,String email,String telephone){
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.telephone= telephone;
	}
}
