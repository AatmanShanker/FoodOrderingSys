package OrderFood;

import java.util.Scanner;

public class Food extends Order{

    //Making a Scanner obj for subclasses
    Scanner scanFoodInp = new Scanner(System.in);

    protected float burgerPrice = 4.99f;
    protected float pizzaPrice = 9.99f;

    int numberOfFoodOrdered = 0;

    public void TakeFoodType(){
        Burger burger = new Burger();
        Pizza pizza = new Pizza();

        System.out.print("Enter which type of food u want pizza or burger or press \"C\" to cancel:");
        String userFoodInp = scanFoodInp.nextLine();

        while(!userFoodInp.equals("C")){

            if(userFoodInp.equals("Burger") || userFoodInp.equals("burger")){
                burger.burgInp();
            }else if(userFoodInp.equals("Pizza") || userFoodInp.equals("pizza")){
                pizza.pizzaInp();
            }else{
                System.out.println("Wrong input");
            }
        }
    }
}
