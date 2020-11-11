package com.Wozu.JoshuaVanBaalen.RecipeBook.model;

import javax.persistence.Entity;


@Entity
public class ShoppingCart {

    private Long[] choices;

    public Long[] getChoices() {
        return choices;
    }

    public void setChoices(Long[] choices) {
        this.choices = choices;
    }
}
