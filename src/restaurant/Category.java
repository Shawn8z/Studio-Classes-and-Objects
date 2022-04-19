package restaurant;

import java.util.ArrayList;

class Category {

    private ArrayList<MenuItem> appetizer = new ArrayList<>();
    private ArrayList<MenuItem> mainCourse = new ArrayList<>();;
    private ArrayList<MenuItem> dessert = new ArrayList<>();;

    public Category(MenuItem newItem) {

    }

    public String getAppetizer() {
        String resultStr = "Appetizers: \\n";
        for (MenuItem item : this.appetizer) {
            resultStr += item + "\\n";
        }
        return resultStr;
    }
    public String getMainCourse() {
        String resultStr = "MainCourse: \\n";
        for (MenuItem item : this.mainCourse) {
            resultStr += item + "\\n";
        }
        return resultStr;
    }
    public String getDessert() {
        String resultStr = "Desserts: \\n";
        for (MenuItem item : this.dessert) {
            resultStr += item + "\\n";
        }
        return resultStr;
    }

    public void setAddNewMenuItem(MenuItem newItem) {
        if (newItem.getCategory().equals("appetizer")) {
            this.appetizer.add(newItem);
        } else if (newItem.getCategory().equals("mainCourse")) {
            this.mainCourse.add(newItem);
        } else if (newItem.getCategory().equals("dessert")) {
            this.dessert.add(newItem);
        } else {
            System.out.println("Category does not exist. Unable to add item " + newItem.getName());
        }
    }
}
