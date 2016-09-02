package Intelligence;

import java.util.Random;

import Objets.Case;
import Objets.Grille;
import Objets.Joueur;


public class TourIa {
	

	public TourIa(Grille grilleJoueur, Joueur joueur, Joueur ordi) {
		System.out.println("C'est le tour de l'ordinateur!");
		int[] cood = coorAleatoires();
		boolean bon = false;
		int a=new Random().nextInt(4);
		if(a==0){
			for (int i = 0; i < grilleJoueur.getTailleGrille(); i++) {
				for (int j = 0; j < grilleJoueur.getTailleGrille(); j++) {
					if(grilleJoueur.getCase(i,j) == Case.BATEAU){
						cood = new int[]{j, i};
					}
				}
			}
			bon=true;
		}
		
		
		while(!bon){
			if(grilleJoueur.getCase(cood[1],cood[0]) == Case.TIRRATE && grilleJoueur.getCase(cood[1],cood[0]) == Case.TIRTOUCHE){
				cood = coorAleatoires();
			}else{
				bon = true;
			}
		}
				
		grilleJoueur.tirer(cood[1], cood[0], joueur);
	}
	
	static int[] coorAleatoires() {
		
		int[] proposition=new int[]{new Random().nextInt(10), new Random().nextInt(10)};
		return proposition;
		
	}

}
