package com.projet.edt;

import com.projet.classe.Classe;
import com.projet.module.Cours;

public class EmploiDuTemps {
	
	private Jours jour;
	int heureDebut;
	private Cours module;
	private Classe classe;
	
	public EmploiDuTemps(Jours jour, int heureDebut, Cours module, Classe classe) {
		
		this.jour = jour;
		this.heureDebut = heureDebut;
		this.module = module;
		this.classe = classe;
		
	}

	public Jours getJour() {
		return jour;
	}

	public void setJour(Jours jour) {
		this.jour = jour;
	}

	public int getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(int heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Cours getModule() {
		return module;
	}

	public void setModule(Cours module) {
		this.module = module;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
	
	
	
	
}
