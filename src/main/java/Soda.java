import java.util.Scanner;

public class Soda implements IIngredient {

    @Override
    public String getName() {
        return "drinken";
    }

    public String getOrderLine () {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Welk drinken wil de klant bij zijn maaltijd? ");
        return "= Drank: " + scanner.nextLine () + "\r\n";
    }
}
