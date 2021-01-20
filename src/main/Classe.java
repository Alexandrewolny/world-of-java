package main;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	
	public String nom;
	
	public List <IAttaque> attaques1 = new ArrayList<>();
	
	IAttaque attaque1;
	IAttaque attaque2;
	IAttaque attaque3; 
	
	public Classe() {
		
	}
	
	public Classe(String nom, List<IAttaque> attaque) {
		super();
		this.nom = nom;
		this.attaques1 = attaque;
	}

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<IAttaque> getAttaques() {
		return attaques1;
	}

	public void setAttaques(List<IAttaque> attaques) {
		this.attaques1 = attaques;
	}

	
	
	
	/**
	 * Recupere une attaque parmis les attaques de la classe
	 */
	public void getAttaque(IAttaque attaques) {
		
	}
	
}
