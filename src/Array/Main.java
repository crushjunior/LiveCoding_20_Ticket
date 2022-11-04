package Array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] str = {"One", "Two", "Three", "Four", "One", "Five", "Two"};

        Set<String> set = new LinkedHashSet<>(Arrays.asList(str));
        StringBuilder result = new StringBuilder();
        for (String string : set) {
            result.append(string);
        }
        System.out.println(result);
    }
}
