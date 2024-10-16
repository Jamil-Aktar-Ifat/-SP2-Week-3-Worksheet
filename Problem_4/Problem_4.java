package Problem_4;

import java.util.ArrayList;

public class Problem_4 {
    public static void main(String[] args) {

        // problem a
        ArrayList<String> names = new ArrayList<>();
        System.err.println(names);
        String[] namesArray = { "Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry" };
        for (String name : namesArray) {
            names.add(name);
        }

        print(names);

        // problem b
        String firstName = names.get(0);
        String lastName = names.get(names.size() - 1);
        print("First name: " + firstName + "\nLast Name: " + lastName);

        // problem c
        print("The size of the array: " + names.size());

        // problem d
        print("The last name of the list using size(): " + (names.get(names.size() - 1)));

    }

    // method to print anything
    static void print(Object anyObject) {
        System.out.println(anyObject);
    }

}
