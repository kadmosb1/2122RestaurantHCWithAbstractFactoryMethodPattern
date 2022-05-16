package meals;

import abstractfactories.MealFactory;

public class HamburgerFactory extends MealFactory {
    @Override
    public Meal createMeal() {
        return new Hamburger ();
    }
}
