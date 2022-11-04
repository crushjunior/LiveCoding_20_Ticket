package List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Петя");
        names.add("Вова");
        names.add("Маша");

        System.out.println(names);
        System.out.println(sortList(names, names2));

    }

public static List<String> sortList(List<String> list1, List<String> list2) {
        for (String string : list1) {
        list2.add(string.substring(1));
        }
        Collections.sort(list2);
        return list2;
    }
}
