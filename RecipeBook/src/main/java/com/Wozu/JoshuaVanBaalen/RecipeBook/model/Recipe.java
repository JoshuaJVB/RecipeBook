package com.Wozu.JoshuaVanBaalen.RecipeBook.model;

import java.util.HashMap;

public class Recipe {

    String name;
    HashMap<String, Float> ingredients;
    String link;

    Recipe(String name){
        this.name = name;
    }

    public void addIngredient(String item, float amount){
        ingredients.put(item, amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Float> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Float> ingredients) {
        this.ingredients = ingredients;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
