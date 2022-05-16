import abstractfactories.MealFactory;
import ingredients.Fries;
import ingredients.Soda;
import meals.Meal;
import meals.Special;
import meals.Hamburger;

import java.util.ArrayList;

public class Seeder {

    private final ArrayList<Meal> meals = new ArrayList<> ();

    private Meal getMealWithSodaAndFries (Meal meal) {
        meal.addIngredient (new Soda());
        meal.addIngredient (new Fries());
        return meal;
    }

    public Seeder () {
        meals.add (MealFactory.HAMBURGER_FACTORY.createMeal());
        meals.add (getMealWithSodaAndFries (MealFactory.HAMBURGER_FACTORY.createMeal ()));
        meals.add (MealFactory.SPECIAL_FACTORY.createMeal ());
        meals.add (getMealWithSodaAndFries (MealFactory.SPECIAL_FACTORY.createMeal ()));
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