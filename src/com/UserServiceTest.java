package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {
	private UserService userService;
	@BeforeEach
	public void initialize() {
		userService = new UserService();
	}
	
	@AfterEach
	public void destroy() {
		userService = null;
	}

	
	@Test
	void addTest() {
		int size=UserService.users.size();
		userService.addUser("Samar","Samar");
		assertEquals(size+1, UserService.users.size());
	}

}
