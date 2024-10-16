package Problem_4;

import java.util.ArrayList;

public class Problem_4a {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.err.println(names);
        String[] namesArray = { "Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry" };
        for (String name : namesArray) {
            names.add(name);
        }

        print(names);

    }

    // method to print anything
    static void print(Object anyObject) {
        System.out.println(anyObject);
    }

}
