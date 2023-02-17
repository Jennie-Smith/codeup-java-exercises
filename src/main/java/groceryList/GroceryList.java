package groceryList;

import java.util.ArrayList;
import java.util.Objects;

public class GroceryList {
    private ArrayList<Integer> groceryList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryList that = (GroceryList) o;
        return Objects.equals(groceryList, that.groceryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groceryList);
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "List=" + groceryList +
                '}';
    }

    public GroceryList(ArrayList<Integer> groceryList) {
        this.groceryList = groceryList;
    }

    public ArrayList<Integer> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<Integer> groceryList) {
        this.groceryList = groceryList;
    }
}
