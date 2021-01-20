package main;

import java.util.Random;

public class BasicAttaque implements IAttaque {
	
	private String nom;
	private String description;
	public int degats;
	private double chanceToucher;
	
	
	
	public BasicAttaque() {
		
	}
	
	
	
	public BasicAttaque(String nom, String description, int degats, double chanceToucher) {
		super();
		this.nom = nom;
		this.description = description;
		this.degats = degats;
		this.chanceToucher = chanceToucher;
	}


	

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getDegats() {
		return degats;
	}



	public void setDegats(int degats) {
		this.degats = degats;
	}



	public double getChanceToucher() {
		return chanceToucher;
	}



	public void setChanceToucher(double chanceToucher) {
		if(chanceToucher >= 0 && chanceToucher <= 100) {
		this.chanceToucher = chanceToucher;
	} else {
		System.out.println("La chance de toucher doit être comprise entre 0 et 100");
	}
}




	

	/**
	 * Cette methode genere un nombre aleatoire entre 0 et 100
	 * Si ce nombre est inferieur à la chance de toucher, return degats 
	 * sinon affiche une erreur et return 0
	 */
	public int lancerAttaque() {
			
		if((int)Math.random() *100 < this.getChanceToucher()) {
			return getDegats();
		}
		else {
			System.out.println("Echec");
			
		}
		return 0;
	}



	


	


	/**
	 * Cette methode genere un nombre aleatoire entre 0 et 100
	 * Si ce nombre est inferieur à la chance de toucher, return degats 
	 * sinon affiche une erreur et return 0
	 */
	//public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		//Random random = new Random();
		//double nbr = random.nextDouble() *100;
		
		//if (nbr < this.chanceToucher) {
		//	return lanceur.getDegats();
		//}
	//	return 0;
	//}



	

	
		
	}


