package item37;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class Plant {

    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant p1 = new Plant("1", LifeCycle.ANNUAL);
        Plant p2 = new Plant("2", LifeCycle.ANNUAL);
        Plant p3 = new Plant("3", LifeCycle.PERENNIAL);
        Plant p4 = new Plant("4", LifeCycle.BIENNIAL);
        Plant[] garden = new Plant[]{p1, p2, p3, p4};

        method1(garden);
        method2(garden);
        method3(garden);
    }

    public static void method1(Plant[] garden) {
        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[LifeCycle.values().length];
        for (int i=0; i< plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        for (Plant p : garden) {
            plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
        }

        for (int i=0; i< plantsByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n", LifeCycle.values()[i], plantsByLifeCycle[i]);
        }
    }

    public static void method2(Plant[] garden) {
        Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(LifeCycle.class);

        for (LifeCycle lc : LifeCycle.values()) {
            plantsByLifeCycle.put(lc, new HashSet<>());
        }

        for (Plant p : garden) {
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }
        System.out.println(plantsByLifeCycle);
    }

    public static void method3(Plant[] garden) {
        System.out.println(Arrays
                .stream(garden)
                .collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(LifeCycle.class), toSet()))
        );
    }
}
