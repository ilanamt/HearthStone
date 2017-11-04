package heartstone;

/**
 * This class defines the Druid kind of players, which attack
 * by increasing other player's damage by half of their attack points
 * and increasing the other player's attack points by their attack points
 * except from the assassin and the hunter.
 * @author Ilana Mergudich Thal
 */
public class Druid extends AbstractPlayer {

	public Druid(String aName, int attackPoints, int lPoints) {
		super(aName, attackPoints, lPoints);
	}

	/**
	 * The indicated player receives an attack from this druid
	 */
	@Override
	public void attack(IPlayer player) {
		if(lifePoints > damage) {
			player.receiveAttackDruid(this);
		}
	}
	
	/**
	 * Receives double effect from a paladin
	 */
	@Override
	public void receiveAttackPaladin(Paladin paladin) {
		attack += 2*(paladin.getAttackPoints())/3;
		damage = Math.max(damage - 2*(paladin.getAttackPoints())/3,0);
	}
	
	/**
	 * Receives double effect from a shaman
	 */
	@Override
	public void receiveAttackShaman(Shaman shaman) {
		attack = Math.max(attack - 2*(shaman.getAttackPoints())/3, 0);
		receiveAttack(2*(shaman.getAttackPoints())/3);
	}

}
