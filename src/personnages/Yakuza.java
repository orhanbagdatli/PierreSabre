package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		
		super(nom, boissonFavorite, argent);
		this.clan = clan;
			
	}
	
	public void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + " si tu tiens à la vie donne moi ta bourse !");
        victime.perdreArgent(argentVictime); 
        argent += argentVictime; 
        victime.seFaireExtorquer();
        reputation++; 
        parler("J’ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");

	}

}
