
public class Bateau {

	private int taille;

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
