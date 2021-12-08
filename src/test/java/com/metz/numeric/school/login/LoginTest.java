package com.metz.numeric.school.login;

import org.junit.Before;
import org.junit.Test;

import com.metz.numeric.school.db.Database;
import com.metz.numeric.school.user.User;

import junit.framework.Assert;

public class LoginTest {

	private Login login;

	@Before
	public void setUp() {
		Database db = new Database();
		this.login = new Login(db);
	}

	@Test
	public void testLogin() {
		User user = login.getLogin("Test", "Test");
		Assert.assertEquals("Stéphane", user.getName());
	}
}
