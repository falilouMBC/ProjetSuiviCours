package com.projet.metier;

import com.projet.user.entities.Utilisateur;

public class Metier {
	public static boolean authentifier(String login, String password) {
		Utilisateur utilisateur = new Utilisateur();
		if((login == utilisateur.getLogin()) && (password == utilisateur.getPassword()))
			return true;
		return false;
	}
}