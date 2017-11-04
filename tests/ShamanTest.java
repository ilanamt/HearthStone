package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Shaman;
import heartstone.Hunter;

public class ShamanTest {

private Shaman s;

	
	@Before
	public void setUp() throws Exception {
		s = new Shaman("Kim", 12, 100);
	
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(s.getName());
		assertEquals(s.getName(), "Kim");
	}

	@Test
	public void testLifePoints() {
		assertNotNull(s.getLifePoints());
		assertEquals(s.getLifePoints(), 100);
	}

	@Test
	public void testAttackPoints() {
		assertNotNull(s.getAttackPoints());
		assertEquals(s.getAttackPoints(), 12);
	}

	@Test
	public void testDamage() {
		assertNotNull(s.getDamage());
		assertEquals(s.getDamage(), 0);
	}

	@Test
	public void testAttackHunter() {
		Hunter h;
		h = new Hunter("Javier", 20, 150);
		h.attack(s);
	
		assertEquals(s.getDamage(), 40);
	}


	@Test
	public void testAttack() {
		Hunter h;
		h = new Hunter("Javier", 100, 150);
		s.attack(h);
		assertEquals(h.getAttackPoints(), 96);
		assertEquals(h.getDamage(), 4);
		h.attack(s);
		assertEquals(s.getDamage(), 192);
		s.attack(h);
		assertEquals(h.getAttackPoints(), 96);
		assertEquals(h.getDamage(), 4);
	}

}
