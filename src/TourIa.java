import java.util.Random;

public class TourIa {

	public TourIa(Grille grilleJoueur) {

		int[] cood = coorAleatoires();		
		grilleJoueur.tirer(cood[1], cood[0]);
	}
	
	private int[] coorAleatoires() {
		
		return new int[]{new Random().nextInt(11), new Random().nextInt(11)};
		
	}

}
