import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class RecipesCollection {
    private List<Recipe> recipes;
 
    public RecipesCollection() {
        this.recipes = new ArrayList<>();
    }
 
    public void fillCollectionFromFile(String fileName) {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String recipeName = scanner.nextLine();
                int preparationTime = Integer.parseInt(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                Recipe recipe = new Recipe(recipeName, preparationTime, ingredients);
                this.recipes.add(recipe);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
 
    public void listRecipes() {
        System.out.println("Recipes:");
        this.recipes.forEach(System.out::println);
    }
 
    public void findByName(String name) {
        System.out.println("Recipes:");
        ArrayList<Recipe> searchResult = new ArrayList<>();
        for (Recipe recipe :
                this.recipes) {
            if (recipe.getName().contains(name)) {
                searchResult.add(recipe);
            }
        }
        searchResult.forEach(System.out::println);
    }
 
    public void findByCookingTime(int time) {
        System.out.println("Recipes:");
        ArrayList<Recipe> searchResult = new ArrayList<>();
        for (Recipe recipe :
                this.recipes) {
            if (recipe.getPreparationTime() <= time) {
                searchResult.add(recipe);
            }
        }
        searchResult.forEach(System.out::println);
    }
 
    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");
        ArrayList<Recipe> searchResult = new ArrayList<>();
        for (Recipe recipe :
                this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                searchResult.add(recipe);
            }
        }
        searchResult.forEach(System.out::println);
    }
}