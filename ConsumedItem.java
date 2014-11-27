package TextAdventure;
/**
 *
 * @author Markus
 */
public class ConsumedItem extends Item
{
    protected ConsumedItem()
    {
        
    }
    
    protected byte charges;
    
    protected byte getCharges()
    {
        return charges;
    }
    
    protected void setCharges(byte charges)
    {
        this.charges = charges;
    }
}
