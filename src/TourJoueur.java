import java.util.Random;
import java.util.Scanner;

public class TourJoueur {

	public TourJoueur(Grille grilleJoueur, Grille grilleIa, Joueur joueur, Joueur advers) {

		Main.clearTerminal();

		grilleIa.afficherGrille(false);

		Affichage.separateur(43);
		Affichage.bateauxTues(grilleIa, advers);
		Affichage.separateur(43);
		Affichage.passerLigne(3);
		grilleJoueur.afficherGrille(true);

		System.out.print("Entrez les coordonnees de tir >");
		int[] cood = demanderCoordonnees();
		grilleIa.tirer(cood[1], cood[0], advers);

		grilleIa.afficherGrille(false);
		Affichage.separateur(43);
		Affichage.passerLigne(3);
		grilleJoueur.afficherGrille(true);

	}

	public static int[] demanderCoordonnees() {

		int[] coordo = new int[2];
		Scanner sc = new Scanner(System.in);
		String mess = sc.nextLine();

		if (mess.equals("r")) {
			return new int[] { new Random().nextInt(10), new Random().nextInt(10) };
			
		} else if (mess.equals("yannsecq<3")) {
			Main.clearTerminal();
			System.out.println("c'etait un piege :/");
			System.exit(1);
		}

		if (mess.length() == 2 && estLettre(mess.charAt(0)) && estChiffre(mess.charAt(1))) {

			if (mess.charAt(0) >= 65 && mess.charAt(0) <= 74) {
				coordo[0] = mess.charAt(0) - 65;
			} else {
				coordo[0] = mess.charAt(0) - 97;
			}

			coordo[1] = mess.charAt(1) - 48;

		} else {
			System.out.print("Mauvaises coordonnees: reessayez !\n>");
			demanderCoordonnees();
		}

		return coordo;
	}

	public static boolean estLettre(char lettre) {

		if ((lettre >= 65 && lettre <= 74) || (lettre >= 97 && lettre <= 106)) {
			return true;
		}
		return false;
	}

	public static boolean estChiffre(char chiffre) {
		if (chiffre >= 48 && chiffre <= 57) {
			return true;
		}
		return false;
	}
}
