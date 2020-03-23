import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class waterBottleTest {

    waterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new waterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasOneDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void hasThreeDrinks(){
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(70, waterBottle.getVolume());
    }

    @Test
    public void hasEmptiedBottle(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void hasRefilledBottle(){
        assertEquals(100, waterBottle.refill());
    }
}
