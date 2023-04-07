package org.example.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private Date lastUpdateDate;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu()
    {
       //menuItemType= true;
    }

    public Date getLastUpdateDate(){
        return lastUpdateDate;
    }
    private void setLastUpdateDate(Date lastUpdateDate){
        this.lastUpdateDate=lastUpdateDate;
    }

    public void addMenuItem(MenuItem newMenuItem){
        this.menuItems.add(newMenuItem);
    }
    public void removeMenuItem(MenuItem newMenuItem){
        this.menuItems.remove(newMenuItem);
    }

    public void printMenu() {
        int i = 1;
        for (MenuItem menuItem : menuItems) {
            System.out.print(i + ". " + menuItem + "\n");
            i++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuItems, menu.menuItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItems);
    }

    public void printMenuItem(MenuItem item) {

        for(MenuItem menuItem:menuItems){
            boolean check=equals(item);
            if(check){
                System.out.println("Item Name: "+item.getMenuName()+"\n"+
                        "Item description: "+item.getDescription()+"\n"+
                        "Item category: "+item.getCategory()+"\n"+
                        "Item price: "+item.getPrice()+"\n");
            }
        }
    }

}
