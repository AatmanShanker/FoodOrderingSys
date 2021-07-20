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
        while(true){

            //Conditional Statements

            if(burgerInp.equals(burgerTypes[0])){

                System.out.println("Here is your Cheese burger! Price:" + burgerPrice);
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp = scanFoodInp.nextLine();

                if(userInp.equals("Yes") || userInp.equals("yes")){
                    burgInp();
                }else if(userInp.equals("No")){
                    break;
                }
                break;
            }else if(burgerInp.equals(burgerTypes[1])){

                System.out.println("Here is your Veg burger! Price:" + burgerPrice);
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp2 = scanFoodInp.nextLine();

                if(userInp2.equals("Yes") || userInp2.equals("yes")){
                    burgInp();
                }else if(userInp2.equals("No")){
                    break;
                }
                break;
            }else if(burgerInp.equals(burgerTypes[2])){

                System.out.println("Here is your Non-Veg burger! Price:" + burgerPrice);
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp3 = scanFoodInp.nextLine();

                if(userInp3.equals("Yes") || userInp3.equals("yes")){
                    burgInp();
                }else if(userInp3.equals("No")){
                    break;
                }
                break;
            }else if(burgerInp.equals(burgerTypes[3])){

                System.out.println("Here is your Mega burger! Price:" + burgerPrice);
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp4 = scanFoodInp.nextLine();

                if(userInp4.equals("Yes") || userInp4.equals("yes")){
                    burgInp();
                }else if(userInp4.equals("No")){
                    break;
                }
                break;
            }else if(burgerInp.equals("F") || burgerInp.equals("f")){

                int bill = pizzaPrice * numberOfFoodOrdered;
                System.out.println("Here is your bill:" + bill + "$");

                System.out.print("Enter amount to pay:");
                int moneyInp = scanFoodInp.nextInt();

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
            }else if(burgerInp.equals("M") || burgerInp.equals("m")){

                //Making an order object here
                Order order = new Order();
                order.loopThroughFood();

            }else if(burgerInp.equals("C") || burgerInp.equals("c")){

                break;
            }
        }
        System.exit(0);
    }
}
