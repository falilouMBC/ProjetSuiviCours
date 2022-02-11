package com.projet.classe;

import com.projet.user.entities.ChefDeClasse;

public class Classe {

	private String nomClasse;
	private String salle;
	private ChefDeClasse responsable;
	
	public Classe(String nomClasse, String salle, ChefDeClasse responsable) {
		this.nomClasse = nomClasse;
		this.salle = salle;
		this.responsable = responsable;
	}

	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public ChefDeClasse getResponsable() {
		return responsable;
	}

	public void setResponsable(ChefDeClasse responsable) {
		this.responsable = responsable;
	}
	
	
	
	
	
}
