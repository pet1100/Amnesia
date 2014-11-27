package TextAdventure;
/**
 *
 * @author Markus
 */
public class Weapon extends EquippedItem implements Damageable
{
    protected Weapon(String name, short ID, String description, byte durability, byte itemLevel, byte dmg)
    {
        this.itemType = 'w';
        this.name = name;
        this.ID = ID;
        this.description = description;
        this.durability = durability;
        this.itemLevel = itemLevel;
        this.dmg = dmg;
    }
    
    protected Weapon()
    {
        
    }
    
    protected byte dmg;
    
    protected byte getDmg()
    {
        return dmg;
    }
    
    protected void setDmg(byte dmg)
    {
        this.dmg = dmg;
    }
    
    @Override
    public void damage(byte durabilityDamage)
    {
        this.durability -= durabilityDamage;
    }
    
    
}
