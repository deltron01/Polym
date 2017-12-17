package application;

import types.Fruit;
import types.Orange;
import types.Pomme;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Pomme p = new Pomme(40);
		Fruit f;
		f = new Pomme(50); // surcasting
		((Pomme)f).affichePoids(); // sous casting
		f.affiche(); //ici, le sous-casting casting se fait implicitement!
		f = new Orange(36);// phénomène de polymorphisme : Java est capable au moment de l'execution quelle version
		                  // de la méthode il va appeler
		f.affiche();

	}

}
