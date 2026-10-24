package decorator;

public class Cheese extends ToppingDecorator {
    public Cheese(FoodItem item) {
        super(item);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}