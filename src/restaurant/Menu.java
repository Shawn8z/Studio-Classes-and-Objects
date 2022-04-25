package restaurant;


import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDateTime;

class Menu {
    private static LocalDateTime lastUpdate;
    private Category category;
    private ArrayList<String> itemList;


    public Menu(Category aCategory) {
        this.setCategory(aCategory);
    }


    public String getLastUpdate() {
        LocalDateTime timeStr = Menu.lastUpdate;
        return "Menu last update @" + timeStr.toString();
    }
    public ArrayList<String> getItemList() {
        return this.itemList;
    }



    public void setCategory(Category aCategory) {
        this.category = aCategory;
    }
    public void setItemList(MenuItem aItem) {
        itemList.add(aItem.getName());
    }
    public void setFillItemList() {
        String str = this.category.getAllItemNameOnly();
        this.itemList = new ArrayList<>(Arrays.asList(str.split("\n")));
    }
    public static void setLastUpdate() {
        Menu.lastUpdate = LocalDateTime.now();
    }

}




