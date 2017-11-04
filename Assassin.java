package heartstone;

/**
 * This class defines the Assassin kind of players, which attack
 * by increasing other player's damage by their attack points,
 * except from the healer, the knight and the mage.
 * @author Ilana Mergudich Thal
 */
public class Assassin extends AbstractPlayer {

	public Assassin(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this assassin
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackAssassin(this);
		}
	}
	
	/**
	 * Only receives attack points from a druid, but only half
	 */
	@Override
	public void receiveAttackDruid(Druid druid) {
		attack += (druid.getAttackPoints()/2);
	}
	
	/**
	 * Receives double damage from a warlock
	 */
	@Override
	public void receiveAttackWarlock(Warlock warlock) {
		receiveAttack(2*warlock.getAttackPoints());
	}
}
