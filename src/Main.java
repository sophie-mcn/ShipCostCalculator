import javax.swing.*;
import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        final double SHIP_RATE = 0.02;
        final double MIN_COST = 100.00;
        double shipCost = 0.0;
        double totalCost = 0.0;
        String trash = "";

        System.out.println("Enter the item price: ");
        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= MIN_COST)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else
            {
                shipCost = itemPrice * SHIP_RATE;
                totalCost = itemPrice + shipCost;
            }
            System.out.printf("Item price: $%.2f\n", itemPrice);
            System.out.printf("Shipping cost: $%.2f\n", shipCost);
            System.out.printf("Total cost: $%.2f\n", totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid item price input " + trash);
            System.out.println("Exiting... Run the program again");
            System.exit(0);
        }
    }
}
