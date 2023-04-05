import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true){
            int order = counter+1;
            System.out.println("Enter the number : " + order+ ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(!isAnInt){
                    break;
                }

            }else {
                System.out.println("invalid number");

            }

            scanner.nextLine();//handle end of line



        }

        scanner.close();
        System.out.println("sum = "+ sum);


    }}









