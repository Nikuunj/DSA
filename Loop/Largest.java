//package Youtube.src;
//
//import java.util.Scanner;
//
//public class Largest {
//    public static void main(String[] args) {
//    Scanner in = next Scanner(System.in);
//
//    }
//}
import java.sql.SQLOutput;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first element :");
        int a = sc.nextInt();
        System.out.println("Enter Second element :");
        int b = sc.nextInt();
        System.out.println("Enter third element :");
        int c = sc.nextInt();
//        if (a > b & a > c){
//            System.out.println("First elemnt is a gretest.");
//        } else if (b > a & b > c) {
//            System.out.println("Second elemnt is a gretest.");
//        }else if (c > a & c > b ){
//            System.out.println("third lemnt is a gretest.");
//        }
        int max =Math.max(c , Math.max(a, b));

        System.out.println("Maximum number is " + max);

    }
}
