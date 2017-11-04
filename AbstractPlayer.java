package heartstone;

/**
 * This class defines the methods for all kinds of players, including the getters
 * and specifying how each of them attacks others.
 * @author Ilana Mergudich Thal
 */
public abstract class AbstractPlayer implements IPlayer {
	
	protected String name;
	protected int lifePoints;
	protected int damage;
	protected int attack;
	
	/**
	 * class constructor
	 * @param aName player name
	 * @param attackPoints player attack points
	 * @param lPoints player life points
	 */
	public AbstractPlayer(String aName, int attackPoints, int lPoints) {
		name = aName;
		attack = attackPoints;
		damage = 0;
		lifePoints = lPoints;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getAttackPoints() {
		return attack;
	}
	
	public void receiveAttack(int ap) {
		damage += ap;
	}
	
	public abstract void attack(IPlayer player);
	
	public void receiveAttackAssassin(Assassin assassin) {
		receiveAttack(assassin.getAttackPoints());
	}
	
	public void receiveAttackDruid(Druid druid) {
		attack += druid.getAttackPoints();
		receiveAttack((druid.getAttackPoints())/2);
	}
	
	public void receiveAttackHealer(Healer healer) {
		if(lifePoints > damage) {
			damage = Math.max(damage - (healer.getAttackPoints())/2, 0);
		}
	} 
	
	public void receiveAttackHunter(Hunter hunter) {
		receiveAttack(hunter.getAttackPoints());
	}
	
	public void receiveAttackKnight(Knight knight) {
		receiveAttack(knight.getAttackPoints());
	}
	
	public void receiveAttackMage(Mage mage) {
		receiveAttack(mage.getAttackPoints());
	}
	
	public void receiveAttackPaladin(Paladin paladin) {
		attack += (paladin.getAttackPoints())/3;
		damage = Math.max(damage - (paladin.getAttackPoints())/3, 0);
	}
	
	public void receiveAttackShaman(Shaman shaman) {
		attack = Math.max(attack - (shaman.getAttackPoints())/3, 0);
		receiveAttack((shaman.getAttackPoints())/3);
	}
	
	public void receiveAttackWarlock(Warlock warlock) {
		receiveAttack(warlock.getAttackPoints());
	}
}
