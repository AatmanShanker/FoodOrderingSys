package OrderFood;

import java.util.Scanner;

public class Order {
    //Making the Scanner Object here (Global Var)
    Scanner scanInp = new Scanner(System.in);

    public void takeUserName(){

        //USER NAME INPUT
        System.out.print("Enter your name:");
        String userName = scanInp.nextLine();

        //Greeting the user
        System.out.println("Welcome to DaRes!" + userName + "\n");

    }
    public void loopThroughFood(){

        //Making a food Object
        Food food = new Food();
        Drinks drink = new Drinks();

        System.out.println("What do you want Food or Drinks? or Press \"C\" to leave shop");
        String userDemand = scanInp.nextLine();

        if(userDemand.equals("Food") || userDemand.equals("food")){
            food.TakeFoodType();
        }else if(userDemand.equals("Drinks") || userDemand.equals("drinks")){
            drink.TakeDrinkType();
        }
    }
}
