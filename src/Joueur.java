import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Joueur {

	private List<Bateau> listeBateau = new ArrayList<>();
	
	public Joueur(Grille grille) {
		grille.afficherGrille();
		System.out.print("Donnez les coordonnees pour le bateau de 5 : ");
		int[] cood = TourJoueur.demanderCoordonnees();
		boolean orientation = demanderOrientation();
		grille.placerBateau(new Bateau(5, cood[1], cood[0], orientation));
		grille.afficherGrille();
		System.out.print("Donnez les coordonnees pour le bateau de 4 : ");
		cood = TourJoueur.demanderCoordonnees();
		orientation = demanderOrientation();
		grille.placerBateau(new Bateau(4, cood[1], cood[0], orientation));
		grille.afficherGrille();
		System.out.print("Donnez les coordonnees pour le bateau de 3 : ");
		cood = TourJoueur.demanderCoordonnees();
		orientation = demanderOrientation();
		grille.placerBateau(new Bateau(3, cood[1], cood[0], orientation));
		grille.afficherGrille();
		System.out.print("Donnez les coordonnees pour le bateau de 3 : ");
		cood = TourJoueur.demanderCoordonnees();
		orientation = demanderOrientation();
		grille.placerBateau(new Bateau(3, cood[1], cood[0], orientation));
		grille.afficherGrille();
		System.out.print("Donnez les coordonnees pour le bateau de 2 : ");
		cood = TourJoueur.demanderCoordonnees();
		orientation = demanderOrientation();
		grille.placerBateau(new Bateau(2, cood[1], cood[0], orientation));
		grille.afficherGrille();
	}
	
	public boolean demanderOrientation(){
		System.out.print("\n (1) verticale (2) horizontal : ");
		Scanner sc = new Scanner(System.in);
		String mess = sc.nextLine();
		
		if(mess.length() == 1 && ( mess.charAt(0) == '1' || mess.charAt(0) == '2')){
			if(mess.charAt(0) == '1'){
				return true;
			}
			return false;
		}else{
			demanderOrientation();
		}
		return false;
	}
	
	/**
	 * Nombre de vies du bateau
	 * @return
	 */
	public int bateauAlive() {
		int total = 0;
		for (int i = 0; i < this.listeBateau.size(); i++) {
			total += this.listeBateau.get(i).getTaille();
		}		
		return total;
	}	
	

}
