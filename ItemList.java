/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Markus
 */
public class ItemList
{
    UselessItem[] uselessItemList = new UselessItem[]
    {
        new UselessItem("Coconuts", (short)0, 
                "+5 Riding Skill.\n"),
        new UselessItem("Guardian Trinket", (short)0, 
                "Passive effect:\n" +
                "Any damage taken is redirected to you manapool.\n" +
                "If only this game allowed a manapool...\n")
    };
    
    Weapon[] weaponList = new Weapon[]
    {
        new Weapon("Shortsword", (short)0, 
                "A small straight sword.\n" +
                "Longer than a dagger, but still lightweight.\n" +
                "Widely used, as it requires no particular strength.\n" +
                "A reasonable choice that will suffice in many situations,\n" + 
                "but not the thing to take along if you expect to face any serious challenge.\n", 
                (byte)30, (byte)1, (byte)5),
        new Weapon("Longsword", (short)0, 
                "Standard straight sword.\n" +
                "This straight sword is sufficient in most respects,\n" + 
                "and effective in most situations if wielded properly.\n" + 
                "Those who aspire to master the sword are\n" + 
                "certain to wield this at some point during their journey.\n", 
                (byte)30, (byte)2, (byte)10),
        new Weapon("Claymore", (short)0, 
                "A very large greatsword. \n" +
                "Very heavy, and designed for use with both hands.\n" +
                "Allows for broad attacks that are effective against multiple foes.\n" +
                "Requires great strength and experience to handle effectively.\n", 
                (byte)30, (byte)3, (byte)15)
    };
    
    Armor[] armorList = new Armor[]
    {
        new Armor("Chainmail Armor", (short)0, 
                "Chainmail armor of thin interlinking rings of steel\n" +
                "It is common throughout the human world since it can be easily produced,\n" +
                "is not too heavy, and offers good defense.\n" +
                "Knights may favor flashy armor, but for warriors on the battlefield,\n" +
                "anything is fine as long as it keeps them alive.\n", 
                (byte)50, (byte)1, (byte)5),
        new Armor("Knight Armor", (short)0,
                "Armor of a lower-rank knight. Despite the thin metal used, \n+" +
                "the grooved texture gives it added protection.\n",
                (byte)50, (byte)2, (byte)10),
        new Armor("Silver Knight Armor", (short)0,
                "Armor of the Silver Knights who protect Anor Londo.\n" +
                "When Lord Gwyn departed to find the grail, his knights split into two groups. \n" +
                "The Silver Knights remained in the forsaken capital in the service of their goddess.\n", 
                (byte)50, (byte)3, (byte)15)
    };
    
    Heal[] healList = new Heal[]
    {
        new Heal("Lifegem", (short)0, 
                "Small stone made up of crystallized souls.\n" +
                "Restores a small amount of HP.\n" +
                "Often found near abandoned corpses,\n" +
                "as if it were what remains of the soul.\n", 
                (byte)5, (byte)15)
    };
    
    Buff[] buffList = new Buff[]
    {
        new Buff("Gold Pine Resin", (short)0, "Covers the weapon in lightning. +8 Dmg", (byte)4, (byte)8)
    };
    
    QuestItem[] questItemList = new QuestItem[]
    {
        new QuestItem("Firerocks", (short)0, "Two rocks used for making fire.")
    };
    
    Key[] keyList = new Key[]
    {
        new Key("Old Wooden Key", (short)0, "The old wooden key for the kitchen door", "Kitchen Door")
    };
    
    private ArrayList<Item> itemList = new ArrayList<>();
    
    public ArrayList<Item> getItemList()
    {
        return itemList;
    }
    
    public  void makeItemList()
    {
        for(UselessItem temp : uselessItemList)
        {
            temp.setID((short)(itemList.size()+1));
            itemList.add(temp);
        }
        for(Weapon temp : weaponList)
        {
            temp.setID((short)(itemList.size()+1));
            itemList.add(temp);
        }
        for(Armor temp : armorList)
        {
            temp.setID((short)(itemList.size()+1));
            itemList.add(temp);
        }
        for(Heal temp : healList)
        {
            temp.setID((short)(itemList.size()+1));
            itemList.add(temp);
        }
        for(Buff temp : buffList)
        {
            temp.setID((short)(itemList.size()+1));
            itemList.add(temp);
        }
        for(QuestItem temp : questItemList)
        {
            temp.setID((short)(itemList.size()+1));
            itemList.add(temp);
        }
        for(Key temp : keyList)
        {
            temp.setID((short)(itemList.size()+1));
            itemList.add(temp);
        }
        
        
    }
    public ArrayList<Weapon> getWeaponList()
    {
        ArrayList<Weapon> wList = new ArrayList<>(Arrays.asList(weaponList));
        return wList;
    }
    
    public ArrayList<Armor> getArmorList()
    {
        ArrayList<Armor> aList = new ArrayList<>(Arrays.asList(armorList));
        return aList;
    }
    
    public ArrayList<Heal> getHealList()
    {
        ArrayList<Heal> hList = new ArrayList<>(Arrays.asList(healList));
        return hList;
    }
    
    public ArrayList<Buff> getBuffList()
    {
        ArrayList<Buff> bList = new ArrayList<>(Arrays.asList(buffList));
        return bList;
    }
    
    public ArrayList<Key> getKeyList()
    {
        ArrayList<Key> kList = new ArrayList<>(Arrays.asList(keyList));
        return kList;
    }
}
