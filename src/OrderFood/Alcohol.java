package OrderFood;

public class Alcohol extends Drinks{

    public void alchInp(){

        //Make a array for alcohol types
        String[] alcoholTypes = {"KingFisher", "Red Wine", "Black Wine"};

        //Loop through the array and print elements
        for(String value : alcoholTypes){
            System.out.println(value);
        }

        //Make userinp for alcohol types
        System.out.print("Enter from above or press \"F\" for final order or press \"C\" to cancel:");
        String alcoholInp = scanDrinkInp.nextLine();

        //Make a while loop and a conditional statement for user input
        while(true){

            //Conditional Statements

            if(alcoholInp.equals(alcoholTypes[0])){

                System.out.println("Here is yoru KingFisher! Price:" + alcoholPrice);
                numberOfDrinksOrdered += 1;

                System.out.println("You want to order again?");
                String userInp = scanDrinkInp.nextLine();

                if(userInp.equals("Yes") || userInp.equals("yes")){
                    alchInp();
                }else if(userInp.equals("No")){
                    break;
                }
                break;
            }else if(alcoholInp.equals(alcoholTypes[1])){

                System.out.println("Here is yoru RedWine! Price:" + alcoholPrice);
                numberOfDrinksOrdered += 1;

                System.out.println("You want to order again?");
                String userInp2 = scanDrinkInp.nextLine();

                if(userInp2.equals("Yes") || userInp2.equals("yes")){
                    alchInp();
                }else if(userInp2.equals("No")){
                    break;
                }
                break;
            }else if(alcoholInp.equals(alcoholTypes[2])){

                System.out.println("Here is yoru KingFisher! Price:" + alcoholPrice);
                numberOfDrinksOrdered += 1;

                System.out.println("You want to order again?");
                String userInp3 = scanDrinkInp.nextLine();

                if(userInp3.equals("Yes") || userInp3.equals("yes")){
                    alchInp();
                }else if(userInp3.equals("No")){
                    break;
                }
                break;
            }else if(alcoholInp.equals("F") || alcoholInp.equals("f")){

                int bill = alcoholPrice * numberOfDrinksOrdered;
                System.out.println("Here is your bill:" + bill + "$");

                System.out.print("Enter amount to pay:");
                int moneyInp = scanDrinkInp.nextInt();

                if(moneyInp == bill){

                    System.out.println("Thanks for the Payment!");
                    break;
                }else if(moneyInp > bill){

                    System.out.println("Thanks for money Change:" + (moneyInp - bill) + "$");
                    break;
                }else {

                    System.out.println("Wrong payment kicked you out of shop!");
                    break;
                }
            }else if(alcoholInp.equals("M") || alcoholInp.equals("m")){

                //Making an order object here
                Order order = new Order();
                order.loopThroughFood();

            }else if(alcoholInp.equals("C") || alcoholInp.equals("c")){
                break;
            }
        }
        System.exit(0);
    }
}
