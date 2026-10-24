package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testOrderTotalCost() {
        Order order = new Order();

        FoodItem burger = new Cheese(new Burger());
        FoodItem fries = new Ketchup(new Fries());

        order.addItem(burger);
        order.addItem(fries);

        assertEquals(9.00, order.calculateTotalCost());
    }

    @Test
    public void testLoyaltyDiscount() {
        LoyaltyStatus gold = new LoyaltyStatus("GOLD");
        LoyaltyStatus silver = new LoyaltyStatus("SILVER");
        LoyaltyStatus none = new LoyaltyStatus("REGULAR");

        assertEquals(8.00, gold.applyDiscount(10.00));
        assertEquals(9.00, silver.applyDiscount(10.00));
        assertEquals(10.00, none.applyDiscount(10.00));
    }
}