import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class UserInterface {
 
    private final static List<String> USAGE;
 
    static {
        final String[] list = new String[]{
                "list - lists the recipes",
                "stop - stops the program",
                "find name - searches recipes by name",
                "find cooking time - searches recipes by cooking time",
                "find ingredient - searches recipes by ingredient"
        };
        USAGE = Collections.unmodifiableList(Arrays.asList(list));
    }
 
    private Scanner scanner;
    private RecipesCollection recipesCollection;
 
    public UserInterface(Scanner scanner, RecipesCollection recipesCollection) {
        this.scanner = scanner;
        this.recipesCollection = recipesCollection;
    }
 
    public void start() {
        System.out.print("File to read:");
        String fileName = scanner.nextLine();
        recipesCollection.fillCollectionFromFile(fileName);
        USAGE.forEach(System.out::println);
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                this.recipesCollection.listRecipes();
            } else if (command.equals("find name")) {
                System.out.print("Searched word:");
                String name = scanner.nextLine();
                this.recipesCollection.findByName(name);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time:");
                int time = Integer.parseInt(scanner.nextLine());
                this.recipesCollection.findByCookingTime(time);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient:");
                String ingredient = scanner.nextLine();
                this.recipesCollection.findByIngredient(ingredient);
            }
        }
    }
}