import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        if(age>=18){
            System.out.println("eligible");
        }
        else if (age<18&&age>0) {
            System.out.println("not eligible");
        }
        else{
            System.out.println("invalid age");
        }

    }
}