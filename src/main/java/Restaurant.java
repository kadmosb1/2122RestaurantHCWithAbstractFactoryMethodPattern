import meals.Meal;

import java.util.Scanner;

public class Restaurant {

    public static Seeder seeder;

    public static void main (String [] args) {

        // Met behulp van een seeder wordt de initiële data (die normaal uit de database wordt gelezen) nu hard
        // coded toegevoegd (dat noem je seeding).
        Seeder seeder = new Seeder ();
        int teller = 1;

        System.out.println ("Welke maaltijd wil de klant bestellen?");
        System.out.println ();

        // Het menu wordt gevuld met de in de seeder aangemaakte maaltijden.
        for (Meal meal : seeder.getMeals ()) {
            System.out.printf ("%2d. %s%n", teller++, meal.getName ());
        }

        System.out.println ();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welke maaltijd? ");
        int keuze = scanner.nextInt();
        scanner.nextLine ();
        String order = seeder.getMeal (keuze - 1).getOrder ();
        System.out.println (order);
    }
}