package tims.refactoring.problems.three;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

public class LotsOfMaps {

    public enum Gender {
        MARTIAN,
        MOONKIN,
        VENUSIAN
    }

    public static void print(List<String> names, Map<String, Integer> ages, Map<String, Gender> genders) {
        for (String name : names) {
            System.out.println(name + " is a " + ages.get(name) + " year old " + genders.get(name) + ".");

        }
    }

    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("fred", "paul", "jean");
        Map<String, Integer> ages = ImmutableMap.of("fred", 20, "paul", 30, "jean", 40);
        Map<String, Gender> genders = ImmutableMap.of(
                "fred", Gender.MARTIAN,
                "paul", Gender.MOONKIN,
                "jean", Gender.VENUSIAN);

        print(names, ages, genders);
    }
}
