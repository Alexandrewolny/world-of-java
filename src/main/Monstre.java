package main;

public class Monstre extends AbstractCombattant {

public Monstre(String nom,int pointDeVie,int degats) {
	super(nom,pointDeVie,degats);
}

@Override
public String toString() {
	return "Monstre [nom=" + nom + ", pointDeVie=" + pointDeVie + ", degat=" + degat + "]";
}



}
