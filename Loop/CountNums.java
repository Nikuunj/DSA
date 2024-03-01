package Java.Youtube.src;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int n = in.nextInt();
        int count = 0;
        System.out.println("Enter the num what you want to find :");
        int a = in.nextInt();
        while (n > 0){
            int rem = n % 10;
            if (rem == a){
                count++;
            }
            n = n / 10 ;
        }
        System.out.println(count);
    }
}
