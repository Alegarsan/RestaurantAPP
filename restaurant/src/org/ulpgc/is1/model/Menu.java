package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Menu {

    private String name;
    private MenuType menutype;

    private ArrayList<Dish>dishes;

    public String getname() {
        return menu;
    }

    public void setname(String name) {
        this.menu = menu;
    }

    public name(String name) {
        this.menu = menu;
        this.menu = menuType;
        dishes = new ArrayList<Dish>();
    }

    public boolean addDish(Dish dish){
        dishes.add(dish);
    }


}
