package TextAdventure;
/**
 *
 * @author Markus
 */
import java.io.Serializable;

public class Item implements Serializable
{
    protected Item()
    {
        
    }
    protected char itemType;
    protected String name;
    protected short ID = (short)0;
    protected String description;
    
    protected char getItemType()
    {
        return itemType;
    }
    
    protected String getName()
    {
        return name;
    }
    
    protected short getID()
    {
        return ID;
    }
    
    protected void setID(short ID)
    {
        this.ID = ID;
    }
    
    
    protected String getDescription()
    {
        return description;
    }
}
