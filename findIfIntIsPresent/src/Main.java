import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckInt();

    }

    public static void CheckInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");

        int number = sc.nextInt();
        boolean isInt = false;

        int [] integers = {1,2,3,4,5,6,7,8,9};
        for (int element:integers
             ) {
            if(number==element){
                isInt=true;
                break;
            }

        }





        if(isInt){
            System.out.println("present");

        }
        else{
            System.out.println("not present");
        }




    }
}