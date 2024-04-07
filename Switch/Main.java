package Java.Youtube.Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        String a = "Nikunj";
//        String b = "Nikunj";

//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("apple")) {
//            System.out.println("A seet red fruit");
//
//        }
//        System.out.println(a == b)






        switch (fruit){
            case "Mango":
                System.out.println("King og fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Roound fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Plz enter a vail fruit");
        }
    }
}
