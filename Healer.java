package heartstone;

/**
 * This class defines the Healer kind of players, which attack
 * by restoring the amount of damage points of the healer's attack points,
 * only if the other player isn't already dead,
 * except from the warlock.
 * @author Ilana Mergudich Thal
 */
public class Healer extends AbstractPlayer {
	
	public Healer(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this healer
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackHealer(this);
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
	 * Receives double effect from a paladin
	 */
	@Override
	public void receiveAttackPaladin(Paladin paladin) {
		attack += 2*(paladin.getAttackPoints())/3;
		damage = Math.max(damage - 2*(paladin.getAttackPoints())/3, 0);
	}

}
