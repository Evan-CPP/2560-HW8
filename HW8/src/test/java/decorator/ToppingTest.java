package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToppingTest {

    @Test
    public void testBurgerWithCheese() {
        FoodItem burger = new Burger();
        burger = new Cheese(burger);

        // Base burger (5.00) + Cheese (1.00) = 6.00
        assertEquals(6.00, burger.getCost());
        assertEquals("Burger, Cheese", burger.getDescription());
    }

    @Test
    public void testHotDogWithKetchupAndOnions() {
        FoodItem hotDog = new HotDog();
        hotDog = new Ketchup(hotDog);
        hotDog = new Onions(hotDog);

        assertEquals(4.75, hotDog.getCost());
        assertEquals("Hot Dog, Ketchup, Onions", hotDog.getDescription());
    }
}