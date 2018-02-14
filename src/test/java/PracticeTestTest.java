import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * filename:
 * project: practicetest
 * author: https://github.com/vvmk
 * date: 2/14/18
 */
public class PracticeTestTest {
    private FoodFactory myFoods;

    @BeforeAll
    public void setup() {
        myFoods = new FoodFactory();
    }

    @Test
    public void testFactory1() {
        FoodFactory.Food food1 = myFoods.getFood("FastFood");


        String expected = "FastFood";
        String actual = food1.getClass().getName();

        //assert
    }

    @Test
    public void testFactory2() {
        FoodFactory.Food food2 = myFoods.getFood("Fruit");

        String expected = "Fruit";
        String actual = food2.getClass().getName();

        //assert
    }

    @Test
    public void testFactory3() {
        FoodFactory.Food food1 = myFoods.getFood("FastFood");

        String expected = "FastFood";
        String actual = food1.getClass().getSuperclass().getName();

        //assert
    }

    @Test
    public void testFactory4() {
        FoodFactory.Food food1 = myFoods.getFood("FastFood");
        FoodFactory.Food food2 = myFoods.getFood("Fruit");

        String expected = "I'm serving Fruit";
        String actual = food2.serveFoodToString();

        //assert
    }
}
