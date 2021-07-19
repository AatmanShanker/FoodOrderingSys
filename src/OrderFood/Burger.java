package OrderFood;

public class Burger extends Food{

    public void burgInp(){

        //An array for burger types
        String[] burgerTypes = {"Cheese Burger", "Veg Burger", "Non-Veg Burger", "Mega Burger"};

        //Looping throught the array
        for(String burVal : burgerTypes){
            System.out.println(burVal);
        }

        //Making a userinput for burger types
        System.out.print("Enter one from these or \"F\" for final order or \"C\" to cancel order:");
        String burgerInp = scanFoodInp.nextLine();

        //Make a while loop and then a conditional statement for user input
        while(!burgerInp.equals("C")){

            if(burgerInp.equals(burgerTypes[0])){
                System.out.println("Here is your Cheese burger! Price:" + burgerPrice);
                break;
            }
        }
    }
}
