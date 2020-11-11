package com.Wozu.JoshuaVanBaalen.RecipeBook;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
import com.Wozu.JoshuaVanBaalen.RecipeBook.repo.RecipeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RecipeBookApplicationTests {

	@Autowired
	RecipeRepo repo;

	@Test
	void contextLoads() {
	}

	@Test
	void recipeTest(){
		ArrayList<String> list = new ArrayList();
		list.add("steak");
		list.add("butter");
		Recipe r = new Recipe("Steak", list, "link");



		repo.save(r);
//		Recipe expected = r;
//		Optional<Recipe> actual = repo.findById(1L);
//		assertEquals(expected,actual);

		//System.out.println(repo.findAll());
	}

}
