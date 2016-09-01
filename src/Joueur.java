import java.util.ArrayList;
import java.util.List;

public class Joueur {

	private List<Bateau> listeBateau = new ArrayList<>();
	
	/**
	 * Nombre de vies du bateau
	 * @return
	 */
	public int bateauAlive() {
		int total = 0;
		for (int i = 0; i < this.listeBateau.size(); i++) {
			total += this.listeBateau.get(i).getTaille();
		}		
		return total;
	}	
	

}
