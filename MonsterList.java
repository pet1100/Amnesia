package TextAdventure;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Peter J.
 * D. 22 Nov. 2014
 */

public class MonsterList {
	private ArrayList<Monster> monsters = new ArrayList<>();
	
	public MonsterList()
	{
		//String name, byte hp, byte ac, byte dmg, byte cr
		monsters.addAll(makeMonsters());
	}
	
	public ArrayList<Monster> getMonsterList()
	{
		return monsters;
	}
	
	private ArrayList<Monster> makeMonsters()
	{
		Monster[] list = new Monster[]{
				new Monster("Skeleton", (byte)40, (byte)40, (byte)40, (byte) 40),
				new Monster("Archer", (byte)10, (byte)15, (byte)15, (byte) 15)
		};
		
		ArrayList<Monster> mlist = new ArrayList<>();
		mlist.addAll(Arrays.asList(list));
		
		
		return mlist;
	}

}
