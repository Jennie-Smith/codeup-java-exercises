package groceryList;

public class ListItems {
//    want it to look like
//    [name = listname] [items = oranges: 5, lemons: 6]
//
//    name of food
    private String category;
    private String name;
//    number of food
    private int quantity;


    public ListItems(String category, String name, int quantity) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ListItems{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
