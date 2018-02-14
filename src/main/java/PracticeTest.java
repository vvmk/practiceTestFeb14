import java.util.Objects;

/**
 * filename:
 * project: practicetest
 * author: https://github.com/vvmk
 * date: 2/14/18
 */
public class PracticeTest {
    public class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        public Human clone() {
            return new Human(name);
        }

        /**
         * not sure if the test is looking for a shallow  or deep copy, this should account for either
         * doesn't exactly comply with OOP...everyone with the same name is the same person...
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return Objects.equals(name, human.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
