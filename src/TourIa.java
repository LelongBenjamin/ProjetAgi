
import java.util.Random;


public class TourIa {
	

	public TourIa(Grille grilleJoueur, Joueur joueur, Joueur ordi) {
		System.out.println("C'est le tour de l'ordinateur!");
		int[] cood = coorAleatoires();
		boolean bon = false;
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
