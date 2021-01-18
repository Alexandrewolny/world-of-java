package main;

public class Personnage extends AbstractCombattant {
	
	
	
	//Constructors
	public Personnage() {
	}
	
	public Personnage(String nom, int pointDeVie, int degat) {
		super(nom,pointDeVie,degat);
		
	}

	//Getters and Setters
	public int getPointDeVie() {
		return pointDeVie;
	}

	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personnage [pointDeVie=" + pointDeVie + ", degat=" + degat + ", nom=" + nom + "]";
	}
	
	
	
}
