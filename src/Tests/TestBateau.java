package Tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Objets.Bateau;
import Objets.Grille;

public class TestBateau {

	@Test
	public void testOrientation() {
		
		Bateau boat1 = new Bateau(4,0,0,Bateau.Vertical);
		Bateau boat2 = new Bateau(4,0,1,Bateau.Horizontal);
		assertEquals(Bateau.Vertical, boat1.isOrientation());
		assertEquals(Bateau.Horizontal, boat2.isOrientation());
		
	}
	
	@Test
	public void testEstCoule() {
		
		Grille grille = new Grille();
		Bateau boat1 = new Bateau(4,0,0,Bateau.Vertical);
		Bateau boat2 = new Bateau(0,0,1,Bateau.Horizontal);
		grille.placerBateau(boat1);
		grille.placerBateau(boat2);
		assertFalse(boat1.estCoule(grille));
		assertTrue(boat2.estCoule(grille));
		
	}
	
	@Test
	public void testToucheBateau() {
		
		Grille grille = new Grille();
		Bateau boat1 = new Bateau(4,0,0,Bateau.Vertical);
		grille.placerBateau(boat1);
		boat1.toucherBateau();
		assertEquals(3, boat1.getTaille());
		
	}

}
