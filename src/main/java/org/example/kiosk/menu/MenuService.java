package org.example.kiosk.menu;

import java.util.ArrayList;

public enum MenuService {

    INSTANCE;

    private ArrayList<Menu> menus;

    //초기화
    private MenuService() {
        this.menus = new ArrayList<>();
        menus.add(new Menu(1, "Americano", 3000));
        menus.add(new Menu(2, "Latte", 3500));
        menus.add(new Menu(3, "Cappuccino", 4000));
        menus.add(new Menu(4, "Espresso", 2500));
    }


    //public ArrayList<Menu> getList(){ }


}
