package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

class Menu {
    private static LocalDate lastUpdate;
    private Category category;
    private ArrayList<String> itemList;


    public Menu(Category aCategory) {
        this.setCategory(aCategory);
    }


    public String getLastUpdate() {
        LocalDate timeStr = Menu.lastUpdate;
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
        String str = this.category.getItemNameOnly();
        this.itemList = new ArrayList<>(Arrays.asList(str.split("\n")));
    }
    public static void setLastUpdate() {
        Menu.lastUpdate = LocalDate.now();
    }

}




