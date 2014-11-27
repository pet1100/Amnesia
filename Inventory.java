package TextAdventure;

import java.util.ArrayList;

/**
 *
 * @author Markus
 */
public class Inventory 
{
    private ItemList lists = new ItemList();
    
    private short equippedWeapon;  
    private short equippedArmor;
    private String equippedWeaponName = "Nothing";
    private String equippedArmorName = "Nothing";
    private byte equippedWeaponItemLevel;
    private byte equippedArmorItemLevel;
    private int equippedItemLevel;
    private byte equippedDmg;
    private byte equippedAc;
    private char haveLifegem = 'n';
    
    private ArrayList<Item> inventoryList = new ArrayList();
    
    public Inventory(ItemList lists)
    {
	this.lists = lists;
    }
    
    public ArrayList<Item> getInventoryList()
    {
        return inventoryList;
    }
    
    public void addToInventory(short inputID)
    {
        for(Item temp : lists.getItemList())
        {
            if(temp.getID() == inputID)
            {
                if(temp.itemType == 'u')
                {
                    inventoryList.add(new UselessItem(temp.getName(), temp.getID(), temp.getDescription()));
                }
                else if(temp.itemType == 'w')
                {
                    for(Weapon tempw : lists.getWeaponList())
                    {
                        if(temp.getID() == tempw.getID())
                        {
                            inventoryList.add(new Weapon(tempw.getName(), tempw.getID(), tempw.getDescription(), tempw.getDurability(), tempw.getItemLevel(), tempw.getDmg()));
                        }
                    }
                }
                else if(temp.itemType == 'a')
                {
                    for(Armor tempa : lists.getArmorList())
                    {
                        if(temp.getID() == tempa.getID())
                        {
                            inventoryList.add(new Armor(tempa.getName(), tempa.getID(), tempa.getDescription(), tempa.getDurability(), tempa.getItemLevel(), tempa.getAc()));
                        }
                    }
                }
                else if(temp.itemType == 'h')
                {
                    for(Heal temph : lists.getHealList())
                    {
                        if(temp.getID() == temph.getID())
                        {
                            inventoryList.add(new Heal(temph.getName(), temph.getID(), temph.getDescription(), temph.getCharges(), temph.getHpHealed()));
                        }
                    }
                }
                else if(temp.itemType == 'b')
                {
                    for(Buff tempb : lists.getBuffList())
                    {
                        if(temp.getID() == tempb.getID())
                        {
                            inventoryList.add(new Buff(tempb.getName(), tempb.getID(), tempb.getDescription(), tempb.getCharges(), tempb.getBuffDmg()));
                        }
                    }
                }
                else if(temp.itemType == 'q')
                {
                    inventoryList.add(new QuestItem(temp.getName(), temp.getID(), temp.getDescription()));
                }
                else if(temp.itemType == 'k')
                {
                    for(Key tempk : lists.getKeyList())
                    {
                        if(temp.getID() == tempk.getID())
                        {
                            inventoryList.add(new Key(tempk.getName(), tempk.getID(), tempk.getDescription(), tempk.getWorksOnDoor()));
                        }
                    }
                }
                else
                {
                    System.out.println("ItemType not found");
                }
            }
        }
    }
    
    public short getEquippedWeapon()
    {
        return equippedWeapon;
    }
    public short getEquippedArmor()
    {
        return equippedArmor;
    }
    public String getEquippedWeaponName()
    {
        return equippedWeaponName;
    }
    public String getEquippedArmorName()
    {
        return equippedArmorName;
    }
    public byte getEquippedWeaponItemLevel()
    {
        return equippedWeaponItemLevel;
    }
    public byte getEquippedArmorItemLevel()
    {
        return equippedArmorItemLevel;
    }
    public int getEquippedItemLevel()
    {
        return equippedItemLevel;
    }
    public byte getEquippedDmg()
    {
        return equippedDmg;
    }
    public byte getEquippedAc()
    {
        return equippedAc;
    }
    
    public void equip(short inputID)
    {
        for(Item tempi : inventoryList)
        {
            if(tempi.getID() == inputID)
            {
                if(tempi.itemType == 'w')
                {
                    this.equippedWeapon = inputID;
                    for(Weapon tempw : lists.getWeaponList())
                    {
                        if(tempi.getID() == tempw.getID())
                        {
                            this.equippedWeaponName = tempw.getName();
                            this.equippedWeaponItemLevel = tempw.getItemLevel();
                            this.equippedDmg = tempw.getDmg();
                        }
                    }
                }
                else if(tempi.itemType == 'a')
                {
                    this.equippedArmor = inputID;
                    for(Armor tempa : lists.getArmorList())
                    {
                        if(tempi.getID() == tempa.getID())
                        {
                            this.equippedArmorName = tempa.getName();
                            this.equippedArmorItemLevel = tempa.getItemLevel();
                            this.equippedAc = tempa.getAc();
                        }
                    }
                }
            }
        }
        this.equippedItemLevel = (byte)(this.equippedWeaponItemLevel + this.equippedArmorItemLevel);
    }
    
    public void damageWeaponDurability(byte durabilityDamage)
    {
        for(Weapon tempw : lists.getWeaponList())
        {
            if (this.equippedWeapon == tempw.getID())
            {
                tempw.damage(durabilityDamage);
                if(tempw.getDurability() < (byte)1)
                {
                    this.equippedItemLevel -= this.equippedWeaponItemLevel;
                    this.equippedWeaponName = "Nothing";
                    this.equippedWeaponItemLevel = (byte)0;
                    this.equippedDmg = (byte)0;
                    for(short i = 0; i < inventoryList.size(); i++)
                    {
                        if(tempw.getID() == inventoryList.get(i).getID())
                        {
                            inventoryList.remove(i);
                        }
                    }
                }
            }
        }
    }
    
    public void damageArmorDurability(byte durabilityDamage)
    {
        
        for(Armor tempa : lists.getArmorList())
        {
            if (this.equippedArmor == tempa.getID())
            {
                tempa.damage(durabilityDamage);
                if(tempa.getDurability() < (byte)1)
                {
                    this.equippedItemLevel -= this.equippedArmorItemLevel;
                    this.equippedArmor = (short)0;
                    this.equippedArmorName = "Nothing";
                    this.equippedArmorItemLevel = (byte)0;
                    this.equippedAc = (byte)0;
                    for(short i = 0; i < inventoryList.size(); i++)
                    {
                        if(tempa.getID() == inventoryList.get(i).getID())
                        {
                            inventoryList.remove(i);
                        }
                    }
                }
            }
        }
    }
    
    public void useConsumable(short inputID)
    {
        for(short i = 0; i < inventoryList.size(); i++)
        {
            if(inventoryList.get(i).getID() == inputID && inventoryList.get(i).getItemType() == 'h')
            {
                for(Heal temph : lists.getHealList())
                {
                    if(temph.getID() == inputID)
                    {
                        temph.consume();
                        if(inventoryList.get(i).getID() == inputID && temph.getCharges() < (byte)1)
                        {
                           inventoryList.remove(i);
                        }
                    }
                }
            }
            else if(inventoryList.get(i).getID() == inputID && inventoryList.get(i).getItemType() == 'b')
            {
                for(Buff tempb : lists.getBuffList())
                {
                    if(tempb.getID() == inputID)
                    {
                        tempb.consume();
                        if(inventoryList.get(i).getID() == inputID && tempb.getCharges() < (byte)1)
                        {
                           inventoryList.remove(i);
                        }
                    }
                }
            }
        }
    }
    
}
