package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Mage;
import heartstone.Assassin;
import heartstone.Warlock;

public class MageTest{

	private Mage m;

	
	@Before
	public void setUp() throws Exception {
		m = new Mage("Cris", 10, 100);
	
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(m.getName());
		assertEquals(m.getName(), "Cris");
	}

	@Test
	public void testLifePoints() {
		assertNotNull(m.getLifePoints());
		assertEquals(m.getLifePoints(), 100);
	}

	@Test
	public void testAttackPoints() {
		assertNotNull(m.getAttackPoints());
		assertEquals(m.getAttackPoints(), 10);
	}

	@Test
	public void testDamage() {
		assertNotNull(m.getDamage());
		assertEquals(m.getDamage(), 0);
	}

	@Test
	public void testAttackAssassin() {
		Assassin a;
		a = new Assassin("Javier", 20, 150);
		a.attack(m);
	
		assertEquals(m.getDamage(), 40);
	}

	@Test
	public void testWarlock() {
		Warlock w;
		w = new Warlock("Felipe", 8, 90);
		w.attack(m);
	
		assertEquals(m.getDamage(), 4);
	}

	@Test
	public void testAttack() {
		Assassin a;
		a = new Assassin("Sebatian", 50, 100);
		m.attack(a);
		assertEquals(a.getDamage(), 10);
		a.attack(m);
		assertEquals(m.getDamage(), 100);
		m.attack(a);
		assertEquals(a.getDamage(), 10);
	}

}
