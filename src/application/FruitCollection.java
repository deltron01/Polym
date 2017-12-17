package application;

import java.util.ArrayList;

import types.Fruit;
import types.Orange;
import types.Pomme;

public class FruitCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Pomme(60));
        fruits.add(new Orange(85));
        fruits.add(new Pomme(75));
        System.out.println("affichage via la première façon de parcourir un collection Arraylist--");
        for(int i=0; i<fruits.size(); i++){
        	fruits.get(i).affiche();
        }
        System.out.println("affichage via la deuxième façon de parcourir un collection Arraylist--");
        for(Fruit f : fruits){
        	f.affiche();
        }
	}

}
