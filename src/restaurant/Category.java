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




    // getters
//    public String getAppetizerStr() {
//        String resultStr = "Appetizers: \\n";
//        for (MenuItem item : this.appetizer) {
//            resultStr += item.getName() + "\\n";
//        }
//        return resultStr;
//    }
//    public String getMainCourseStr() {
//        String resultStr = "MainCourse: \n";
//        for (MenuItem item : this.mainCourse) {
//            resultStr += item.getName() + "\n";
//        }
//        return resultStr;
//    }
//    public String getDessertStr() {
//        String resultStr = "Desserts: \n";
//        for (MenuItem item : this.dessert) {
//            resultStr += item.getName() + "\n";
//        }
//        return resultStr;
//    }
//    public ArrayList<MenuItem> getAllMenuItemsList() {
//        return this.allMenuItemsList;
//    }

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

//    public void setAppetizer(MenuItem aAppetizer) {
//        this.hAppetizer.put(aAppetizer.getName(), aAppetizer);
//        this.hAllMenuItemsList.put(aAppetizer.getName(), aAppetizer);
//        Menu.setLastUpdate();
//    }
//    public void setMainCourse(MenuItem aMainCourse) {
//        this.hMainCourse.put(aMainCourse.getName(), aMainCourse);
//        this.hAllMenuItemsList.put(aMainCourse.getName(), aMainCourse);
//        Menu.setLastUpdate();
//    }
//    public void setDessert(MenuItem aDessert) {
//        this.hDessert.put(aDessert.getName(), aDessert);
//        this.hAllMenuItemsList.put(aDessert.getName(), aDessert);
//        Menu.setLastUpdate();
//    }

    public void setAddToCategory(MenuItem newItem) {
        if (newItem.getCategory() == null) {
            System.out.println("Category does not exist.\n +" +
                    " Unable to add item " + newItem.getName());
        } else if (newItem.getCategory().equals("appetizer")) {

            this.hAppetizer.put(newItem.getName(), newItem);
            this.hAllMenuItemsList.put(newItem.getName(), newItem);
            Menu.setLastUpdate();

        } else if (newItem.getCategory().equals("mainCourse")) {

            this.hMainCourse.put(newItem.getName(), newItem);
            this.hAllMenuItemsList.put(newItem.getName(), newItem);
            Menu.setLastUpdate();

        } else if (newItem.getCategory().equals("dessert")) {

            this.hDessert.put(newItem.getName(), newItem);
            this.hAllMenuItemsList.put(newItem.getName(), newItem);
            Menu.setLastUpdate();
        }
    }
}
