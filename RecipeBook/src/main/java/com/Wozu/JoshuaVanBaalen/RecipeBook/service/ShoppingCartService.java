package com.Wozu.JoshuaVanBaalen.RecipeBook.service;

import com.Wozu.JoshuaVanBaalen.RecipeBook.model.ShoppingCart;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

    ShoppingCart cart = new ShoppingCart();

    public void selectCart(Long[] in) {
        cart.setChoices(in);
    }

    public Long[] getCart() {
        return cart.getChoices();
    }
}

