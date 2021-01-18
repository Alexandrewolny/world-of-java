package main;

public class Run {

	public static void main(String[] args) {
		Personnage p = Monde.personnageFactory();
		System.out.println(p);
		Monstre monstre = Monde.MonstreFactory();
		System.out.println(monstre);
		
	}
	
	

}
