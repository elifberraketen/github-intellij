package OOPclass;

import java.util.*;
public class CoffeeShopMenu {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Americano is A");
        System.out.println("Cappuccino is C");
        System.out.println("Latte is L");
        System.out.println("Esspreso is E");

        System.out.println("Enter your choice : ");
        String choice = input.next().toUpperCase() ;

        switch (choice){

            case "A":
                System.out.println("Americano is 3.00$");
               break;
            case "C":
                System.out.println("Cappuccino is 3.75$");
                break;
            case "L":
                System.out.println("Latte is 3.50$");
                break;
            case "E":
                System.out.println("Esspreso is 2.50$");
                break;
            default:
                System.out.println("Invalid choice");



        }




    }
}
