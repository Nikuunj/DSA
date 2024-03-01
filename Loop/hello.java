import java.util.Scanner;

public class hello {
//    public static void main(String[] args) {
//        System.out.println("Hello, World.");
//        System.out.print("Hello, Java.");
//    }
//public class Solution {



    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n == 1){
            System.out.println("Weird");
        }else if(n % 2 == 0 && 1 < n && n < 6){
            System.out.println("Not Weird");
        }else if(n % 2 == 1 && 1 < n && n < 6){
            System.out.println("Weird");
        }else if(n % 2 == 0 && 5 < n && n < 21){
            System.out.println("Weird");
        }else if(n % 2 == 1 && 5 < n && n < 21){
            System.out.println("Not Weird");
        }else if(n % 2 == 0 && n > 20){
            System.out.println("Noy Weird");
        }else if(n % 2 == 1 && n > 20){
            System.out.println("Weird");
        }
        // scanner.close();
    }
//}

}
