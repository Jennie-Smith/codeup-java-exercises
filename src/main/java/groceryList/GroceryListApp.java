package groceryList;

import util.Input;

public class GroceryListApp {
    public static void main(String[] args) {
        Input input = new Input();




        boolean done = true;
        do{
//            print menu 1 if they would like to create a grocery list
            System.out.println("Would you like to create a grocery list? [y/N]");
            String makeListChoice = input.getString();
            if (!makeListChoice.equals("y")){
                done = false;
                System.out.println("... come back when you wish to make a list, please.");
            }

//            menu 2 would like to add a new item
            System.out.println("Would you like to add a new item? [y/N]");
            String addNewItemChoice = input.getString();
            if (addNewItemChoice.equals("y")){
//              menu 3 if yes give ordered list of grocery categories,
//              get name of item, and
//              how many of item

            }



            System.out.println("Finish List? [y/N]");
            String choice = input.getString();
            if(!choice.equals("y")){
                done = false;
//                sout out their list
                System.out.println("Bye!");
            }
        }while(done);
    }

}
