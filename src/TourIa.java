import java.util.Random;

public class TourIa {

	public TourIa(Grille grilleJoueur) {

		System.out.println("C'est le tour de l'ordinateur!");
		int[] cood = coorAleatoires();		
		grilleJoueur.tirer(cood[1], cood[0]);
	}
	
	private int[] coorAleatoires() {
		
		return new int[]{new Random().nextInt(10), new Random().nextInt(10)};
		
	}

}
