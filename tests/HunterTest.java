package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Assassin;
import heartstone.Druid;
import heartstone.Hunter;
import heartstone.Mage;

public class HunterTest {

private Hunter h;
	

	@Before
	public void setUp() throws Exception {
		h = new Hunter("Pepo", 10, 100);
		
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(h.getName());
		assertEquals(h.getName(), "Pepo");
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
	public void testAttackDruid() {
		Druid d;
		d = new Druid("Javiera", 20, 150);
		d.attack(h);
		
		assertEquals(h.getDamage(), 10);
	}
	
	@Test
	public void testAttackMage() {
		Mage m;
		m = new Mage("Felipe", 9, 90);
		m.attack(h);
		
		assertEquals(h.getDamage(), 18);
	}
	
	@Test
	public void testAttack() {
		Assassin b;
		b = new Assassin("Sebatian", 100, 100);
		h.attack(b);
		assertEquals(b.getDamage(), 10);
		b.attack(h);
		h.attack(b);
		assertEquals(b.getDamage(), 10);
	}


}
