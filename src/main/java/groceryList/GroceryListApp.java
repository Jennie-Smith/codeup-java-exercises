package groceryList;

import util.Input;
// input.getString(); get newline out of buffer
public class GroceryListApp {
    public static Input userInput(){
        Input input = new Input();
        return input;
    }
    public static void main(String[] args) {
//        Input input = new Input();
        boolean done = true;
        System.out.println("Would you like to create a grocery list? [y/N]");
        String makeListChoice = userInput().getString();
        if (!makeListChoice.equals("y")) {
            System.out.println("... come back when you wish to make a list, please.");
        }
        System.out.println("Give your list a name: ");
        String yourListNameInput = userInput().getString();
        GroceryList yourList = new GroceryList(yourListNameInput);

        while(done){
            System.out.println("Would you like to add a new item? [y/N]");
            String addNewItemChoice = userInput().getString();

            if (addNewItemChoice.equals("y")) {
                yourList.addItem(getCategoryName());
            } else {
                System.out.println(yourList);
                done = false;
            }
        }
    }
    public static ListItems getCategoryName(){
        System.out.println("Enter category name: ");
        String categoryInput = userInput().getString();
        System.out.println("Enter food name: ");
        String foodNameInput =  userInput().getString();
        System.out.println("Enter quantity of food");
        int quantityInput =  userInput().getInt();
        ListItems userList = new ListItems(categoryInput, foodNameInput, quantityInput);
        return userList;
    }
}
