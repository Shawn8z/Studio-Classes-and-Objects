package restaurant;

import java.time.LocalDate;

class Menu {
    private LocalDate lastUpdate;
//    private Category allCategorys = new Category();
    private String[] menuItemList;

    public LocalDate getLastUpdate() {
        return this.lastUpdate;
    }
    public void setLastUpdate() {
        this.lastUpdate = LocalDate.now();
    }

//    public Category getAllCategorys(String category) {
//
//    }
}




