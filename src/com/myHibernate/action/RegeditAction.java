package com.myHibernate.action;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.myHibernate.bean.User;
import com.myHibernate.domain.Regedit;
import com.myHibernate.domain.impl.RegeditImpl;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("regeditAction")
@Scope("prototype")
public class RegeditAction extends ActionSupport{
	private Regedit regedit;
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
	
	public void setRegedit(Regedit regedit){
		this.regedit = regedit;
	}
	
	public Regedit getRegedit(){
		return regedit;
	}
	
	public String reg(){
		//请求数据库将user数据存储到数据库中
		//存储成功或失败都设置msg的值
		//最后返回页面
		try{
			regedit.saveUser(user);
			setMsg("注册成功");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			setMsg("注册失败");
		}
		return "regAfter";
	}
}
