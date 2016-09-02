package Intelligence;

import Objets.Grille;
import Objets.Joueur;

/**
 * Classe regroupant les affichages graphiques
 * @author martella
 *
 */
public class Affichage {
	
	
	
	public static void separateur(int taille) {
		
		System.out.println();
		for (int j = 0; j < taille; j++) {
			System.out.print("_");
		}
		
	}	
	
	public static void bateauxTues(Grille grilleAdvers, Joueur advers) {

		System.out.println();
		for (int i = 0; i < advers.getListeBateau().size(); i++) {

			if (advers.getListeBateau().get(i).estCoule(grilleAdvers)) {
				System.out.println("Bateau de taille " + advers.getListeBateau().get(i).getTaille() + " coulé.");
			}

		}
	}
	
	public static void passerLigne(int taille) {
		
		for (int j = 0; j < 3; j++) {
			System.out.println();
		}
		
	}
	

}
