
public class Grille {
	
	private Case[][] cases = new Case[10][10];
	
	public Grille() {

		for (int i = 0; i < cases.length; i++) {
			for (int j = 0; j < cases.length; j++) {
				cases[i][j] = Case.EAU;
			}
		}
		
	}
	
	int getTailleGrille(){
		return cases.length;
	}
	
	Case getCase(int i, int j){
		return cases[i][j];
	}
	
	public void tirer(int x, int y){
		if(cases[x][y] == Case.BATEAU){
			cases[x][y] = Case.TIRTOUCHE;
			System.out.println("Touché!");
			
		}else{
			cases[x][y] = Case.TIRRATE;
			System.out.println("Raté!");
		}
	}
	
	public boolean placerBateau(Bateau bateau){
		
		if(!bateau.isOrientation()){
			for (int i = 0; i < bateau.getTaille(); i++) {
				if (cases[bateau.getX()][bateau.getY() + i] == Case.BATEAU || bateau.getY()+bateau.getTaille()>10) {
					System.out.println("Erreur de chevauchement ou de debordement. Reessayez!");
					return false;
				}
			}
		}else{
			for (int i = 0; i < bateau.getTaille(); i++) {
				if (cases[bateau.getX() + i][bateau.getY()] == Case.BATEAU || bateau.getX()+bateau.getTaille()>10) {
					System.out.println("Erreur de chevauchement ou de debordement. Reessayez!");
					return false;
				}
			}
		}
		
		if(!bateau.isOrientation()){
			for (int i = 0; i < bateau.getTaille(); i++) {
				cases[bateau.getX()][bateau.getY() + i] = Case.BATEAU;
			}
		}else{
			for (int i = 0; i < bateau.getTaille(); i++) {
				cases[bateau.getX() + i][bateau.getY()] = Case.BATEAU;
			}
		}
		return true;
	}
	
	public void afficherGrille(){
		
		System.out.print("  ");
		
		for (int i = 0; i < cases.length; i++) {
			System.out.print("  ");
			System.out.print((char)('A'+ i));
			System.out.print(" ");
			
		}
		System.out.print("\n");
		for (int j = 0; j < 43; j++) {
			System.out.print("-");
		}
		System.out.print("\n");
		for (int i = 0; i < cases.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < cases.length; j++) {
				System.out.print("|");
				System.out.print(cases[i][j].getAffichage());
			}
			System.out.println("|");
			for (int j = 0; j < 43; j++) {
				System.out.print("-");
			}
			System.out.print("\n");
		}
	}

	public Case[][] getCases() {
		return cases;
	}

	public void setCases(Case[][] cases) {
		this.cases = cases;
	}
	
}