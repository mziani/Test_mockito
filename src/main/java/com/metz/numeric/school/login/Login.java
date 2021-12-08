package com.metz.numeric.school.login;

import com.metz.numeric.school.db.Database;
import com.metz.numeric.school.user.User;

public class Login {

	private Database db;

	// Injection de la db ..
	public Login(Database db) {
		this.db = db;
	}

	public User getLogin(String userId, String pwd) {
		// appel db ..
		// pour l'exercice ... il manque la partie DAO..
		return db.getUser(userId, pwd);
	}

	public User getAdmin() {
		// appel db ..
		// pour l'exercice ... il manque la partie DAO..
		return db.getAdminUser();
	}

}
