package ingredients;

import java.util.Scanner;

public class Fries implements IIngredient {

    @Override
    public String getName() {
        return "frites";
    }

    public String getOrderLine () {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Wil de klant fritessaus bij de frites (j/n) ");
        return "= Extra fritessaus: " + (scanner.nextLine ().equals ("j") ? "ja" : "nee") + "\r\n";
    }
}
