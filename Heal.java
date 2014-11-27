package TextAdventure;
/**
 *
 * @author Markus
 */
public class Heal extends ConsumedItem
{
    protected Heal(String name, short ID, String description, byte charges, byte hpHealed)
    {
        this.itemType = 'h';
        this.name = name;
        this.ID = ID;
        this.description = description;
        this.charges = charges;
        this.hpHealed = hpHealed;
    }
    
    protected byte hpHealed;
    
    protected byte getHpHealed()
    {
        return hpHealed;
    }
    
    protected void setHpHealed(byte hpHealed)
    {
        this.hpHealed = hpHealed;
    }
    
    public void consume()
    {
        this.charges -= 1;
    }
}
