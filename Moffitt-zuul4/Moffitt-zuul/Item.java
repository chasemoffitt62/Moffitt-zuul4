/**
 * This class creates and sets attributes of items.
 *
 * @author Chase Moffitt
 * @version 30.1.2024
 */
public class Item {
    private String description;
    private double weight;

    public Item(String itemDescription, double itemWeight) {
        this.description = description;
        this.weight = weight;
    }

    /**
     * returns a description of an item
     */
    public String getDescription() {
        return description;
    }

    /**
     * returns the weight of an item
     */
    public double getWeight() {
        return weight;
    }
}