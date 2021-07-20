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
        System.out.print("Enter from above or \"F\" for final order or press \"M\" to get to the main menu or press \"C\" to cancel:");
        String pizzInp = scanFoodInp.nextLine();

        //Make a while loop then a conditional statement
        while(true){

            //Conditional Statements

            if(pizzInp.equals(pizzaTypes[0])){

                System.out.println("Here is your Cheese Pizza! Price:" + pizzaPrice + "$");
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp = scanFoodInp.nextLine();

                if(userInp.equals("Yes") || userInp.equals("yes")){
                    pizzaInp();
                }else if(userInp.equals("No")){
                    break;
                }
                break;
            }else if(pizzInp.equals(pizzaTypes[1])){

                System.out.println("Here is your Veg Pizza! Price:"+ pizzaPrice + "$");
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp1 = scanFoodInp.nextLine();

                if(userInp1.equals("Yes") || userInp1.equals("yes")){
                    pizzaInp();
                }else if(userInp1.equals("No")) {
                    break;
                }
                break;
            }else if(pizzInp.equals(pizzaTypes[2])){

                System.out.println("Here is your Non-Veg Pizza! Price:" + pizzaPrice + "$");
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp2 = scanFoodInp.nextLine();

                if(userInp2.equals("Yes") || userInp2.equals("yes")){
                    pizzaInp();
                }else if(userInp2.equals("No")) {
                    break;
                }
                break;
            }else if(pizzInp.equals(pizzaTypes[3])){

                System.out.println("Here is your Marghrita Pizza! Price:" + pizzaPrice + "$");
                numberOfFoodOrdered += 1;

                System.out.println("You want to order again?");
                String userInp3 = scanFoodInp.nextLine();

                if(userInp3.equals("Yes") || userInp3.equals("yes")){
                    pizzaInp();
                }else if(userInp3.equals("No")) {
                    break;
                }
                break;
            }else if(pizzInp.equals("F") || pizzInp.equals("f")){
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
            }else if(pizzInp.equals("M") || pizzInp.equals("m")){

                //Making an order object here
                Order order = new Order();
                order.loopThroughFood();

            }else if(pizzInp.equals("C") || pizzInp.equals("c")){
                break;
            }
        }
        System.exit(0);
    }
}