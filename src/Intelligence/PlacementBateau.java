package Intelligence;
import java.util.Random;
import java.util.Scanner;

import Objets.Bateau;
import Objets.Grille;
import Objets.Joueur;

public class PlacementBateau {

	/**
	 * Place les 5 bateaux de joueur sur grille aleatoirement
	 * @param grille
	 * @param joueur
	 */
	public static void aleatoirement(Grille grille, Joueur joueur) {

		int[] tab = new int[] { 5, 4, 3, 3, 2 };

		for (int i = 0; i < tab.length; i++) {

			boolean valide = false;
			Bateau bato = null;

			while (!valide) {

				boolean orientation;
				int[] cood = TourIa.coorAleatoires();
				if (new Random().nextInt(2) == 1) {
					orientation = true;
				} else {
					orientation = false;
				}

				bato = new Bateau(tab[i], cood[1], cood[0], orientation);
				valide = grille.placerBateau(bato);

			}
			joueur.getListeBateau().add(bato);
		}
	}

	/**
	 * Demande au joueur de placer les bateaux un par un sur grille dans un odre precis
	 * @param grille
	 * @param joueur
	 */
	public static void manuel(Grille grille, Joueur joueur) {

		int[] tab = new int[] { 5, 4, 3, 3, 2 };

		for (int i = 0; i < tab.length; i++) {
			boolean valide = false;
			Bateau bato = null;
			Main.clearTerminal();
			int cpt = 0;
			while (!valide) {
				Main.clearTerminal();
				if (cpt > 0) {
					System.out.println("Erreur de chevauchement ou de debordement. Reessayez! \n");
				}
				grille.afficherGrille(true);
				System.out.print("Donnez les coordonnees pour le bateau de " + tab[i] + ":\n>");
				int[] cood = TourJoueur.demanderCoordonnees();
				boolean orientation = demanderOrientation();

				bato = new Bateau(tab[i], cood[1], cood[0], orientation);
				valide = grille.placerBateau(bato);
				cpt++;
			}
			joueur.getListeBateau().add(bato);

		}

	}

	/**
	 * Demande l'orientation dans le cas d'un placement manuel
	 * @return
	 */
	private static boolean demanderOrientation() {
		
		System.out.print("\n (1) Vertical (2) Horizontal: >");
		Scanner sc = new Scanner(System.in);
		String mess = sc.nextLine();

		if (mess.length() == 1 && (mess.charAt(0) == '1' || mess.charAt(0) == '2')) {
			if (mess.charAt(0) == '1') {
				return true;
			}
			return false;
		} else {
			demanderOrientation();
		}
		return false;
	}

}
