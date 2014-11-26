package TextAdventure;

/*
 * Peter J.
 * D. 22 Nov. 2014
 */

public class Monster extends CombatStats
{
	
	private byte cr;
	
	public Monster()
	{
	}
	
	public Monster(String name, byte hp, byte ac, byte dmg, byte cr)
	{
		this.hp = hp;
		this.ac = ac;
		this.dmg = dmg;
		this.name = name;
		this.cr = cr;
		
	}
	
	public byte getCR()
	{
		return cr;
	}
	public void setCR(byte cr)
	{
		this.cr = cr;
	}
}
