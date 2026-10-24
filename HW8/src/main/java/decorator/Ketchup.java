package decorator;

public class Ketchup extends ToppingDecorator {
    public Ketchup(FoodItem item) {
        super(item);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Ketchup";
    }
}