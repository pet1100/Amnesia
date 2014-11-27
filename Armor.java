package TextAdventure;
/**
 *
 * @author Markus
 */
public class Armor extends EquippedItem implements Damageable
{
    protected Armor(String name, short ID, String description, byte durability, byte itemLevel, byte ac)
    {
        this.itemType = 'a';
        this.name = name;
        this.ID = ID;
        this.description = description;
        this.durability = durability;
        this.itemLevel = itemLevel;
        this.ac = ac;
    }
    
    protected byte ac;
    
    protected byte getAc()
    {
        return ac;
    }
    
    protected void setAc(byte ac)
    {
        this.ac = ac;
    }
    
    @Override
    public void damage(byte durabilityDamage)
    {
        this.durability -= durabilityDamage;
    }
}
