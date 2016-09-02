import java.util.Random;
import java.util.Scanner;

public class TourJoueur {

	public TourJoueur(Grille grilleJoueur, Grille grilleIa, Joueur joueur, Joueur advers) {
		
		grilleIa.afficherGrille(false);
		System.out.println();
		for (int j = 0; j < 43; j++) {
			System.out.print("_");
		}
		for (int j = 0; j < 3; j++) {
			System.out.println();
		}
		grilleJoueur.afficherGrille(true);

		int[] cood = demanderCoordonnees();
		grilleIa.tirer(cood[1], cood[0], advers);

		
		grilleIa.afficherGrille(false);
		System.out.println();
		for (int j = 0; j < 43; j++) {
			System.out.print("_");
		}
		for (int j = 0; j < 3; j++) {
			System.out.println();
		}
		
		for (int i = 0; i < advers.getListeBateau().size(); i++) {
			
			if (advers.getListeBateau().get(i).estCoule(grilleIa)) {
				System.out.println("Bateau de taille "+advers.getListeBateau().get(i).getTaille()+" coulé.");
			}
			
		}
		
		grilleJoueur.afficherGrille(true);
	}

	static int[] demanderCoordonnees() {
		int[] coordo = new int[2];
		Scanner sc = new Scanner(System.in);
		String mess = sc.nextLine();
		
		if (mess.equals("r")) {
			return new int[]{new Random().nextInt(10), new Random().nextInt(10)};
		}

		if (mess.length() == 2 && estLettre(mess.charAt(0)) && estChiffre(mess.charAt(1))) {

			if (mess.charAt(0) >= 65 && mess.charAt(0) <= 74) {			
				coordo[0] = mess.charAt(0) - 65;
			} else {
				coordo[0] = mess.charAt(0) - 97;
			}	
			
			coordo[1] = mess.charAt(1) - 48;
			
			
			//System.out.println("coordonnees valide");
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
