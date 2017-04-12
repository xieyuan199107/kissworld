package com.myHibernate.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.myHibernate.bean.User;
import com.myHibernate.domain.Login;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport{
	private Login login;
	private String msg;
	private User user;
	
	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user = user;
	}
	
	public Login getLogin(){
		return login;
	}
	public void setLogin(Login login){
		this.login = login;
	}
	public String login(){
		//获取用户提交的用户名和密码
		//验证用户提交的用户名和密码
		//成功或失败都设置msg
		//返回页面
		boolean isSuccess = login.login(user);
		if(isSuccess){
			setMsg("登录成功");
		}else{
			setMsg("登录失败");
		}
		return "loginAfter";
	}
}
