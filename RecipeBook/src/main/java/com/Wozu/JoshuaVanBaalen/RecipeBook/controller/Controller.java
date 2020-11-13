package com.Wozu.JoshuaVanBaalen.RecipeBook.controller;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
import com.Wozu.JoshuaVanBaalen.RecipeBook.model.ShoppingCart;
import com.Wozu.JoshuaVanBaalen.RecipeBook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    RecipeService recipeService;

    ShoppingCart cart;


    @PostMapping("/addrecipe")
    public void postTest(@RequestBody Recipe r){
        Recipe in = new Recipe(r.getName(),r.getIngredients());
        recipeService.saveRecipe(r);
        //proper JSON format example bellow
        /*
        {
            "name":"steak",
            "ingredients":["steak","butter"],
            "link":"www.food.com"
        }
         */
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes(){
        return recipeService.getRecipeList();
    }


    @PostMapping("/choosecart")
    public void chooseCart(@RequestBody ShoppingCart c){
        cart = new ShoppingCart();
        cart.setCart(c.getCart());
    }

    @GetMapping("/shoppingList")
    public List<String> getList(){
        List<String> out = new ArrayList<String>();
        List<Recipe> r = new ArrayList<>();
        ArrayList<Long> choices = cart.getCart();
        for(int i = 0; i < choices.size(); i++){
            r.add(recipeService.getRecipe(choices.get(i)).get());
        }
        for(Recipe r0 : r){
            out.addAll(r0.getIngredients());
        }
        Collections.sort(out);
        return out;
    }
}
