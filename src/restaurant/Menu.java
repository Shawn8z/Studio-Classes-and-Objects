package restaurant;


import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Menu {
    private static LocalDateTime lastUpdate;
    private Category category;
    private ArrayList<String> itemList = new ArrayList<>();


    public Menu(Category aCategory) {
        this.setCategory(aCategory);
    }


    public String getLastUpdate() {
        LocalDateTime timeObj = (Menu.lastUpdate);
        DateTimeFormatter formattedTimeObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDateStr = timeObj.format(formattedTimeObj);

        return "\n\nMenu last update @ " + formattedDateStr;
    }
    public ArrayList<String> getItemList() {
        return this.itemList;
    }



    public void setCategory(Category aCategory) {
        this.category = aCategory;
    }
    public void setAddToItemList(MenuItem aItem) {
        if (!this.itemList.contains(aItem.getName())) {
            this.category.setAddToCategory(aItem);
            this.itemList.add(aItem.getName());
            Menu.setLastUpdate();
        } else {
            System.out.println(aItem.getName() + " is already in the menu.");
        }

    }
    public void setRemoveItemFromListAndCategory(String itemName) {
        if (this.itemList.contains(itemName)) {
            MenuItem targetItem = this.category.getMenuItem(itemName);
            this.category.setRemoveFromCategory(targetItem);
            this.itemList.remove(itemName);
            Menu.setLastUpdate();
        } else {
            System.out.println(itemName + " does not exist in the menu.");
        }
    }

    public void setFillItemList() {
        String str = this.category.getAllItemNameOnly();
        String[] itemNameList = str.split(", ");
        for (String item : itemNameList) {
            this.itemList.add(item);
        }
        Menu.setLastUpdate();
    }
    public static void setLastUpdate() {
        Menu.lastUpdate = LocalDateTime.now();
    }
}




