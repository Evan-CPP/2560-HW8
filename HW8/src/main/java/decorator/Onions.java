package decorator;

public class Onions extends ToppingDecorator {
    public Onions(FoodItem item) {
        super(item);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Onions";
    }
}