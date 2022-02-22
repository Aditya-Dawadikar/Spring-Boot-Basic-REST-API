package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	ArrayList<UserData> users = new ArrayList<>();
	
	void populateUsers() {
		users.add(new UserData("Aditya","100",21,"male","Indian"));
		users.add(new UserData("Ethan","101",23,"male","Cuban"));
		users.add(new UserData("Amy","102",33,"female","Canadian"));
		users.add(new UserData("Azhar","103",18,"male","Iran"));
		users.add(new UserData("Liu","104",27,"female","Mongolia"));
	}
	
	UserController(){
		populateUsers();
	}
	
	@GetMapping(path="/details")
	public ArrayList<UserData> getAllUsers() {
		return users;
	}
	
	@GetMapping(path="/details/{userid}")
	public UserData getUserById(@PathVariable("userid") String id){
		for(UserData user:users) {
			if(user.getUserId().equals(id)) {
				return user;
			}
		}
		return new UserData();
	}
}
