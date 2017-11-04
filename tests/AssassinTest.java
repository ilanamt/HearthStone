package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Assassin;
import heartstone.Druid;
import heartstone.Warlock;

public class AssassinTest {

	private Assassin a;
	

	@Before
	public void setUp() throws Exception {
		a = new Assassin("Carlos", 10, 100);
		
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(a.getName());
		assertEquals(a.getName(), "Carlos");
	}
	
	@Test
	public void testLifePoints() {
		assertNotNull(a.getLifePoints());
		assertEquals(a.getLifePoints(), 100);
	}
	
	@Test
	public void testAttackPoints() {
		assertNotNull(a.getAttackPoints());
		assertEquals(a.getAttackPoints(), 10);
	}
	
	@Test
	public void testDamage() {
		assertNotNull(a.getDamage());
		assertEquals(a.getDamage(), 0);
	}

	@Test
	public void testAttackDruid() {
		Druid d;
		d = new Druid("Javier", 20, 150);
		d.attack(a);
		
		assertEquals(a.getAttackPoints(), 20);
	}
	
	@Test
	public void testAttackWarlock() {
		Warlock w;
		w = new Warlock("Felipe", 8, 90);
		w.attack(a);
		
		assertEquals(a.getDamage(), 16);
	}
	
	@Test
	public void testAttack() {
		Assassin b;
		b = new Assassin("Sebatian", 100, 100);
		b.attack(a);
		assertEquals(a.getDamage(), 100);
		a.attack(b);
		assertEquals(b.getDamage(), 0);
	}
}
