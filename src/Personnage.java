
public class Personnage {
	
	//Fields
	private int pointDeVie;
	private int degat;
	private String nom;
	
	//Constructors
	public Personnage() {
	}
	
	public Personnage(int pointDeVie, int degat, String nom) {
		super();
		this.pointDeVie = pointDeVie;
		this.degat = degat;
		this.nom = nom;
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
