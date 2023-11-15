/**
 * The "Furniture" class is responsible for furniture objects and contains a constructor, methods to get the name and color of the item, and additional method to display the info later .
 */
public class Furniture {
    private String name;
    private String material;
    private String color;
    private int cost;
    private int weight;

    /**
     * Constructor for the "Furniture" class.
     *
     * @param name     The name of the furniture item
     * @param material The material of the furniture item
     * @param color    The color of the furniture item
     * @param cost     The cost of the furniture item
     * @param weight   The weight of the furniture item
     */
    public Furniture(String name, String material, String color, int cost, int weight) {
        this.name = name;
        this.material = material;
        this.color = color;
        this.cost = cost;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    /**
     * Overridden toString method that represents the object as a string.
     *
     * @return A string that represents the "Furniture" object
     */
    @Override
    public String toString() {
        return  name + " " +
                "Material: " + material + " " +
                "Color: " + color + " " +
                "Cost: " + cost + " " +
                "Weight: " + weight;
    }
}
