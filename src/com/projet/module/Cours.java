package com.projet.module;

public class Cours {
	
	private String contenu;
	private int duree;
	private int nbreHeureTotal;
	private int nbreHeureFait;
	
	public Cours(String contenu, int duree, int nbreHeureTotal, int nbreHeureFait) {
		
		this.contenu = contenu;
		this.setDuree(duree);
		this.nbreHeureTotal = nbreHeureTotal;
		this.nbreHeureFait = nbreHeureFait;
		
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		if(duree > 0)
			this.duree = duree;
	}

	public int getNbreHeureTotal() {
		return nbreHeureTotal;
	}

	public void setNbreHeureTotal(int nbreHeureTotal) {
		this.nbreHeureTotal = nbreHeureTotal;
	}

	public int getNbreHeureFait() {
		return nbreHeureFait;
	}

	public void setNbreHeureFait(int nbreHeureFait) {
		this.nbreHeureFait = nbreHeureFait;
	}
		
}



