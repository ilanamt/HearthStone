package heartstone;

/**
 * This class defines the Shaman kind of players, which attack
 * by increasing other player's damage by a third of their attack points
 * and decreasing the other player's attack points by  a third  of
 * their attack points, except from the druid and the warlock.
 * @author Ilana Mergudich Thal
 */
public class Shaman extends AbstractPlayer {

	public Shaman(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this shaman
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackShaman(this);
		}
	}

	/**
	 * Receives double damage from a hunter
	 */
	@Override
	public void receiveAttackHunter(Hunter hunter) {
		receiveAttack(2*hunter.getAttackPoints());
	}
}
