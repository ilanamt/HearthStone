package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Warlock;
import heartstone.Healer;
import heartstone.Shaman;

public class WarlockTest {

private Warlock w;
	

	@Before
	public void setUp() throws Exception {
		w = new Warlock("Rob", 10, 100);
		
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(w.getName());
		assertEquals(w.getName(), "Rob");
	}
	
	@Test
	public void testLifePoints() {
		assertNotNull(w.getLifePoints());
		assertEquals(w.getLifePoints(), 100);
	}
	
	@Test
	public void testAttackPoints() {
		assertNotNull(w.getAttackPoints());
		assertEquals(w.getAttackPoints(), 10);
	}
	
	@Test
	public void testDamage() {
		assertNotNull(w.getDamage());
		assertEquals(w.getDamage(), 0);
	}

	@Test
	public void testAttackHealer() {
		Healer h;
		h = new Healer("Javier", 20, 150);
		h.attack(w);
		
		assertEquals(w.getDamage(), 20);
	}
	
	@Test
	public void testAttackShaman() {
		Shaman s;
		s = new Shaman("Felipe", 9, 90);
		s.attack(w);
		
		assertEquals(w.getDamage(), 6);
		assertEquals(w.getAttackPoints(), 4);
	}
	
	@Test
	public void testAttack() {
		Healer b;
		b = new Healer("Sebatian", 100, 100);
		w.attack(b);
		assertEquals(b.getDamage(), 10);
		b.attack(w);
		assertEquals(w.getDamage(), 100);
		w.attack(b);
		assertEquals(b.getDamage(), 10);
	}

}
