import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printSmallest();

    }

    public static void printSmallest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if(x<y&&x<z){
//            System.out.println(x+ " is the smallest");
//        }
//        else if(y<z&&y<x) {
//            System.out.println(y+ " is the smallest");
//
//        }
//        else {
//            System.out.println(z+ " is the smallest");
//
//
//        }1



        int smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        System.out.println("The smallest number is: "+smallest);

    }

}