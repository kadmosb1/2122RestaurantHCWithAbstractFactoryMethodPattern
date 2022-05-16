package meals;

import java.util.ArrayList;
import java.util.Scanner;
import ingredients.IIngredient;

public abstract class Meal {

    private final String name;
    private final ArrayList<IIngredient> ingredients;

    public Meal (String name) {
        ingredients = new ArrayList<> ();
        this.name = name;
    }

    public String getIngredientsString () {

        StringBuilder sb = new StringBuilder ();

        for (int teller = 0; teller < ingredients.size (); teller++) {

            if (teller == 0) {
                sb.append (" (met ");
            }
            else if (teller == (ingredients.size () - 1)) {
                sb.append (" en ");
            }
            else {
                sb.append (", ");
            }

            sb.append (ingredients.get (teller).getName ());

        }

        if (ingredients.size () > 0) {
            sb.append (")");
        }

        return sb.toString ();
    }

    public String getName () {
        return name + getIngredientsString ();
    }

    public void addIngredient (IIngredient ingredient) {
        ingredients.add (ingredient);
    }

    public abstract String getOrderLine ();

    public String getOrder () {

        Scanner scanner = new Scanner (System.in);
        StringBuilder order = new StringBuilder ();
        order.append ("\r\n===============================================\r\n");
        order.append ("= Bestelling: ").append (getName ()).append ("\r\n");
        order.append (getOrderLine ());

        for (IIngredient ingredient : ingredients) {
            order.append (ingredient.getOrderLine (scanner));
        }

        order.append ("===============================================");
        return order.toString ();
    }
}
