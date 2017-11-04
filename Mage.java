package heartstone;

/**
 * This class defines the Mage kind of players, which attack
 * by increasing other player's damage by their attack points,
 * except from the hunter and paladin.
 * @author Ilana Mergudich Thal
 */
public class Mage extends AbstractPlayer {

	public Mage(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this mage
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackMage(this);
		}	
	}
	
	/**
	 * Receives double damage from an assassin
	 */
	@Override
	public void receiveAttackAssassin(Assassin assassin) {
		receiveAttack(2*assassin.getAttackPoints());
	}
	
	/**
	 * Receives half damage from a warlock
	 */
	@Override
	public void receiveAttackWarlock(Warlock warlock) {
		receiveAttack(warlock.getAttackPoints()/2);
	}

}
