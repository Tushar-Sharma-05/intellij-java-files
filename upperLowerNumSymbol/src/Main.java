import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Something !!");
        Scanner sc = new Scanner(System.in);
        char value  = sc.next().charAt(0);

        if(value>='A'&&value<='Z'){
            System.out.println("Uppercase");
        } else if (value>='a'&&value<='z') {
            System.out.println("Lowercase");
        }



        else if(value>='0'&&value<='9'){
            System.out.println("Digit");
        }

        else{
            System.out.println("Special Symbol");
        }

    }
}