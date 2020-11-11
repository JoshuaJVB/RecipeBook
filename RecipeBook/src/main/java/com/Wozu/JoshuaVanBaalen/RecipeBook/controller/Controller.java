package com.Wozu.JoshuaVanBaalen.RecipeBook.controller;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
import com.Wozu.JoshuaVanBaalen.RecipeBook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    RecipeService recipeService;


    @PostMapping("/post")
    public void postTest(@RequestBody Recipe r){
        System.out.println(r);
        recipeService.saveRecipe(r);

    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes(){
        return recipeService.getRecipeList();
    }
}
