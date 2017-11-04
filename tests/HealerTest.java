package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Assassin;
import heartstone.Healer;
import heartstone.Paladin;

public class HealerTest {

private Healer h;
	

	@Before
	public void setUp() throws Exception {
		h = new Healer("Tania", 10, 100);
		
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(h.getName());
		assertEquals(h.getName(), "Tania");
	}
	
	@Test
	public void testLifePoints() {
		assertNotNull(h.getLifePoints());
		assertEquals(h.getLifePoints(), 100);
	}
	
	@Test
	public void testAttackPoints() {
		assertNotNull(h.getAttackPoints());
		assertEquals(h.getAttackPoints(), 10);
	}
	
	@Test
	public void testDamage() {
		assertNotNull(h.getDamage());
		assertEquals(h.getDamage(), 0);
	}

	@Test
	public void testAttackAssassin() {
		Assassin a;
		a = new Assassin("Javier", 20, 150);
		a.attack(h);
		
		assertEquals(h.getDamage(), 40);
	}
	
	@Test
	public void testAttackPaladin() {
		Assassin a;
		Paladin p;
		p = new Paladin("Felipe", 9, 90);
		a = new Assassin("As", 20, 200);
		a.attack(h);
		p.attack(h);
		
		assertEquals(h.getAttackPoints(), 16);
		assertEquals(h.getDamage(), 34);
	}
	
	@Test
	public void testAttack() {
		Assassin b;
		b = new Assassin("Sebatian", 50, 100);
		h.attack(b);
		assertEquals(b.getDamage(), 0);
		b.attack(h);
		assertEquals(h.getDamage(), 100);
		h.attack(b);
		assertEquals(b.getDamage(), 0);
	}

}
