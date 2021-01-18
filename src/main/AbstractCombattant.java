package main;

public abstract class AbstractCombattant {
	public String nom;
	public int pointDeVie;
	public int degat;
	
	public AbstractCombattant() {
		
	}
	
	public AbstractCombattant(String nom,int pointDeVie,int degat) {
		this.nom = nom;
		this.pointDeVie = pointDeVie;
		this.degat = degat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getDegats() {
		return degat;
	}

	public void setDegats(int degats) {
		this.degat = degats;
	}
	
	
}
