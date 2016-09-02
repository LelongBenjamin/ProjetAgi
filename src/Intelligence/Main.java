package Intelligence;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import Objets.Grille;
import Objets.Joueur;

public class Main {
	public static void main(String[] args) {

		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();

		Joueur joueur = new Joueur(grilleJoueur, false);
		Joueur ordi = new Joueur(grilleIa, true);

		int cpt = 0;

		if (new Random().nextInt(2) == 1) {
			cpt = 2;
		} else {
			cpt = 1;
		}

		while (joueur.getVies() >= 1 && ordi.getVies() >= 1) {	

			if (cpt % 2 == 0) {
				if (cpt == 2) {
					System.out.println("Le joueur commence\n");
					cpt = 4;
				}
				new TourJoueur(grilleJoueur, grilleIa, joueur, ordi);
			} else {
				if (cpt == 1) {
					System.out.println("L'ordinateur commence\n");
					cpt = 3;
				}
				new TourIa(grilleJoueur, joueur, ordi);
			}
			cpt++;
		}
		
		grilleIa.afficherGrille(false);
		Affichage.separateur(43);
		Affichage.bateauxTues(grilleIa, joueur);
		Affichage.separateur(43);
		Affichage.passerLigne(3);
		grilleJoueur.afficherGrille(true);
		
		if(joueur.getVies()>0){
			System.out.println("Le joueur gagne");
		}else{
			System.out.println("L'ordinateur gagne");
		}
		
		System.out.print("Tapez Entree pour continuer...>");
		Scanner sc = new Scanner(System.in);
		String mess = sc.nextLine();
		
		Affichage.credits();
		
		
	}

	public static void clearTerminal() {
		for (int i = 0; i < 42; i++) {
			System.out.print('\n');
		}
	}
	
	public static void clearTerminal(int var) {
		for (int i = 0; i < var; i++) {
			System.out.print('\n');
		}
	}
	
	
	
}
	

