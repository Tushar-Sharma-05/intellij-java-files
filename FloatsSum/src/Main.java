public class Main {
    public static void main(String[] args) {
        printSum();

    }

    public static void printSum() {
        float [] number = {12.00f,65.00f,45.09f,86.04f};
        float sum=0;
        for (float element:number
             ) {
            sum = sum+element;



        }
        System.out.println(sum);

    }
}