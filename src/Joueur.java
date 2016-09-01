import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Joueur {

	private List<Bateau> listeBateau = new ArrayList<>();
	private int vies;
	
	public Joueur(Grille grille, boolean ia) {
		if(!ia){
			int[] tab = new int[]{5,4,3,3,2};
		
			for (int i = 0; i < tab.length; i++) {
				boolean valide = false;
				Bateau bato = null;
				while(!valide){
					Main.clearTerminal();
					grille.afficherGrille();
					System.out.print("Donnez les coordonnees pour le bateau de " + tab[i] + ": ");
					int[] cood = TourJoueur.demanderCoordonnees();
					boolean orientation = demanderOrientation();
				
					bato = new Bateau(tab[i], cood[1], cood[0], orientation);				
					valide = grille.placerBateau(bato);
				
				}
				listeBateau.add(bato);
			}
		}else{
			int[] tab = new int[]{5,4,3,3,2};
			
			for (int i = 0; i < tab.length; i++) {
				boolean valide = false;
				Bateau bato = null;
				while(!valide){
					boolean orientation;
					int[] cood = TourIa.coorAleatoires();
					if(new Random().nextInt(2)==1){
						orientation=true;
					}else{
						orientation = false;
					}
				
					bato = new Bateau(tab[i], cood[1], cood[0], orientation);				
					valide = grille.placerBateau(bato);
				
				}
				listeBateau.add(bato);
			}
		}
		
		this.vies = nombreDeVies();
		
		Main.clearTerminal();
	}
	
	public boolean demanderOrientation(){
		System.out.print("\n (1) verticale (2) horizontal : ");
		Scanner sc = new Scanner(System.in);
		String mess = sc.nextLine();
		
		if(mess.length() == 1 && ( mess.charAt(0) == '1' || mess.charAt(0) == '2')){
			if(mess.charAt(0) == '1'){
				return true;
			}
			return false;
		}else{
			demanderOrientation();
		}
		return false;
	}
	
	/**
	 * Nombre de vies du bateau
	 * @return
	 */
	public int nombreDeVies() {
		int total = 0;
		for (int i = 0; i < this.listeBateau.size(); i++) {
			total += this.listeBateau.get(i).getTaille();
		}		
		return total;
	}

	public List<Bateau> getListeBateau() {
		return listeBateau;
	}

	public void setListeBateau(List<Bateau> listeBateau) {
		this.listeBateau = listeBateau;
	}

	public int getVies() {
		return vies;
	}

	public void setVies(int vies) {
		this.vies = vies;
	}
	
	public void enleverUneVie() {
		this.vies = this.vies - 1;
	}
	

}
