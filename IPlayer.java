package heartstone;

public interface IPlayer {
	
	/**
	 * @return player name
	 */
	public String getName();
	
	/**
	 * @return player life points
	 */
	public int getLifePoints();
	
	/**
	 * @return player damage
	 */
	public int getDamage();
	
	/**
	 * @return player attack points
	 */
	public int getAttackPoints();
	
	/**
	 * Increases damage by the amount of attack points indicated
	 * @param ap attack points received
	 */
	public void receiveAttack(int ap);
	
	/**
	 * This method attacks a player depending on the attacking
	 * player type and the attacked player type.
	 * The attack only occurs if the amount of life points is
	 * greater than the amount of damage.
	 * @param player player that is going to be attacked
	 */
	public void attack(IPlayer player);
	
	/**
	 * Player receives attack from an assassin, its damage increases by
	 * the assassin's attack points.
	 * @param assassin assassin that card is receiving the attack from
	 */
	public void receiveAttackAssassin(Assassin assassin);
	
	/**
	 * Player receives attack from a druid, it increases attack points by
	 * all of the druid's attack points and it increases damage by half of
	 * the druid's attack points.
	 * @param druid druid that player is receiving the attack from
	 */
	public void receiveAttackDruid(Druid druid);
	
	/**
	 * Player receives attack from a healer, it restores damage by half of
	 * the healer's attack points.
	 * @param healer healer that player is receiving the attack from
	 */
	public void receiveAttackHealer(Healer healer);
	
	/**
	 * Player receives attack from a hunter, its damage increases by
	 * the hunter's attack points.
	 * @param hunter hunter that player is receiving the attack from
	 */
	public void receiveAttackHunter(Hunter hunter);
	
	/**
	 * Player receives attack from a knight, its damage increases by
	 * the knight's attack points.
	 * @param knight knight that player is receiving the attack from
	 */
	public void receiveAttackKnight(Knight knight);
	
	/**
	 * Player receives attack from a mage, its damage increases by
	 * the mage's attack points.
	 * @param mage mage that player is receiving the attack from
	 */
	public void receiveAttackMage(Mage mage);
	
	/**
	 * Player receives attack from a paladin, it increases the attack points
	 * and restores damage points by a third of the paladin's attack points.
	 * @param paladin paladin that player is receiving the attack from
	 */
	public void receiveAttackPaladin(Paladin paladin);
	
	/**
	 * Player receives attack from a shaman, it decreases the attack points
	 * and increases damage points by a third of the shaman's attack points.
	 * @param shaman shaman that player is receiving the attack from
	 */
	public void receiveAttackShaman(Shaman shaman);
	
	/**
	 * Player receives attack from a warlock, its damage increases by
	 * the warlock's attack points.
	 * @param warlock warlock that player is receiving the attack from
	 */
	public void receiveAttackWarlock(Warlock warlock);
	
	
}
