import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
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
		
		
		while(true){
			new TourJoueur(grilleJoueur, grilleIa);
		}
	}
}
