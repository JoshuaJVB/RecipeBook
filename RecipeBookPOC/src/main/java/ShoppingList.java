import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingList {

    ArrayList<String> ingredients = new ArrayList<String>();

    public ShoppingList(){
    }

    public void addItems(Recipe r){
        //String[] holder = new String[r.getIngredients().size()];
        String[] holder = r.getIngredients().toArray(new String[0]);
        for(int i = 0; i < holder.length; i++){
            ingredients.add(holder[i]);
        }
    }

    public ArrayList<String> getShoppingList(){
        return ingredients;
    }
}
