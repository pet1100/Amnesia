package TextAdventure;
/**
 *
 * @author Markus
 */
public class QuestItem extends Item
{
    protected QuestItem()
    {
        
    }
    
    protected QuestItem(String name, short ID, String description)
    {
        this.itemType = 'q';
        this.name = name;
        this.ID = ID;
        this.description = description;
    }
    
}
