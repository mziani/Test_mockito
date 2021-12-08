package com.metz.numeric.school.login;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.metz.numeric.school.db.Database;
import com.metz.numeric.school.user.User;

import junit.framework.Assert;

public class LoginTestMockito {

	// private Login login;
	private Login loginSpy;

	@Before
	public void setUp() {
		// Mock de la db ..
		// Database db = Mockito.mock(Database.class);
		// Spy ..
		Database dbSpy = Mockito.spy(Database.class);
		// Mockito.when(db.getUser("TEST", "TEST")).thenReturn(new User("TEST",
		// "TEST"));
		Mockito.when(dbSpy.getUser("TEST", "TEST")).thenReturn(new User("TEST", "TEST"));
		// this.login = new Login(db);
		this.loginSpy = new Login(dbSpy);
	}

//	@Test
//	public void testGetLogin() {
//		User user = login.getLogin("TEST", "TEST");
//		Assert.assertEquals("TEST", user.getName());
//	}

	@Test
	public void testGetLoginWithSpy() {
		User user = loginSpy.getLogin("TEST", "TEST");
		Assert.assertEquals("TEST", user.getName());
	}

	@Test
	public void testGetAdmin() {
		User user = loginSpy.getAdmin(); // Récupère bien ce qu'envoie la DAO ..
		Assert.assertEquals("ADMIN", user.getName());
	}

}
