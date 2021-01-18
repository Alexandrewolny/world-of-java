package main;
import java.util.Scanner;



public class Monde {
	
	/**
	* Créer un personnage avec touss ses attributs. 
	* Demande a l'utilisateur d'entrer le nom du personnage.
	* retour: une instance de la classe Personnage correctement instancié.
	 * @return 
	**/
	public static Personnage personnageFactory()
	   {
		Scanner sc = new Scanner(System.in);
		  // Demander a l'utilisateur un nom de personnage
		System.out.println("Veuillez entrer un nom de personnage");
		String nom = sc.nextLine();
		
		
	    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'être choisi par l'utilisateur)
		
		Personnage p = new Personnage(0, 0, nom);
	    // Retourner l'instance du personnage
		return p;
	   }

	/**
	 * Cette méthode affiche les informations du monde 
	 */
	   public static void afficherInformations()
	   {
		   Personnage p = Monde.personnageFactory();
		   System.out.println(p);
	      System.out.println("AFFICHERMONDE");
	   }
}