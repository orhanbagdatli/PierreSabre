package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yakuLeNoir = new Yakuza("Yaku le Noir", "whisky", 30, "Warsong");
		
//		prof.direBonjour();
//		prof.acheter("boisson", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
//		System.out.println(" ");
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		
		

	}

}
