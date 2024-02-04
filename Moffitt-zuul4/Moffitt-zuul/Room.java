import java.util.HashMap;
import java.util.Set;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * Modifications:
 * CM: decoupled Room and Game
 * CM: created a HashMap to simplify the exits of a room
 * CM: Modified setExit to accomodate more exit directions
 * CM: Added getExitString
 * 
 * @author  Michael Kölling and David J. Barnes and Chase Moffitt
 * @version 2023.01.20
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * Define the exits of this room.
     * @param direction exit direction
     * @param neighbour room in the given direction
     */
    public void setExit(String direction, Room neighbour) 
    {
        exits.put(direction, neighbour);
    }
    
    /**
     * Return if there is an exit in a given direction. If no exits return null.
     * @param direction the direction of the exit
     * @return the room in that direction
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
    
    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Returns a description of the room's exits.
     * @return a description of the available exits
     */
    public String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    
    /**
     * Returns a long description of this room, of the form:
     *  You are in the kitchen.
     *  Exits: north west
     * @return a description of the room, including exits
     */
    public String getLongDescription()
    {
        return "You are" + description + ".\n" + getExitString();
    }
}
