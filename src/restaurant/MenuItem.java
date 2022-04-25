package restaurant;

class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;


    public MenuItem(String aName, double aPrice, String aDescription, String aCategory) {
        this.name = aName;
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;

        this.setItemState("new");
    }


    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public String getCategory() {
        return this.category;
    }
    public boolean getItemState() {
        return this.isNew;
    }


    public void setName(String aName) {
        this.name = aName;
        Menu.setLastUpdate();
    }
    public void setPrice(double aPrice) {
        this.price = aPrice;
        Menu.setLastUpdate();
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
        Menu.setLastUpdate();
    }
    public void setCategory(String aCategory) {
        String input = aCategory;
        if (input == null){
            System.out.println("The category you entered does not exist, " +
                    "please check for existing categories or create a new one.");
        } else {
            input = input.toLowerCase();
        }

        if (input.equals("appetizer") || input.equals("maincourse") || input.equals("dessert")) {
            this.category = aCategory;
            Menu.setLastUpdate();
        }
    }

    public void setItemState(String str) {
        if (str.equalsIgnoreCase("new")) {
            this.isNew = true;
            Menu.setLastUpdate();
        } else if (str.equals("")) {
            this.isNew = false;
        }
    }
}
