package TextAdventure;
/**
 *
 * @author Markus
 */
public class Key extends QuestItem
{
    protected Key(String name, short ID, String description, String worksOnDoor)
    {
        this.itemType = 'k';
        this.name = name;
        this.ID = ID;
        this.description = description;
        this.used = false;
        this.worksOnDoor = worksOnDoor;
    }
    
    protected boolean used;
    protected String worksOnDoor;
    
    protected boolean getUsed()
    {
        return used;
    }
    
    protected void setUsed(boolean used)
    {
        this.used = used;
    }
    
    protected void useKey()
    {
        this.used = false;
    }
    
    protected String getWorksOnDoor()
    {
        return worksOnDoor;
    }
    
    protected void seWorksOnDoor(String worksOnDoor)
    {
        this.worksOnDoor = worksOnDoor;
    }
}
