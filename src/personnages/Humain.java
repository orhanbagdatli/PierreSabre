package personnages;

public class Humain {
	
	private String nom ;
	private String boissonFavorite ;
	private int argent ;
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
		// TODO Auto-generated constructor stub
		this.nom = nom ;
		this.boissonFavorite = boissonFavorite ;
		this.argent = argent;
		
	}
	public int getArgent() {
		return argent;
	}
	public String getNom() {
		return nom;
	}
	
	protected void parler(String texte) {
        System.out.println("("+nom+") - " + texte );
    }
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");

	}
	
	public void boire() {
	parler(" Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS !");

	}
	protected void gagnerArgent(int gain) {
		argent+=gain;
		parler("J'ai gagne "+gain+ " sous et j'ai "+argent+" sous maintenant");
		

	}
	
	protected void perdreArgent(int perte) {
		argent-=perte;
		
			
	}
	
	
	

	
	public void acheter(String bien, int prix ) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien +" à " + prix + " sous");
			perdreArgent(prix); ;	
		}
		
		else {
	            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous");    
		}
		

	}
		
	

}
