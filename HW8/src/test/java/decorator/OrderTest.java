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
}