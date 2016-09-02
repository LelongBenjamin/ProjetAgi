package Objets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Intelligence.Main;
import Intelligence.PlacementBateau;

public class Joueur {

	private List<Bateau> listeBateau = new ArrayList<>();
	private int vies;

	/**
	 * Constructeur: initialise la partie en creant le joueur et definit sa vie une fois ses bateaux places
	 * @param grille
	 * @param ia
	 */
	public Joueur(Grille grille, boolean ia) {		

		if (!ia) {
			
			System.out.print("Pour commencer appuyez sur entree >");
			Scanner sc = new Scanner(System.in);
			String mess = sc.nextLine();

			if (mess.equals("yannsecq<3")) {
				Main.clearTerminal();
				System.out.println("c'etait un piege :/");
				System.exit(1);

			} else if (mess.equals("zz")) {
				PlacementBateau.aleatoirement(grille, this);				
				
			} else {				
				PlacementBateau.manuel(grille, this);	
			}
			
		} else {			
			PlacementBateau.aleatoirement(grille, this);
		}

		this.vies = nombreDeVies();
		Main.clearTerminal();
	}


	/**
	 * Nombre de vies du bateau
	 * 
	 * @return
	 */
	public int nombreDeVies() {
		int total = 0;
		for (int i = 0; i < this.listeBateau.size(); i++) {
			total += this.listeBateau.get(i).getTaille();
		}
		return total;
	}

	/**
	 * Retourne la liste des bateaux du joueur
	 * @return
	 */
	public List<Bateau> getListeBateau() {
		return listeBateau;
	}

	/**
	 * Retourne la vie du joueur
	 * @return
	 */
	public int getVies() {
		return vies;
	}

	/**
	 * Definit la vies du joueur
	 * @param vies
	 */
	public void setVies(int vies) {
		this.vies = vies;
	}

	/**
	 * Retire une vie du joueur
	 */
	public void enleverUneVie() {
		this.vies = this.vies - 1;
	}

	/**
	 * Met la vie du joueur a 0
	 */
	public void tuer() {
		this.vies = 0;
	}

}
