package com.Wozu.JoshuaVanBaalen.RecipeBook.model;


import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {

    private ArrayList<Long> cart;


    public ShoppingCart() {
    }

    public ArrayList<Long> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Long> choices) {
        this.cart = choices;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "choices=" + cart +
                '}';
    }
}
