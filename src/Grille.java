
public class Grille {
	
	private Case[][] cases = new Case[10][10];
	
	public Grille() {

		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases.length; j++) {
				cases[i][j] = Case.EAU;
			}
		}
		
	}
	
	public void afficherGrille(){
		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases.length; j++) {
				System.out.print("|");
				System.out.print(cases[i][j].getAffichage());
			}
			System.out.println("|");
			for (int j = 0; j < 21; j++) {
				System.out.print("-");
			}
			System.out.print("\n");
		}
	}
}
