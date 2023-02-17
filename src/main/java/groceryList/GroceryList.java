package groceryList;

import java.util.ArrayList;
import java.util.Objects;

public class GroceryList {
//    name of list
    private String name;

    private ArrayList<ListItems> items;


//    grocerylist
//    name - of list
//    items : arraylist <list items>
//    add item method - pass in listItem itemtoadd

//    list item - name and quantity
//    [name = listname] [items = oranges: 5, lemons: 6]

    public GroceryList(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryList that = (GroceryList) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ListItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<ListItems> items) {
        this.items = items;
    }

    public void addItem(ListItems itemToAdd){
        items.add(itemToAdd);
    }

}
