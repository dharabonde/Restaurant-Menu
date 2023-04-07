package org.example.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String menuName;
    private double price;
    private String description;
    private String category;
    private boolean menuItemType;
    public MenuItem(String name, double price, String description, String category, boolean menuItemType){

        this.menuName=name;
        this.price=price;
        this.description=description;
        this.category=category;
        this.menuItemType=menuItemType;
    }
    public MenuItem(String name, double price, String description, String category) {
    this(name, price, description, category, false);
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isMenuItemType(){
        return menuItemType;
    }
    private void setMenuItemType(boolean menuItemType)
    {
        this.menuItemType=menuItemType;
    }
    public void printMenuItem(){

    }
}
