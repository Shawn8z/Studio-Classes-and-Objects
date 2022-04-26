package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

class Category {

//    private ArrayList<MenuItem> appetizer = new ArrayList<>();
    private HashMap<String, MenuItem> hAppetizer = new HashMap<>();


//    private ArrayList<MenuItem> mainCourse = new ArrayList<>();
    private HashMap<String, MenuItem> hMainCourse = new HashMap<>();


//    private ArrayList<MenuItem> dessert = new ArrayList<>();
    private HashMap<String, MenuItem> hDessert = new HashMap<>();


//    private ArrayList<MenuItem> allMenuItemsList = new ArrayList<>();
    private HashMap<String, MenuItem> hAllMenuItemsList = new HashMap<>();




//     getters
    public String getAppetizerStr() {
        String resultStr = "Appetizers: \n";
        for (String itemName : this.hAppetizer.keySet()) {
            resultStr += "* " + itemName + "\n";
        }
        return resultStr;
    }
    public String getMainCourseStr() {
        String resultStr = "MainCourse: \n";
        for (String itemName : this.hMainCourse.keySet()) {
            resultStr += "* " +  itemName + "\n";
        }
        return resultStr;
    }
    public String getDessertStr() {
        String resultStr = "Desserts: \n";
        for (String itemName : this.hDessert.keySet()) {
            resultStr += "* " +  itemName + "\n";
        }
        return resultStr;
    }
    public String getAllMenuItemsListStr() {
        String result = "\n";

        result += "-----------\n" + getAppetizerStr() + "-----------\n\n";
        result += "-----------\n" + getMainCourseStr() + "-----------\n\n";
        result += "-----------\n" + getDessertStr() + "-----------\n";
        return result;
    }


    // forgot why I made this
    public String getAllItemNameOnly() {
        String resultStr = "";
        ArrayList<String> appetizerItemNames =  new ArrayList<>(this.hAppetizer.keySet());
        ArrayList<String> mainCourseItemNames = new ArrayList<>(this.hMainCourse.keySet());
        ArrayList<String> dessertItemNames = new ArrayList<>(this.hDessert.keySet());
        resultStr += stringListToStr(appetizerItemNames) + ", ";
        resultStr += stringListToStr(mainCourseItemNames) + ", ";
        resultStr += stringListToStr(dessertItemNames );
        return resultStr;
    }
    private String stringListToStr(ArrayList<String> yourList) {
        String result = "";
        int setLength = yourList.size();
        for (int i = 0; i < setLength; i++) {
            if (i != setLength - 1) {
                result += yourList.get(i) + ", ";
            } else {
                result += yourList.get(i);
            }
        }
        return result;
    }


    //setters

    public void setAddToCategory(MenuItem newItem) {
        if (newItem.getCategory() == null) {
            System.out.println("Category does not exist.\n +" +
                    " Unable to add item " + newItem.getName());
        } else if (newItem.getCategory().equals("appetizer")) {

            this.hAppetizer.put(newItem.getName(), newItem);
//            this.hAllMenuItemsList.put(newItem.getName(), newItem);
            Menu.setLastUpdate();

        } else if (newItem.getCategory().equals("mainCourse")) {

            this.hMainCourse.put(newItem.getName(), newItem);
//            this.hAllMenuItemsList.put(newItem.getName(), newItem);
            Menu.setLastUpdate();

        } else if (newItem.getCategory().equals("dessert")) {

            this.hDessert.put(newItem.getName(), newItem);
//            this.hAllMenuItemsList.put(newItem.getName(), newItem);
            Menu.setLastUpdate();
        }
    }

    public void setRemoveFromCategory(MenuItem targetItem) {
        if (targetItem.getCategory() == null) {
            System.out.println("Category does not exist.\n +" +
                    " Unable to add item " + targetItem.getName());
        } else if (targetItem.getCategory().equals("appetizer")) {

            this.hAppetizer.remove(targetItem.getName());
//            this.hAllMenuItemsList.put(targetItem.getName(), targetItem);
            Menu.setLastUpdate();

        } else if (targetItem.getCategory().equals("mainCourse")) {

            this.hMainCourse.remove(targetItem.getName());
//            this.hAllMenuItemsList.put(targetItem.getName(), targetItem);
            Menu.setLastUpdate();

        } else if (targetItem.getCategory().equals("dessert")) {

            this.hDessert.remove(targetItem.getName());
//            this.hAllMenuItemsList.put(targetItem.getName(), targetItem);
            Menu.setLastUpdate();
        }
    }
}
