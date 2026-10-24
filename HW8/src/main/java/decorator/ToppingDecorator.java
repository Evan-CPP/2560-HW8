package decorator;

public abstract class ToppingDecorator implements FoodItem {
    protected FoodItem item;

    public ToppingDecorator(FoodItem item) {
        this.item = item;
    }

    @Override
    public double getCost() {
        return item.getCost();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}