package TextAdventure;
/**
 *
 * @author Markus
 */
public class UselessItem extends Item
{
    protected UselessItem(String name, short ID, String description)
    {
        this.itemType = 'u';
        this.name = name;
        this.ID = ID;
        this.description = description;
    }
}
