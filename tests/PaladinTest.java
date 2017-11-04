package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Paladin;
import heartstone.Mage;
import heartstone.Knight;

public class PaladinTest {

private Paladin p;

	
	@Before
	public void setUp() throws Exception {
		p = new Paladin("Kate", 12, 100);
	
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(p.getName());
		assertEquals(p.getName(), "Kate");
	}

	@Test
	public void testLifePoints() {
		assertNotNull(p.getLifePoints());
		assertEquals(p.getLifePoints(), 100);
	}

	@Test
	public void testAttackPoints() {
		assertNotNull(p.getAttackPoints());
		assertEquals(p.getAttackPoints(), 12);
	}

	@Test
	public void testDamage() {
		assertNotNull(p.getDamage());
		assertEquals(p.getDamage(), 0);
	}

	@Test
	public void testAttackKnight() {
		Knight k;
		k = new Knight("Javier", 20, 150);
		k.attack(p);
	
		assertEquals(p.getDamage(), 10);
	}

	@Test
	public void testAttackMage() {
		Mage m;
		m = new Mage("Felipe", 8, 90);
		m.attack(p);
	
		assertEquals(p.getDamage(), 16);
	}

	@Test
	public void testAttack() {
		Knight k;
		k = new Knight("Sebatian", 200, 100);
		p.attack(k);
		assertEquals(k.getAttackPoints(), 204);
		assertEquals(k.getDamage(), 0);
		k.attack(p);
		assertEquals(p.getDamage(), 102);
		p.attack(k);
		assertEquals(k.getAttackPoints(), 204);
		assertEquals(k.getDamage(), 0);
	}


}
