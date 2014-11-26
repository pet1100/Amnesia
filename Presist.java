package TextAdventure;

/*
 * Peter J.
 * D. 22 Nov. 2014
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Presist
{
	private String fileName = "AmnesiaSaved.txt";
	
	public void save(Inventory inventory, Player player, AmnesiaMap map)
	{
		saveGame(new SaveWrapper(inventory, player, map));
	}
	
	private void saveGame(SaveWrapper saves)
	{
		FileOutputStream fileOut = null;
		ObjectOutputStream out = null;
		try
		{
			File yourFile = new File(fileName);
			yourFile.createNewFile();
			
			fileOut = new FileOutputStream(fileName, false);
			out = new ObjectOutputStream(fileOut);
			out.writeObject(saves);
			if(Test.test) System.out.println("Saved");
		}
		catch (IOException i)
		{
			i.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
				fileOut.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public SaveWrapper load()
	{

		SaveWrapper saved = new SaveWrapper();
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);

			try {
				saved = (SaveWrapper) in.readObject();
				if(Test.test) System.out.println("Loaded");
			}
			catch (Exception e) {

			}

			in.close();
			fileIn.close();
		}
		catch (IOException i) {

		}
		return saved;
	}

}
