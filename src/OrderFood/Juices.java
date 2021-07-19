package OrderFood;

public class Juices extends Drinks{

    public void juiceInp() {
        //Array for juiceTypes
        String[] juiceTypes = {"Apple Juice", "Orange Juice", "Mango Juice"};

        //Loop through the array and print elements
        for(String value : juiceTypes){
            System.out.println(value);
        }

        //Making input for juice types
        System.out.print("Enter from these or \"F\" for final order or press \"C\" to cancel:");
        String juiceInp = scanDrinkInp.nextLine();

        //While loop and a Conditional Statement for input
        while(!juiceInp.equals("C") || !juiceInp.equals("c")){

            if(juiceInp.equals(juiceTypes[0])){
                System.out.println("Here is your apple juice! Price:" + juicePrice + "$");
                numberOfDrinksOrdered += 1;

                System.out.println("You want to order again?");
                String userInp = scanDrinkInp.nextLine();

                if(userInp.equals("Yes")){
                    juiceInp();
                }else if(userInp.equals("No")){
                    break;
                }
                break;
            }else if(juiceInp.equals(juiceTypes[1])){
                System.out.println("Here is your Orange Juice! Price:"+ juicePrice + "$");
                numberOfDrinksOrdered += 1;

                System.out.println("You want to order again?");
                String userInp1 = scanDrinkInp.nextLine();
                if(userInp1.equals("Yes")){
                    juiceInp();
                }else if(userInp1.equals("No")) {
                    break;
                }
                break;
            }else if(juiceInp.equals(juiceTypes[2])){
                System.out.println("Here is your Mango Juice! Price:" + juicePrice + "$");
                numberOfDrinksOrdered += 1;
                System.out.println("You want to order again?");
                String userInp2 = scanDrinkInp.nextLine();
                if(userInp2.equals("Yes")){
                    juiceInp();
                }else if(userInp2.equals("No")) {
                    break;
                }
                break;
            }else if(juiceInp.equals("F")){
                System.out.println("Here is your bill:" + juicePrice * numberOfDrinksOrdered + "$");
                break;
            }else if(juiceInp.equals("C")){
                break;
            }
        }
    }
}