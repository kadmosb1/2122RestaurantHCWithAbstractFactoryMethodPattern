package meals;

import abstractfactories.MealFactory;

public class SpecialFactory extends MealFactory {
    @Override
    public Meal createMeal() {
        return new Special ();
    }
}
