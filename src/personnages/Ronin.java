package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
    }
	
	public void donner(Commercant beneficiaire) {
		
        int montantDon = (int) (getArgent() * 0.1);
        perdreArgent(montantDon); 
        parler(beneficiaire.getNom() + " prend ces " + montantDon + " sous.");
        beneficiaire.recevoir(montantDon);
    }

}
