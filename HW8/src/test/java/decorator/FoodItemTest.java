package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemTest {

    @Test
    public void testBurgerBasePrice() {
        FoodItem burger = new Burger();
        assertEquals(5.00, burger.getCost(), 0.001);
    }

    @Test
    public void testFriesBasePrice() {
        FoodItem fries = new Fries();
        assertEquals(2.50, fries.getCost(), 0.001);
    }

    @Test
    public void testHotDogBasePrice() {
        FoodItem hotDog = new HotDog();
        assertEquals(3.50, hotDog.getCost(), 0.001);
    }
}