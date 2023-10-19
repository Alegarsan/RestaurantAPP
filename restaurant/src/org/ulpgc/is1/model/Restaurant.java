package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private Phone phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Restaurant(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }


    public boolean addMenu(Menu menu) {
        List<Menu> menus;
        menus = new ArrayList<>();
        if (!menus.contains(menu));
        return menus.add(menu);
    }



}
