package Java.Youtube.Switch;

import java.util.Scanner;

public class NestedSwich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();


//        switch (empID){
//            case 1:
//                System.out.println("Nikunj Makwana");
//                break;
//            case 2:
//                System.out.println("Rahul Rana");
//                break;
//            case 3:
//                String department = in.next();
//                System.out.println("Emp number 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Managenet":
//                        System.out.println("Management dapartment");
//                        break;
//                    default:
//                        System.out.println("No department enter");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");
//        }
        switch (empID) {
            case 1 -> System.out.println("Nikunj Makwana");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                String department = in.next();
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Managenet" -> System.out.println("Management dapartment");
                    default -> System.out.println("No department enter");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
