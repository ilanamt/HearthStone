package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Assassin;
import heartstone.Druid;
import heartstone.Paladin;
import heartstone.Shaman;

public class DruidTest {

	private Druid d1;

	@Before
	public void setUp() throws Exception {
		d1 = new Druid("Ana", 10, 100);
		
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(d1.getName());
		assertEquals(d1.getName(), "Ana");
	}
	
	@Test
	public void testLifePoints() {
		assertNotNull(d1.getLifePoints());
		assertEquals(d1.getLifePoints(), 100);
	}
	
	@Test
	public void testAttackPoints() {
		assertNotNull(d1.getAttackPoints());
		assertEquals(d1.getAttackPoints(), 10);
	}
	
	@Test
	public void testDamage() {
		assertNotNull(d1.getDamage());
		assertEquals(d1.getDamage(), 0);
	}

	@Test
	public void testAttackPaladin() {
		Assassin a;
		Paladin p;
		p = new Paladin("Catalina", 30, 150);
		a = new Assassin("Constanza", 15, 100);
		a.attack(d1);
		p.attack(d1);
		
		assertEquals(d1.getAttackPoints(), 30);
		assertEquals(d1.getDamage(), 0);
	}
	
	@Test
	public void testAttackShaman() {
		Shaman s;
		s = new Shaman("Felipe", 9, 90);
		s.attack(d1);
		
		assertEquals(d1.getDamage(), 6);
		assertEquals(d1.getAttackPoints(), 4);
	}
	
	@Test
	public void testAttack() {
		Druid d2;
		d2 = new Druid("Carla", 200, 100);
		d2.attack(d1);
		assertEquals(d1.getDamage(), 100);
		d2.attack(d1);
		assertEquals(d2.getDamage(), 0);
	}

}
