package heartstone;

/**
 * This class defines the Paladin kind of players, which attack
 * by restoring other player's damage by a third of their attack points
 * and increasing the other player's attack points by  a third  of
 * their attack points, except from the druid and the healer.
 * @author Ilana Mergudich Thal
 */
public class Paladin extends AbstractPlayer {

	public Paladin(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this paladin
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackPaladin(this);
		}
	}

	/**
	 * Receives half damage from a knight
	 */
	@Override
	public void receiveAttackKnight(Knight knight) {
		receiveAttack(knight.getAttackPoints()/2);
	}
	
	/**
	 * Receives double damage from a mage
	 */
	@Override
	public void receiveAttackMage(Mage mage) {
		receiveAttack(2*mage.getAttackPoints());
	}
}
