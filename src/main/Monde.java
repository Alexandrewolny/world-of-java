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
		System.out.println("Veuillez entrer votre nom");
		String nom = sc.nextLine();
		
		System.out.println("Veuillez entrer votre PDV");
		int pointDeVie = sc.nextInt();
		
		System.out.println("Veuillez entrer vos points de degats");
		int degat = sc.nextInt();
				
		
		
	    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'être choisi par l'utilisateur)
		Personnage p = new Personnage(nom,pointDeVie,degat);
		
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
	   
	   /**
	    * Permet de generer un monstre 
	    * @return un monstre
	    */
	   public static Monstre MonstreFactory()
	   {
		
		   // Creer un string pour le nom de votre monstre
		   // Creer une instance Monstre avec sont constructeur complet
	       // retourner le monstre
		   
		   return null;
	   }
		
	       
	   public static String[] debutnom = new String[] {
				   "chat","chien","chaton",  };
		   
	   public static String[] finNom = new String[] {
				   " mechant"," de feu"," de la mort"} ;
	   }


		   
	     
		   
	  
