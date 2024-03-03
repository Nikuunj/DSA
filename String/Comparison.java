package Java.Youtube.String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Nikunj";
        String b = "Nikunj";
        String c  = a;

        //==
//        System.out.println(a == c);

        String name1 = new String("Nikunj");
        String name2 = new String("Nikunj");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }
}
