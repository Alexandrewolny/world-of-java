package main;
import java.util.Random;
import java.util.Scanner;




public class Monde {
	
	/**
	* Cr�er un personnage avec touss ses attributs. 
	* Demande a l'utilisateur d'entrer le nom du personnage.
	* retour: une instance de la classe Personnage correctement instanci�.
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
				
		
		
	    // Creer un nouveau personnage en utilisant le constructeur avec tous ses params (dont le nom qui vient d'�tre choisi par l'utilisateur)
		Personnage p = new Personnage(nom,pointDeVie,degat);
		
	    // Retourner l'instance du personnage
		return p;
	   }

	/**
	 * Cette m�thode affiche les informations du monde 
	 */
	   public static void afficherInformations()
	   {
		   Personnage p = Monde.personnageFactory();
		   System.out.println(p);
	      System.out.println("AFFICHERMONDE");
	   }
	   
	   /**
	    * Permet de generer un monstre avec un nom al�atoire
	    * @return un monstre
	    */
	   public static Monstre MonstreFactory()
	   {
		
		   // Creer un string pour le nom de votre monstre
		   Scanner sc = new Scanner(System.in);
		   
		   //String nom = debutnom[new Random().next(debutnom.length)] + finNom[new Random().next(finNom.length)];
		   
		   String nom = dnom + fnom;
		   System.out.println("Veuillez entrer les pdv du monstre");
			int pointDeVie = sc.nextInt();
			
			System.out.println("Veuillez entrer les points de degats du monstre");
			int degat = sc.nextInt();
			
		   // Creer une instance Monstre avec sont constructeur complet
		   Monstre monstre = new Monstre(nom,pointDeVie,degat);
		   // retourner le monstre
		   return monstre;
	   }
		
	
	       
	   /**
	    * Permet de generer un nom aleatoire pour le monstre
	    */
	   public static String[] debutnom = new String[] {
				   " chat"," chien"," chaton",  };
		   
	   public static String[] finNom = new String[] {
				   " mechant"," de feu"," de la mort" };
	

	   /**
	    * Permet de generer le debut et la fin du nom du monstre
	    */
       static String dnom = Monde.debutnom[new Random().nextInt(debutnom.length)];
       static String fnom = Monde.finNom[new Random().nextInt(debutnom.length)];
}

		   
	     
		   
	  
