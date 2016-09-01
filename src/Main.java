import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Grille grilleJoueur = new Grille();
		Grille grilleIa = new Grille();
		
		Joueur joueur = new Joueur(grilleJoueur);
		
		Random r=new Random();
		int random=r.nextInt(2);
		if(random==1){
			System.out.println("Joueur commence");
		}else{
			System.out.println("Ia commence");
		}
		
			
		while(true){
			new TourJoueur(grilleJoueur, grilleIa);
		}
	}
	
	static void clearTerminal(){
		for (int i = 0; i < 42; i++) {
			System.out.print('\n');
		}
	}
}
