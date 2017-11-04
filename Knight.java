package heartstone;

/**
 * This class defines the Knight kind of players, which attack
 * by increasing other player's damage by their attack points,
 * except from the paladin.
 * @author Ilana Mergudich Thal
 */
public class Knight extends AbstractPlayer {

	public Knight(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this knight
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackKnight(this);
		}
	}
	
	/**
	 * Receives half of damage from an assassin
	 */
	@Override
	public void receiveAttackAssassin(Assassin assassin) {
		receiveAttack(assassin.getAttackPoints()/2);
	}
	
	/**
	 * Receives double damage from a hunter
	 */
	@Override
	public void receiveAttackHunter(Hunter hunter) {
		receiveAttack(2*hunter.getAttackPoints());
	}

}
