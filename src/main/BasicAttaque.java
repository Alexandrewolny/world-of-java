package main;

public class BasicAttaque implements IAttaque {
	
	public int degats;
	
	

	@Override
	public int LancerAttaque(ICombattant lanceur, ICombattant cible) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getChanceToucher() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescription(int description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChanceToucher(double chanceToucher) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Cette methode permet de lancer une attaque basique.
	 * @param degats
	 * @param chanceToucher
	 */
	public void basicAttaque(int degats,double chanceToucher) {
		
		
		if(chanceToucher > (int)Math.random() *100) {
			System.out.println("Vous infligez " + degats);
		}
		
		else {
			System.out.println("Echec critique");
		}
	}

	/**
	 * Cette methode permets aux combattants de lancer une attaque
	 * @param lanceur
	 * @param cible
	 * @return 
	 */
	public int lancerAttaque(ICombattant lanceur, ICombattant cible) {
			
		if((int)Math.random() *100 < this.getChanceToucher()) {
			return lanceur.getDegats();
		}
		else {
			System.out.println("Echec");
			return 0;
		}
	} 
		
	}


