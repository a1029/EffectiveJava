package item33;

import java.util.HashSet;

public class error {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        ((HashSet)set).add("문자열");

        Integer e= set.iterator().next();
        System.out.println(e);

    }
}
