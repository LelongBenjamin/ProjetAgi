

public class Bateau {

	private int taille;
	private int x;
	private int y;
	private boolean orientation;
	
	static boolean Vertical = true;
	static boolean Horizontal = false;
	
	public boolean estCoule(Grille grille) {
		
		/*if (orientation == true) { //vertical
			
			for (int i = x; i < x+taille; i++) {
				
			}
			
			
		}
		
		if (grille.getCases()[x][y] == Case.TIRTOUCHE) {
			
		}
		*/
		return false;
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static boolean isVertical() {
		return Vertical;
	}

	public static void setVertical(boolean vertical) {
		Vertical = vertical;
	}

	public static boolean isHorizontal() {
		return Horizontal;
	}

	public static void setHorizontal(boolean horizontal) {
		Horizontal = horizontal;
	}

	public Bateau(int taille, int x, int y, boolean orientation){
		this.taille = taille;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	public boolean isOrientation() {
		return orientation;
	}

	public void setOrientation(boolean orientation) {
		this.orientation = orientation;
	}

	/**
	 * Retourne la taille du bateau
	 * @return
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * Definit la taille du bateau
	 * @param taille
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	/**
	 * Retire une vie du bateau
	 */
	public void toucherBateau() {
		if (this.taille > 0) {
			this.taille = taille-1;
		}
	}
	
}
