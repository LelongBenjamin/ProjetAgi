import static org.junit.Assert.*;

import org.junit.Test;

public class TestBateau {

	@Test
	public void testOrientation() {
		
		Bateau boat1 = new Bateau(4,0,0,Bateau.Vertical);
		Bateau boat2 = new Bateau(4,0,1,Bateau.Horizontal);
		assertEquals(Bateau.Vertical, boat1.isOrientation());
		assertEquals(Bateau.Horizontal, boat2.isOrientation());
		
	}

}
