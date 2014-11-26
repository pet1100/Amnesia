package TextAdventure;

/*
 * Peter J.
 * D. 22 Nov. 2014
 */

import java.io.Serializable;

public class SaveWrapper implements Serializable
{
	private Inventory inventory = new Inventory();
	private Player player = new Player();
	private AmnesiaMap map = new AmnesiaMap();
	
	public SaveWrapper(Inventory inventory, Player player, AmnesiaMap map)
	{
		this.inventory = inventory;
		this.player = player;
		this.map = map;
	}
	
	public SaveWrapper()
	{
		
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	public AmnesiaMap getMap()
	{
		return map;
	}
	
	public Inventory getInventory()
	{
		return inventory;
	}
	
	
	
}
