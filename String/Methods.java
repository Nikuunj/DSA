package Java.Youtube.String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Nikunj Makwana";
        char[] arr = new char[name.length()];
        arr = name.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('j'));
        System.out.println();

        System.out.println("         Nikunj    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
