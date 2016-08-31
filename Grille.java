public class Grille {
	
	private Case[][] grille;
	
	private int taille;
	
	public Grille(){
		
		taille = 10;
		grille = new Case[taille][taille];
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++) {
				grille[i][j] = new Case();
			}
		}
		
	}
	
	public Grille(int taille) {
		
		this.taille = taille;
		grille = new Case[taille][taille];
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++) {
				grille[i][j] = new Case();
			}
		}
	}
	
	public int getTaille() {
		return taille;
	}
	
	public Object getParcelle(int x, int y) {
		return grille[x][y].getParcelle();
	}
	
}