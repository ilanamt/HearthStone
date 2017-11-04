package heartstone;

/**
 * This class defines the Warlock kind of players, which attack
 * by increasing other player's damage by their attack points,
 * except from the assassin and the mage.
 * @author Ilana Mergudich Thal
 */
public class Warlock extends AbstractPlayer {

	public Warlock(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this warlock
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackWarlock(this);
		}
	}

	/**
	 * Instead of healing, the healer attacks with all of its attack points
	 */
	@Override
	public void receiveAttackHealer(Healer healer) {
		receiveAttack(healer.getAttackPoints());
	}
	
	/**
	 * Receives double effect from shaman
	 */
	@Override
	public void receiveAttackShaman(Shaman shaman) {
		attack = Math.max(attack - (2*shaman.getAttackPoints())/3, 0);
		receiveAttack(2*(shaman.getAttackPoints())/3);
	}
}
