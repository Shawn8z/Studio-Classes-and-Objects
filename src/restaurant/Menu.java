package restaurant;


import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

class Menu {
    private static LocalDate lastUpdate;
    private Category category;
    private ArrayList<String> itemList;


    public Menu(Category aCategory) {
        this.setCategory(aCategory);
    }


    public String getLastUpdate() {
        LocalDate timeStr = (Menu.lastUpdate);

        return "Menu last update @" + timeStr.toString();
    }
    public ArrayList<String> getItemList() {
        return this.itemList;
    }



    public void setCategory(Category aCategory) {
        this.category = aCategory;
    }
    public void setAddToItemList(MenuItem aItem) {
        itemList.add(aItem.getName());
        this.category.setAddToCategory(aItem);
    }
    public void setRemoveItemFromList(String itemName) {
        if (itemList.contains(itemName)) {

            MenuItem targetItem =
            this.category.setRemoveFromCategory(aItem);
            itemList.remove(itemName);
        } else {
            System.out.println(aItem.getName() + " does not exist in the menu.");
        }


    }

    public void setFillItemList() {
        String str = this.category.getAllItemNameOnly();
        this.itemList = new ArrayList<>(Arrays.asList(str.split("\n")));
    }
    public static void setLastUpdate() {
        Menu.lastUpdate = LocalDate.now();
    }
}




