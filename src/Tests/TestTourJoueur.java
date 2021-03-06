package Tests;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Intelligence.TourJoueur;

public class TestTourJoueur {

	@Test
	public void testChiffre() {
		boolean l1 = TourJoueur.estChiffre('8');
		boolean l2 = TourJoueur.estChiffre('a');
		assertTrue( l1 );
		assertFalse( l2 );
	}
	
	@Test
	public void testLettre() {
		assertTrue( TourJoueur.estLettre('A') );
		assertFalse( TourJoueur.estLettre('K') );
		assertFalse( TourJoueur.estLettre('5') );
	}
		
	//La fonction demanderCoordonnees est un processus en jeu, difficilement testable

}
