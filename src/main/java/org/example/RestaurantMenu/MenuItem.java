package org.example.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String menuName;
    private double price;
    private String description;
    private String category;
    private boolean menuItemType;
    public MenuItem(double price, String description, String category, boolean menuItemType){

        this.price=price;
        this.description=description;
        this.category=category;
        this.menuItemType=menuItemType;
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
}
