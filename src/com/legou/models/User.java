package com.legou.models;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	
	@Size(min=6,max=12,message="用户名长度必须在6-12之间！")
	@Pattern(regexp="[a-zA-Z0-9]{6,12}",message="用户名格式不正确！")
	private String username;
	@Size(min=6,max=12,message="密码长度必须在6-12之间！")
	private String password;
	private String phone;
	@Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",message="邮件格式错误！")
	private String email;
	private String address;
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
