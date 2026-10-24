package decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        Order myOrder = new Order();

        FoodItem burger = new Burger();
        burger = new Cheese(burger);
        burger = new Onions(burger);

        FoodItem fries = new Ketchup(new Fries());
        FoodItem hotDog = new HotDog();

        myOrder.addItem(burger);
        myOrder.addItem(fries);
        myOrder.addItem(hotDog);

        System.out.println("----- The Order: -----");
        myOrder.printReceipt();

        System.out.println("-------------------");

        double subtotal = myOrder.calculateTotalCost();
        System.out.println("Subtotal: $" + subtotal);

        LoyaltyStatus goldMember = new LoyaltyStatus("GOLD");
        double finalTotal = goldMember.applyDiscount(subtotal);

        System.out.println("Loyalty Status: GOLD (-20%)");
        System.out.println("Final Total: $" + finalTotal);
    }
}