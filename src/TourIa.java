import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class TourIa {
	
	static List <int []> tirFait = new ArrayList<>();

	public TourIa(Grille grilleJoueur, Joueur joueur, Joueur ordi) {
		System.out.println("C'est le tour de l'ordinateur!");
		int[] cood = coorAleatoires();		
		grilleJoueur.tirer(cood[1], cood[0], joueur);
		tirFait.add(cood);
	}
	
	static int[] coorAleatoires() {
		int coordonnee1;
		int coordonnee2;
		coordonnee1=new Random().nextInt(10); 
		coordonnee2=new Random().nextInt(10);
		int[] proposition=new int[2];
		proposition[0]=coordonnee1;
		proposition[1]=coordonnee2;
		for (int i = 0; i < tirFait.size(); i++) {
			if(proposition.equals(tirFait.get(1))){
				coorAleatoires();
			}
		}
		return proposition;
		
	}

}
