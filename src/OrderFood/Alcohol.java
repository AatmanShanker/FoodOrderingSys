package OrderFood;

public class Alcohol extends Drinks{

    public void alchInp(){

        //Make a array for alcohol types
        String[] alcoholTypes = {"KingFisher", "Red Wine", "Black Wine"};

        //Loop through the array and print elements
        for(String value : alcoholTypes){
            System.out.println(alcoholTypes);
        }

        //Make userinp for alcohol types
        System.out.print("Enter from above or press \"F\" for final order or press \"C\" to cancel:");
        String alcoholInp = scanDrinkInp.nextLine();

        //Make a while loop and a conditional statement for user input
        while(!alcoholInp.equals("C")){

            if(alcoholInp.equals(alcoholTypes[0])){
                System.out.println("Here is yoru KingFisher! Price:" + alcoholPrice);
                numberOfDrinksOrdered += 1;
                break;
            }
        }
    }
}
