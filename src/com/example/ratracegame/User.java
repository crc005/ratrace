package com.example.ratracegame;

public class User extends Profession{

	Profession user;
	String name;
	
	User(Profession user) {
		this.user = user;
		this.name = user.getName();
	}
}
