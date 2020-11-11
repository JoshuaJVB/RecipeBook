package com.Wozu.JoshuaVanBaalen.RecipeBook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String item;

    public Item(){

    }
    public Item(String s){
        item = s;
    }

    public Integer getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
