package com.metz.numeric.school.db;

import com.metz.numeric.school.user.User;

public class Database {

	// simulation accès db.

	public User getUser(String loginId, String pwd) {
		return new User("Stéphane", "JOYEUX");
	}

	public User getAdminUser() {
		return new User("ADMIN", "ADMIN");
	}

}
