/**
 * filename:
 * project: practicetest
 * author: https://github.com/vvmk
 * date: 2/14/18
 */
public class FoodFactory {

    public Food getFood(String name) {
        return new Food(name);
    }

    public class Food extends FoodFactory {
        private String name;

        public Food(String name) {
            this.name = name;
        }

        public void serveFood() {
            System.out.println("I'm serving " + name);
        }

        public String serveFoodToString() {
            return "I'm serving" + name;
        }

        public String getName() {
            return name;
        }
    }
}
