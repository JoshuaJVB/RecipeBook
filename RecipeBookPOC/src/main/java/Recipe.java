import java.util.ArrayList;
import java.util.HashMap;

public class Recipe {

    String name;
    ArrayList<String> ingredients;
    String link;

    public Recipe(String name, ArrayList ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public Recipe(String name, ArrayList ingredients,String link){
        this.name = name;
        this.ingredients = ingredients;
        this.link = link;
    }

    public void addIngredient(String item){
        ingredients.add(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList ingredients) {
        this.ingredients = ingredients;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
