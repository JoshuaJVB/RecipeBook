import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Recipe r1;

        String n1 = "Steak";
        ArrayList in1 = new ArrayList<String>();

        in1.add("Steak");
        in1.add("Butter");
        in1.add("Rosemary");

        r1 = new Recipe(n1, in1);

        String n2 = "Mac and Cheese";
        ArrayList in2 = new ArrayList<String>();

        in2.add("noodles");
        in2.add("Cheese");
        in2.add("Milk");
        in2.add("Butter");

        Recipe r2;
        r2 = new Recipe(n2, in2);

        ShoppingList list = new ShoppingList();

        list.addItems(r1);
        list.addItems(r2);

        ArrayList<String> result = new ArrayList<String>();

        result = list.getShoppingList();

        for ( String s : result)
            System.out.println(s);


    }
}
