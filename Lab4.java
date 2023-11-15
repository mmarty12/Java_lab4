import java.util.Arrays;
import java.util.Comparator;


public class Lab4 {
    public static void main(String[] args) {
        /**
         * The main method of the program.
         * It creates an array of "Furniture" objects, sorts them by name (ascending) and color (descending).
         * Afterward, it prints the sorting results.
         *
         * @param args Command-line arguments
         */
        Furniture[] furnitureItems = new Furniture[]{
                new Furniture("Table", "Wooden", "Brown", 200, 1000),
                new Furniture("Chair", "Steel", "Grey", 20, 50),
                new Furniture("Closet", "Wooden", "White", 1000, 1500),
                new Furniture("Bed", "Wooden", "Brown", 250, 800),
                new Furniture("Chair", "Steel", "Yellow", 20, 50),
                new Furniture("Table", "Wooden", "Red", 200, 1000),
        };

        System.out.println("Furniture:");
        for (Furniture item : furnitureItems) {
            System.out.println(item);
        }

        Arrays.sort(furnitureItems, Comparator
                .comparing(Furniture::getName)
                .thenComparing(Furniture::getColor, Comparator.reverseOrder()));

        System.out.println("\nFurniture sorted. Name (ascending); Color (descending): ");
        for (Furniture item : furnitureItems) {
            System.out.println(item);
        }
    }
}