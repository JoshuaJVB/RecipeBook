package com.Wozu.JoshuaVanBaalen.RecipeBook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private ArrayList<String> ingredients;
    private String link;

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", link='" + link + '\'' +
                '}';
    }

    public Recipe(){
    }


    public Recipe(String name, ArrayList ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public Recipe(String name, ArrayList ingredients, String link){
        this.name = name;
        this.ingredients = ingredients;
        this.link = link;
    }

    public void addIngredient(String item){
        ingredients.add(item);
    }

    public Long getId(){
        return id;
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
