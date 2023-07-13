package com;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Ivalidate{
	static List<User> users=new ArrayList<User>();

	public void addUser(String userid,String password) {
		users.add(new User(userid,password));
	} 
	@Override
	public boolean IsAuthenticated(String userid, String password) {
		for(User user:users) {
			if(user.getUserId().equals(userid) && user.getPassword().equals(password)) {
				return true;
			}
		} 
		return false;
	}
}
