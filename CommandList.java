package TextAdventure;

import java.util.ArrayList;

/*
 * Peter J.
 * D. 25 Nov. 2014
 */

public class CommandList
{

	private boolean test = true; //Bare til at teste stuff.

	
	String[] commandList = new String[]
	{ "USE", "SEARCH", "NORTH", "SOUTH", "WEST", "EAST", "EXIT", "HELP",
			"INVENTORY", "SAVE", "LOAD", "MAP", "COMBINE" };

	Presist pr = new Presist(); //Til presist for at gemme.

	public CommandList()
	{
		System.out.println(commandList);
	}

	public void useCommand(String command) // What command is used and give work
											// out.
	{
		boolean fail = true;
		for (String tmp : commandList)
		{
			if (tmp.equalsIgnoreCase(command.substring(0, 3)))
			{
				fail = false;
			}
		}
		if (fail = true)
		{
			if (test) System.out.println("You can't do that.");
			return; // Break method if the command input is false
		}
		if (command.equalsIgnoreCase(Commands.EAST.toString())
				|| command.equalsIgnoreCase(Commands.SOUTH.toString())
				|| command.equalsIgnoreCase(Commands.NORTH.toString())
				|| command.equalsIgnoreCase(Commands.WEST.toString()))
		{
			walk(command.toUpperCase().charAt(0));
		}
		else if (command.substring(0, 3).equalsIgnoreCase(
				Commands.USE.toString()))
		{
			use(command.toUpperCase().replace("USE ", ""));
		}
		else if (command.substring(0, 5).equalsIgnoreCase(
				Commands.SEARCH.toString()))
		{
			search(command.toUpperCase().replace("SEARCH ", ""));
		}
		else if (command.substring(0, 4).equalsIgnoreCase(
				Commands.EXIT.toString()))
		{
			exit();
		}
		else if (command.substring(0, 4).equalsIgnoreCase(
				Commands.HELP.toString()))
		{
			help();
		}
		else if (command.substring(0, 9).equalsIgnoreCase(
				Commands.INVENTORY.toString()))
		{
			inventory();
		}
		else if (command.substring(0, 4).equalsIgnoreCase(
				Commands.SAVE.toString()))
		{
			if(test);
//			save(inv, map);
		}
		else if (command.substring(0, 4).equalsIgnoreCase(
				Commands.LOAD.toString()))
		{
			load();
		}
		else if (command.substring(0, 3).equalsIgnoreCase(
				Commands.MAP.toString()))
		{
			map();
		}
		else if (command.substring(0, 7).equalsIgnoreCase(
				Commands.COMBINE.toString()))
		{
			combine(command.toUpperCase().replace("COMBINE ", ""));
		}
		else
		{
			if (test) System.out.println("Something is wrong...");
		}
		fail = false;

	}

	private void combine(String stuff)
	{
		short ID1 = 0;
		short ID2 = 0;
		if(test);
//		for (Inventory temp : Inventory.getList())
//		{
//			if(temp.getItem().getName().equalsIgnoreCase(stuff.substring(0, temp.getItem().getName().lenght))){
//				ID1 = temp.getItem().getID();
//				break;
//			}
//		}
//		
//		for (Inventory temp : Inventory.getList())
//		{
//			if(temp.getItem().getName().equalsIgnoreCase(stuff.substring(0, temp.getItem().getName().lenght))){
//				ID2 = temp.getItem().getID();
//				break;
//			}
//		}
	}

	public void use(String stuff)
	{

	}

	public void search(String object)
	{
		ArrayList<Object> objectList = new ArrayList<Object>();
//		objectList = map.getAllObjectsInRoom();
		if(objectList.toString().toUpperCase().contains(object.toUpperCase()))
		{
		for(Object tmp : objectList)
		{
			if(test);
//			if (tmp.getName().equalsIgnoreCase(object))
//			{
//				tmp.search();
//			}
		}
		}
		else if(test) System.out.println("Responds på fejl...");
	}

	public void walk(char direction)
	{
		if(test);
		Player p = new Player();
		switch (direction) //flytter spilleren
		{
			case 'N':
				p.changePlayerY((byte)1);
				break;
			case 'E':
				p.changePlayerY((byte)1);
				break;
			case 'W':
				p.changePlayerY((byte)-1);
				break;
			case 'S':
				p.changePlayerY((byte)-1);
				break;

			default:
				break;
		}
//		if(AmnesiaMap.getRoom(Player.getPlayerX(), Player.getPlayerY())) //Is the room accesible
//		{
			if(test);
//		}
		else
		{
			if(test) System.out.println("You can't do that.");
			
			switch (direction) //Move player beck if the room ain't accesible
			{
				case 'N':
					p.changePlayerY((byte)-1);
					break;
				case 'E':
					p.changePlayerY((byte)-1);
					break;
				case 'W':
					p.changePlayerY((byte)1);
					break;
				case 'S':
					p.changePlayerY((byte)1);
					break;

				default:
					break;
			}
		}
		
	}

	public void fight(String monster) //Not sure if this should be here, but starts a fight with a monster.
	{
		if(test);
	}

	public void exit() //Flat out exit the game.
	{
		System.exit(1);
	}

	public void help() //Send the help info back depending on where the player is.
	{
		String help = null;
//		help = Player.helpcase;
		switch (help)
		{
			case "defualt":

				break;

			case "combat":

				break;

			default:
				break;
		}
	}

	public void save(Inventory inventory, Player p, AmnesiaMap map) //Save game.
	{
		pr.save(inventory, p, map);
	}

	public void load() //load game.
	{
		SaveWrapper sw = pr.load();
	}

	public void inventory() //Opens inventory (calls something in inventory)
	{
		if(test);
	}

	public void map() //shows the map.
	{
		if(test);
	}
}
