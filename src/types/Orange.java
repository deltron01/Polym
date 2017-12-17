package types;

public class Orange extends Fruit {
	public Orange(int p) {
	    this.poids = p;
	    System.out.println("-Création d'une orange de "+this.poids+ " grammes-");
	}
    public void affiche() {
    	System.out.println("-C'est une orange-");
    }
    public void affichePoids(){
    	System.out.println("Le poids de l'orange est : "+this.poids+" grammes");
    }

}
