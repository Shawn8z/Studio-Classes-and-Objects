package restaurant;

import java.util.ArrayList;

class Category {

    private ArrayList<MenuItem> appetizer = new ArrayList<>();
    private ArrayList<MenuItem> mainCourse = new ArrayList<>();;
    private ArrayList<MenuItem> dessert = new ArrayList<>();;


    public String getAppetizer() {
        String resultStr = "Appetizers: \\n";
        for (MenuItem item : this.appetizer) {
            resultStr += item.getName() + "\\n";
        }
        return resultStr;
    }
    public String getMainCourse() {
        String resultStr = "MainCourse: \n";
        for (MenuItem item : this.mainCourse) {
            resultStr += item.getName() + "\n";
        }
        return resultStr;
    }
    public String getDessert() {
        String resultStr = "Desserts: \n";
        for (MenuItem item : this.dessert) {
            resultStr += item.getName() + "\n";
        }
        return resultStr;
    }
    public String getAll() {
        String resultStr = "Appetizers: \n";
        for (MenuItem item : this.appetizer) {
            resultStr += " " + item.getName() + "\n";
        }
        resultStr += " \nMainCourse: \n";
        for (MenuItem item : this.mainCourse) {
            resultStr += " " +  item.getName() + "\n";
        }
        resultStr += "\nDesserts: \n";
        for (MenuItem item : this.dessert) {
            resultStr += " " +  item.getName() + "\n";
        }
        return resultStr;
    }
    public String getItemNameOnly() {
        String resultStr = "";
        for (MenuItem item : this.appetizer) {
            resultStr += " " + item.getName() + "\n";
        }
        for (MenuItem item : this.mainCourse) {
            resultStr += " " +  item.getName() + "\n";
        }
        for (MenuItem item : this.dessert) {
            resultStr += " " +  item.getName() + "\n";
        }
        return resultStr;
    }

    public void setAppetizer(MenuItem aAppetizer) {
        this.appetizer.add(aAppetizer);
        Menu.setLastUpdate();
    }
    public void setMainCourse(MenuItem aMainCourse) {
        this.mainCourse.add(aMainCourse);
        Menu.setLastUpdate();
    }
    public void setDessert(MenuItem aDessert) {
        this.dessert.add(aDessert);
        Menu.setLastUpdate();
    }
    public void setMultiMenuItem(MenuItem newItem) {
        if (newItem.getCategory() == null) {
            System.out.println("Category does not exist.\n +" +
                    " Unable to add item " + newItem.getName());
        } else if (newItem.getCategory().equals("appetizer")) {
            this.appetizer.add(newItem);
            Menu.setLastUpdate();
        } else if (newItem.getCategory().equals("mainCourse")) {
            this.mainCourse.add(newItem);
            Menu.setLastUpdate();
        } else if (newItem.getCategory().equals("dessert")) {
            this.dessert.add(newItem);
            Menu.setLastUpdate();
        }
    }
}
