package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




public class Monde {
	
	  static Scanner scanner = new Scanner(System.in);
	  public static String[] debutnom = new String[] {
			   " chat"," chien"," chaton",  }; 
	  public static String[] finNom = new String[] {
			   " mechant"," de feu"," de la mort" };
  
	
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
	    * Permet de generer un monstre avec un nom aléatoire
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
	    * Permet de generer le debut et la fin du nom du monstre
	    */
       static String dnom = Monde.debutnom[new Random().nextInt(debutnom.length)];
       static String fnom = Monde.finNom[new Random().nextInt(debutnom.length)];
       
       /**
        * Fonction qui permet de faire combattre le personnage contre un monstre 
        * @param personnage qui attaque le monstre
        * @param monstre qui attaque le personnage
        */
       public static void Combat(ICombattant combattant1, ICombattant combattant2) {
    	   boolean turn = true;
    	   while(combattant1.getPointDeVie() > 0 && combattant2.getPointDeVie() > 0) {
    		   if(turn) {
    			   System.out.println("vous infligez " + combattant1.getDegats() + " points de dégats");
    			   combattant2.setPointDeVie(combattant2.getPointDeVie() - combattant1.getDegats());
    			   
    		   }
    		   else {
    			   System.out.println("Le monstre vous inflige " + combattant2.getDegats() +" points de dégats");
    			   combattant1.setPointDeVie(combattant1.getPointDeVie() - combattant2.getDegats());
    			 
    		   }
    	   turn = !turn;
    		   
    		   System.out.println("Nous avons " + combattant1.getPointDeVie() + "points de vie , le monstre à lui encore  " + combattant2.getPointDeVie() +
    				   " points de vie avant d'être vaincu");
    		   
    		   
    		   if (combattant2.getPointDeVie() <= 0) {
    			   System.out.println("Le monstre est vaincu ! Bien joué.");
    		   } 
    		   
    		   if (combattant1.getPointDeVie() <= 0) {
    			   System.out.println("Vous êtes vaincu , noob.");
    		   }	 
      }
 }
       
       /**
        * Cette methode creer et tetourne une basucAttaque
        * @return
        */
       public static BasicAttaque basicAttaqueFactory() {
       	System.out.println("Creation d'une attaque -------------");
       	BasicAttaque a = new BasicAttaque("","Ceci est une attaque",10,50);
       	a.setNom(scanner.next());
       	return a;
       }
       
       /**
        * Cette methode creer et retourne une classe 
        * @return
        */
       public static Classe classeFactory() {
       	System.out.println("Creation d'une classe --------------");
       	Classe c = new Classe();
       	System.out.println("Nom;");
       	c.setNom(scanner.next());
       	
       	//Creation d'une list d'attaque
       	List<IAttaque> attaques = new ArrayList<>();
       	attaques.add(basicAttaqueFactory());
       	attaques.add(basicAttaqueFactory());
       	
       	c.setAttaques(attaques);
       	
       	return c;
       }
       
       	
    		   }
    	   
       


		   
	     
		   
	  
