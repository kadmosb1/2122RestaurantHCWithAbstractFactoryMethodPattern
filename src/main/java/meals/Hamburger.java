package meals;

public class Hamburger extends Meal {

    public Hamburger () {
        super ("Broodje hamburger");
    }

    @Override
    public String getOrderLine() {
        return "";
    }
}