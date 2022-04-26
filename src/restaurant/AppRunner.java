package restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class AppRunner {
    public static void main(String[] args) {
        // create Menu items
        MenuItem burger = new MenuItem("burger", 5.50, "100% beef", "mainCourse");
        MenuItem mintCake = new MenuItem("mintCake", 5.0, "Minty cake so minty",
                            "dessert");
        MenuItem fries = new MenuItem("fries", 2.5, "Crispy Fries", "appetizer");
        MenuItem beefStew = new MenuItem("beefStew", 15.99, "Tangy Beef Stew",
                            "mainCourse");

        MenuItem cupCake = new MenuItem("cupCake", 2.99, "cherry cupCake", "appetizer");

        ArrayList<MenuItem> itemList = new ArrayList<>(Arrays.asList(burger, mintCake, fries, beefStew));

        Category categories = new Category();
        Menu myMenu = new Menu(categories);

        for (MenuItem item : itemList) {
            categories.setAddToCategory(item);
        }

        myMenu.setFillItemList();
        System.out.println(myMenu.getItemList());
//        myMenu.setAddToItemList(beefStew);
//        myMenu.setRemoveItemFromListAndCategory("cupCake");
//        System.out.println(myMenu.getItemList());

//        System.out.println(categories.getAllMenuItemsListStr());
//        System.out.println(categories.getAllItemNameOnly());
//        categories.getMenuItem("beefStew").setItemState("old");

        for (MenuItem item : itemList) {
            item.setItemState("");
        }

        myMenu.setAddToItemList(cupCake);


        for (MenuItem item : categories.getAllMenuItem()) {
            System.out.println(item);
        }
//        System.out.println(categories.getMenuItem("beefStew"));

        System.out.println(myMenu.getLastUpdate());
    }
}
