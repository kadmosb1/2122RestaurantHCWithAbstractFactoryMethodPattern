package meals;

import java.util.Scanner;

public class Special extends Meal {

    public Special() {
        super ("Broodje hamburger speciaal");
    }

    @Override
    public String getOrderLine() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Wil de klant curry of ketchup bij het broodje hamburger speciaal? ");
        return "= Saus: " + scanner.nextLine () + "\r\n";
    }
}