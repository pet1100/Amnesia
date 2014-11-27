package TextAdventure;
/**
 *
 * @author Markus
 */
public class Buff extends ConsumedItem
{
    protected Buff(String name, short ID, String description, byte charges, byte buffDmg)
    {
        this.itemType = 'b';
        this.name = name;
        this.ID = ID;
        this.description = description;
        this.charges = charges;
        this.buffDmg = buffDmg;
    }
    
    protected byte buffDmg;
    
    protected byte getBuffDmg()
    {
        return buffDmg;
    }
    
    protected void setBuffDmg(byte buffDmg)
    {
        this.buffDmg = buffDmg;
    }
    
    public void consume()
    {
        this.charges -= 1;
    }
}
