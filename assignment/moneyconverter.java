import java.util.Scanner;

public class moneyconverter {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter an amount of money 
        System.out.print("Enter an amount of money: ");
        double amount = scanner.nextDouble();

        // close the scanner
        scanner.close();

        // convert the amount to cents (integer)
        int cents = (int) (amount * 100);

        // calculate the number of dollars, quarters, dimes, nickels, and pennies
        int dollars = cents / 100;
        cents %= 100;
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        int pennies = cents % 5;

        // display the results
        System.out.println("$" + amount + " is equivalent to:");
        System.out.println("Dollar(s): " + dollars);
        System.out.println("Quarter(s): " + quarters);
        System.out.println("Dime(s): " + dimes);
        System.out.println("Nickel(s): " + nickels);
        System.out.println("Penny(s): " + pennies);

        
    }
}



//This program first reads the users input as a double, converts it to cents as an interger
// and then calculates the number of dollars, quaters, dimes, nickels, and pennies.finally, it displays the equivalent amounts

// OFF3NDER DID THIS