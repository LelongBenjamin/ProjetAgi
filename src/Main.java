import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
<<<<<<< HEAD
		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();
		
		Joueur joueur = new Joueur(grilleJoueur);
=======
		Random r=new Random();
		int random=r.nextInt(2);
		if(random==1){
			System.out.println("Joueur commence");
		}else{
			System.out.println("Ia commence");
		}
		
		
		
		Joueur joueur = new Joueur();
		
		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();
		
>>>>>>> 221076e919da9d9682c740da5987a865b7104336
		
		while(true){
			new TourJoueur(grilleJoueur, grilleIa);
		}
	}
}
