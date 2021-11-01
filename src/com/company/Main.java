package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    double[] pizzaPrices = {7.99, 10.99, 13.99};
        try{
            System.out.println("What size pizza would you like? (Type small, medium, large)");
            String chosenSize = input.next();
            double chosenSizePrice = 0;
            if (chosenSize.equals("small")) {
                chosenSizePrice = pizzaPrices[0];
                System.out.println("You have chosen a small pizza, price: " + chosenSizePrice);
            } else if (chosenSize.equals("medium")) {
                chosenSizePrice = pizzaPrices[1];
                System.out.println("You have chosen a medium pizza, price: " + chosenSizePrice);
            } else if (chosenSize.equals("large")) {
                chosenSizePrice = pizzaPrices[2];
                System.out.println("You have chosen a large pizza, price: " + chosenSizePrice);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


// shes gonna order extra extra large pizza with anchovis with £1000