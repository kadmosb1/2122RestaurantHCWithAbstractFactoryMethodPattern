import java.lang.reflect.Array;
import java.util.ArrayList;

public class Seeder {

    private final ArrayList<Meal> meals = new ArrayList<> ();

    private Meal getMealWithSodaAndFries (Meal meal) {
        meal.addIngredient (new Soda ());
        meal.addIngredient (new Fries ());
        return meal;
    }

    public Seeder () {
        meals.add (new Hamburger());
        meals.add (getMealWithSodaAndFries (new Hamburger ()));
        meals.add (new Special());
        meals.add (getMealWithSodaAndFries (new Special ()));
    }

    public ArrayList<Meal> getMeals () {
        return meals;
    }

    public Meal getMeal (int index) {
        if (index < meals.size ()) {
            return meals.get(index);
        }
        else {
            return null;
        }
    }
}
