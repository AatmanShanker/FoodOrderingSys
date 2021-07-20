package OrderFood;

import java.util.Scanner;

public class Drinks extends Order{

    //Making a scanner obj
    Scanner scanDrinkInp = new Scanner(System.in);

    //Making variables for prices
    int juicePrice = 5;
    int alcoholPrice = 8;

    int numberOfDrinksOrdered = 0;

    public void TakeDrinkType(){

        Juices juice = new Juices();
        Alcohol alcohol = new Alcohol();

        System.out.print("Enter which type of food u want juice or alcohol or press \"C\" to cancel:");
        String userFoodInp = scanDrinkInp.nextLine();

        while(!userFoodInp.equals("C")){

            //Conditional statements for User's input

            if(userFoodInp.equals("Juice") || userFoodInp.equals("juice")){
                juice.juiceInp();
            }else if(userFoodInp.equals("Alcohol") || userFoodInp.equals("alcohol")){
                alcohol.alchInp();
            }else{
                System.out.println("Wrong input");
            }
        }
    }
}
