package restaurant;

class MenuItem {

    private String name;
    private int price;
    private String description;
    private String category;
    private boolean isNew;



    public MenuItem(String aName, int aPrice, String aCategory) {
        this.setName(aName);
        this.setPrice(aPrice);
        this.setDescription("");
        this.setCategory(aCategory);
        this.setItemState(true);
    }

    public MenuItem(String aName, int aPrice, String aDescription, String aCategory) {
        this.setName(aName);
        this.setPrice(aPrice);
        this.setDescription(aDescription);
        this.setCategory(aCategory);
        this.setItemState(true);
    }



    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public int getPrice() {
        return this.price;
    }
    public void setPrice(int aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return this.category;
    }
    public void setCategory(String aCategory) {
        String input = aCategory.toLowerCase();
        if (aCategory.equals("appetizer") || aCategory.equals("mainCourse") || aCategory.equals("dessert")) {
            this.category = aCategory;
        }
        System.out.println("The category you entered does not exist, please check for existing categories or create a new one.");
    }

    public boolean getItemState() {
        return this.isNew;
    }
    public void setItemState(boolean newItem) {
        this.isNew = newItem;
    }
}
