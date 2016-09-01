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

}
