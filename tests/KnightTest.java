package heartstone.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import heartstone.Knight;
import heartstone.Assassin;
import heartstone.Hunter;

public class KnightTest {

private Knight k;
	

	@Before
	public void setUp() throws Exception {
		k = new Knight("Shrek", 10, 100);
		
	}

	@Test
	public void testPlayerHasName() {
		assertNotNull(k.getName());
		assertEquals(k.getName(), "Shrek");
	}
	
	@Test
	public void testLifePoints() {
		assertNotNull(k.getLifePoints());
		assertEquals(k.getLifePoints(), 100);
	}
	
	@Test
	public void testAttackPoints() {
		assertNotNull(k.getAttackPoints());
		assertEquals(k.getAttackPoints(), 10);
	}
	
	@Test
	public void testDamage() {
		assertNotNull(k.getDamage());
		assertEquals(k.getDamage(), 0);
	}

	@Test
	public void testAttackAssassin() {
		Assassin a;
		a = new Assassin("Javier", 20, 150);
		a.attack(k);
		
		assertEquals(k.getDamage(), 10);
	}
	
	@Test
	public void testAttackHunter() {
		Hunter h;
		h = new Hunter("Felipe", 8, 90);
		h.attack(k);
		
		assertEquals(k.getDamage(), 16);
	}
	
	@Test
	public void testAttack() {
		Hunter b;
		b = new Hunter("Sebatian", 50, 100);
		k.attack(b);
		assertEquals(b.getDamage(), 10);
		b.attack(k);
		assertEquals(k.getDamage(), 100);
		k.attack(b);
		assertEquals(b.getDamage(), 10);
	}

}
