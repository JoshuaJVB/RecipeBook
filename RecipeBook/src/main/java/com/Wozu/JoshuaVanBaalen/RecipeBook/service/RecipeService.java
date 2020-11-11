//recipe service serves as a middleman for the controller and recipe model
//it allows you to save new recipes to the repo, and get a list of recipes

package com.Wozu.JoshuaVanBaalen.RecipeBook.service;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
import com.Wozu.JoshuaVanBaalen.RecipeBook.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class RecipeService {

    @Autowired
    RecipeRepo recipeRepo;

    public void saveRecipe(Recipe r){
        recipeRepo.save(r);
    }

    public void saveRecipe(String name, ArrayList<String> ing ){
        recipeRepo.save(new Recipe(name, ing));
    }

    public void saveRecipe(String name, ArrayList<String> ing, String link){
        recipeRepo.save(new Recipe(name, ing, link));
    }

    public List<Recipe> getRecipeList(){
        return recipeRepo.findAll();
    }

    public Optional<Recipe> getSingleRecipe(Long id){
        return recipeRepo.findById(id);
    }
}
