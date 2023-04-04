package org.example.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

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
}
