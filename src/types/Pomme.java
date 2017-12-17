package types;

public class Pomme extends Fruit {
    public Pomme(int p) {
	    this.poids = p;
	    System.out.println("-Création d'une pomme de "+this.poids+ " grammes-");
	}
    public void affiche() {
    	System.out.println("-C'est une pomme-");
    }
    public void affichePoids(){
    	System.out.println("Le poids de la pomme est : "+this.poids+" grammes");
    }
}
