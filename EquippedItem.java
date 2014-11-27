package TextAdventure;
/**
 *
 * @author Markus
 */
public class EquippedItem extends Item
{
    protected EquippedItem()
    {
        
    }
    
    protected byte durability;
    protected byte itemLevel;
    
    protected byte getDurability()
    {
        return durability;
    }
    
    protected void setDurability(byte durability)
    {
        this.durability = durability;
    }
    
    protected byte getItemLevel()
    {
        return itemLevel;
    }
    
    protected void setItemLevel(byte itemLevel)
    {
        this.itemLevel = itemLevel;
    }
}
