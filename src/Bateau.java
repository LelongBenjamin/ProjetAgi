

public class Bateau {

	private int taille;
	private int x;
	private int y;
	
	static boolean Vertical = true;
	static boolean Horizontal = false;
	
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

	public Bateau(int taille, int x, int y, boolean Orientation){
		this.taille = taille;
		this.x = x;
		this.y = y;
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
		this.taille = taille-1;
	}
	
}
