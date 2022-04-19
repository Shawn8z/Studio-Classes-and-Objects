package restaurantT;

public class MenuItems {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItems(String aName, double aPrice, String aDescription, String aCategory) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
    }
}
