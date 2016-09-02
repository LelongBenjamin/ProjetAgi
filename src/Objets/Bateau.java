package Objets;

public class Bateau {

	private int taille;
	private int x;
	private int y;
	private boolean orientation;

	public static boolean Vertical = true;
	public static boolean Horizontal = false;

	/**
	 * Constructeur: cree un bateau en fonction d'un taille, sa position et son orientation
	 * @param taille
	 * @param x
	 * @param y
	 * @param orientation
	 */
	public Bateau(int taille, int x, int y, boolean orientation) {
		this.taille = taille;
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	
	
	/**
	 * Renvoi si le bateau est encore en vie
	 * @param grille
	 * @return
	 */
	public boolean estCoule(Grille grille) {
		
		if (orientation) {

			for (int i = x; i < x + taille; i++) {

				if (grille.getCases()[i][y].equals(Case.BATEAU)) {
					return false;
				}
			}
			
		} else {

			for (int i = y; i < y + taille; i++) {

				if (grille.getCases()[x][i].equals(Case.BATEAU)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Renvoie la position x
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * Definit la position x
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Renvoie la position y
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * Definit la position y
	 * @param y
	 */
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


	public boolean isOrientation() {
		return orientation;
	}

	public void setOrientation(boolean orientation) {
		this.orientation = orientation;
	}

	/**
	 * Retourne la taille du bateau
	 * 
	 * @return
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * Definit la taille du bateau
	 * 
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
			this.taille = taille - 1;
		}
	}

}
