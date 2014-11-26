package TextAdventure;

/*
 * Peter J.
 * D. 22 Nov. 2014
 */



public class Player extends CombatStats 
{
	private byte posistionX;
	private byte posistionY;
	
	public Player(String name)
	{
		this.name = name;
	}
	
	public Player()
	{
		
	}

	public byte getPlayerY()
	{
		return posistionY;
	}

	public void changePlayerY(byte y)
	{
		this.posistionY += y;
	}

	public byte getPlayerX()
	{
		return posistionX;
	}

	public void changePlayerX(byte x)
	{
		this.posistionX += x;
	}
	
	

}
