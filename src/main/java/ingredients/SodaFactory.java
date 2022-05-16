package ingredients;

import abstractfactories.IngredientFactory;

public class SodaFactory extends IngredientFactory {
    @Override
    public IIngredient createIngredient() {
        return new Soda ();
    }
}
