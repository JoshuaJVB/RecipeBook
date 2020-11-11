package com.Wozu.JoshuaVanBaalen.RecipeBook.controller;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
import com.Wozu.JoshuaVanBaalen.RecipeBook.model.ShoppingCart;
import com.Wozu.JoshuaVanBaalen.RecipeBook.service.RecipeService;
import com.Wozu.JoshuaVanBaalen.RecipeBook.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    RecipeService recipeService;

    @Autowired
    ShoppingCartService cart;


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
        cart.selectCart(c.getChoices());
    }


    //todo:shopping list currently pulls from all recipes in the recipe repo
    //however, we want to implement a shopping cart repo which holds recipes you have chosen
    //from the full recipe list, we will then pull items from there.
//    @GetMapping("/shoppinglist")
////    public List<String> getList(){
////        List<Recipe> r = recipeService.getRecipeList();
////        List<String> out = new ArrayList<String>();
////        for(Recipe r0 : r){
////            out.addAll(r0.getIngredients());
////        }
////        Collections.sort(out);
////        return out;
////    }

    @GetMapping("/shoppingList")
    public List<String> getList(){
        List<String> out = new ArrayList<String>();
        List<Recipe> r = new ArrayList<>();
        Long [] choices = cart.getCart();
        for(int i = 0; i < choices.length; i++){
            r.add(recipeService.getRecipe(choices[i]).get());
        }
        for(Recipe r0 : r){
            out.addAll(r0.getIngredients());
        }
        Collections.sort(out);
        return out;
    }
}
