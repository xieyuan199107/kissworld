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
		//��ȡ�û��ύ���û���������
		//��֤�û��ύ���û���������
		//�ɹ���ʧ�ܶ�����msg
		//����ҳ��
		boolean isSuccess = login.login(user);
		if(isSuccess){
			setMsg("��¼�ɹ�");
		}else{
			setMsg("��¼ʧ��");
		}
		return "loginAfter";
	}
}
