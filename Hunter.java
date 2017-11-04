package heartstone;

/**
 * This class defines the Hunter kind of players, which attack
 * by increasing other player's damage by their attack points,
 * except from the knight and shaman.
 * @author Ilana Mergudich Thal
 */
public class Hunter extends AbstractPlayer {
	
	public Hunter(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this hunter
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackHunter(this);
		}
	}
	
	/**
	 * Only receives damage from a druid
	 */
	@Override
	public void receiveAttackDruid(Druid druid) {
		receiveAttack((druid.getAttackPoints())/2);
	}
	
	/**
	 * Receives double damage from a mage
	 */
	@Override
	public void receiveAttackMage(Mage mage) {
		receiveAttack(2*mage.getAttackPoints());
	}

}
