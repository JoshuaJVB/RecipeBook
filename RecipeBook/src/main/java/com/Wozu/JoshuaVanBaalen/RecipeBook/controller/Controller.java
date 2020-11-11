package com.Wozu.JoshuaVanBaalen.RecipeBook.controller;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
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


    @PostMapping("/post")
    public void postTest(@RequestBody Recipe r){
        System.out.println(r);
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

    @GetMapping("/shoppinglist")
    public List<String> getList(){
        List<Recipe> r = recipeService.getRecipeList();
        List<String> out = new ArrayList<String>();
        for(Recipe r0 : r){
            out.addAll(r0.getIngredients());
        }
        Collections.sort(out);
        return out;
    }
}
