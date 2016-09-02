import static org.junit.Assert.*;

import org.junit.Test;

public class TestGrille {

	@Test
	public void testGrilleInitialisee() {
		
		Grille grille = new Grille();
		for (int i = 0; i < grille.getTailleGrille(); i++) {
			for (int j = 0; j < grille.getTailleGrille(); j++) {
				assertEquals( Case.EAU, grille.getCase(i,j) );
			}
		}
		
	}
	
	@Test
	public void testPlacementBateau() {
		
		Grille grille = new Grille();
		Bateau boat1 = new Bateau(4,0,0,Bateau.Vertical);
		Bateau boat2 = new Bateau(3,8,0,Bateau.Vertical);
		Bateau boat3 = new Bateau(4,0,1,Bateau.Horizontal);
		Bateau boat4 = new Bateau(3,0,8,Bateau.Horizontal);
		assertTrue( grille.placerBateau(boat1) );
		assertTrue( grille.placerBateau(boat3) );
		assertFalse( grille.placerBateau(boat2) );
		assertFalse( grille.placerBateau(boat4) );
		
	}

}
