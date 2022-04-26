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


        ArrayList<MenuItem> itemList = new ArrayList<>(Arrays.asList(burger, mintCake, fries, beefStew));

        Category categories = new Category();
        Menu myMenu = new Menu(categories);

        for (MenuItem item : itemList) {
            categories.setAddToCategory(item);
        }

        myMenu.setFillItemList();
        System.out.println(myMenu.getItemList());
        myMenu.setRemoveItemFromList(burger);
        System.out.println(myMenu.getItemList());

//        System.out.println(myMenu.getLastUpdate());
//        System.out.println(categories.getAllMenuItemsListStr());
//        System.out.println(categories.getAllItemNameOnly());
//
    }
}
