import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Dob:");
        int yob = scanner.nextInt();
        scanner.nextLine(); //handle next line character (enter key)
        System.out.println("enter Your name : ");
        String name = scanner.nextLine();
        int age = 2022-yob;
        System.out.println("your name is = "+ name+ ",you are "+age+"years old");
        scanner.close();


    }
}