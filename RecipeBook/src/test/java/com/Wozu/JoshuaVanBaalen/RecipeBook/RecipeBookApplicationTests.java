package com.Wozu.JoshuaVanBaalen.RecipeBook;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.Recipe;
import com.Wozu.JoshuaVanBaalen.RecipeBook.model.ShoppingCart;
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
//		ShoppingCart cart = new ShoppingCart();
//		ArrayList<Long> list = new ArrayList<>();
//		list.add(1L);
//		list.add(2L);
//
//		cart.setCart(list);
//		System.out.println(cart.getCart());
	}

}
