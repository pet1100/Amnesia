package TextAdventure;

public enum Commands
{
	PICKUP {
		public String toString()
		{
			return "PICK UP";
		}
	},
	USE, SEARCH, NORTH, SOUTH, WEST, EAST, EXIT, HELP, INVENTORY, SAVE, LOAD, MAP, COMBINE
}
