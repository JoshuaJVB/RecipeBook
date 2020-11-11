//recipe repo serves as a list of all recipes added by the user
//it saves recipes and assigns them an id when doing so

package com.Wozu.JoshuaVanBaalen.RecipeBook.repo;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe, Long> {
}
