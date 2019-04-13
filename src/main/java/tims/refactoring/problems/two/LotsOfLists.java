package tims.refactoring.problems.two;

import com.google.common.collect.Lists;

import java.util.List;

public class LotsOfLists {

    public class Person {
        private String name;
        private Integer age;

        @Override
        public String toString() {
            return name + " is " + age + " years old.";
        }
    }

    public static void print(List<String> names, List<Integer> ages) {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old.");
        }
    }

    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("fred", "paul", "jean");
        List<Integer> ages = Lists.newArrayList(20, 30, 40);
        print(names, ages);
    }


}
