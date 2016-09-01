import static org.junit.Assert.*;

import org.junit.Test;

public class TestTourJoueur extends TourJoueur {
	

	public TestTourJoueur(Grille grilleJoueur, Grille grilleIa) {
		super(grilleJoueur, grilleIa);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testChiffre() {
		assertTrue( estChiffre('8') );
		assertFalse( estChiffre('a') );
	}
	
	@Test
	public void testLettre() {
		assertTrue( estLettre('r') );
		assertFalse( estLettre('5') );
	}
	
	@Test
	public void testCoordonnees() {
		fail("Not yet implemented");
	}

}
