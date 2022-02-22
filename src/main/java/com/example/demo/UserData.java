package com.example.demo;

import java.util.*;

public class UserData {
	HashMap<String,String> user;
	
	UserData(){
		user = new HashMap<>();
		user.put("message", "no data found");
	}
	
	UserData(String name,String userid,Integer age,String gender,String nationality){
		user = new HashMap<>();
		user.put("name","aditya dawadikar");
		user.put("userid",userid);
		user.put("age","21");
		user.put("gender","male");
		user.put("nationality","Indian");
	}
	
	public HashMap<String,String> getUserData(){
		return user;
	}
	
	public void SetUserData(String name,String userid,Integer age,String gender,String nationality) {
		user = new HashMap<>();
		user.put("name","aditya dawadikar");
		user.put("userid",userid);
		user.put("age","21");
		user.put("gender","male");
		user.put("nationality","Indian");
	}
	
	public String getUserId() {
		return user.get("userid");
	}
}
