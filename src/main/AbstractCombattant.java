package main;

public abstract class AbstractCombattant implements ICombattant {
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
	
	public void attaquer(ICombattant adversaire)
	   {
	       // Appeler la methode Defence de l'adversaire en passant en Params.
	       // Afficher un message pour notifier de l'attaque
		adversaire.defendre(this.getDegats());
	   }

	   public void defendre(int degats)
	   {
	       // Soustraire aux points de vie les degats passé en params
		   this.pointDeVie =- degats;
		   this.setPointDeVie(this.getPointDeVie() - degats);
	   }
	
	
}
