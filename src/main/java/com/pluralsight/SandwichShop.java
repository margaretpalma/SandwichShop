package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //asks the user to pick which sandwich they want
        System.out.println("Which size sandwich would you like?");
        System.out.println("1. Regular: $5.45");
        System.out.println("2. Large: $8.95");
        int pickSize = scanner.nextInt();

        //not using any .equals() because they're choosing option 1 or 2

        //price depending on size choice
        double price = 0;  //variable called price, double because $$ has decimals

        //if/else statement for base price
        if (pickSize == 1) {
            price = 5.45;
        }
        else if (pickSize == 2) {
            price = 8.95;
        }

        System.out.println("Base Price: "+ "$" + price);

        //prompting user for their age, if/else statements used here for discounts
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();

        //discount based on age
        //if age is less than or equal to 17, 10% discount
        if (age <= 17) {
            price = price - (price * 0.10);     //multiplies by remaining amount
        }
        else if (age >= 65) {
            price = price - (price * 0.20);
        }

        System.out.printf("Your total discounted price is: $%.2f\n", price);

        scanner.close();
    }
}