package OrderFood;

public class Pizza extends Food{

    public void pizzaInp(){

        //Making an pizza types array
        String[] pizzaTypes = {"Cheese Pizza", "Veg Pizza", "Non-Veg Pizza", "Marghrita Pizza"};

        //Looping through the array
        for(String value : pizzaTypes){
            System.out.println(value);
        }

        //Make a user input for pizza types
        String pizzInp = scanFoodInp.nextLine();
        System.out.print("Enter from above or \"F\" for final order or press \"C\" to cancel:");

        //Make a while loop then a conditional statement

    }
}