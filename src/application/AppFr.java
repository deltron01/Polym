package application;

import java.awt.Point;

import types.Fruit;
import types.Orange;
import types.Pomme;

public class AppFr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fruit [] lesFruits = new Fruit[3];
		lesFruits[0] = new Pomme(80);// le surcasting se fait implictement.
		lesFruits[1] = new Orange(100);
		lesFruits[2] = new Pomme(96);
		for(int i=0; i<lesFruits.length; i++){
			
			lesFruits[i].affiche(); //il faut exploiter le polymorphisme pour �tre un bon programmeur.
			
			if(lesFruits[i] instanceof Pomme)  // pour ne pas avoir � faire tous ces tests --> rem�de :
			((Pomme)lesFruits[i]).affichePoids();// declarer dans la classe m�re (Fruit) la m�thode abstraite
			else if(lesFruits[i] instanceof Pomme)// affichePoids(). et la fire appeler directement ici sans test d'instance : c le polymorphisme
			((Orange)lesFruits[i]).affichePoids();
		}

	}

}
