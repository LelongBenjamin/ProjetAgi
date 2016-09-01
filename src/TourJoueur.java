import java.util.Scanner;

public class TourJoueur {

	public TourJoueur(Grille grilleJoueur, Grille grilleIa) {
		
		grilleIa.afficherGrille();
		System.out.println();
		for (int j = 0; j < 43; j++) {
			System.out.print("_");
		}
		for (int j = 0; j < 3; j++) {
			System.out.println();
		}
		grilleJoueur.afficherGrille();

		int[] cood = demanderCoordonnees();
		grilleIa.tirer(cood[0], cood[1]);
		
		grilleIa.afficherGrille();
		System.out.println();
		for (int j = 0; j < 43; j++) {
			System.out.print("_");
		}
		for (int j = 0; j < 3; j++) {
			System.out.println();
		}
		grilleJoueur.afficherGrille();
	}

	public int[] demanderCoordonnees() {
		int[] coordo = new int[2];
		Scanner sc = new Scanner(System.in);
		String mess = sc.nextLine();

		if (mess.length() == 2 && estLettre(mess.charAt(0)) && estChiffre(mess.charAt(1))) {

			coordo[0] = mess.charAt(0) - 97;
			coordo[1] = mess.charAt(1) - 48;
			System.out.println("Tir !");
		} else {
			System.out.println("Mauvaises coordonnees : reessayez !");
			demanderCoordonnees();
		}

		return coordo;
	}

	private boolean estLettre(char lettre) {

		if (lettre >= 97 && lettre <= 106) {
			return true;
		}
		return false;
	}

	private boolean estChiffre(char chiffre) {
		if (chiffre >= 48 && chiffre <= 57) {
			return true;
		}
		return false;
	}
}
