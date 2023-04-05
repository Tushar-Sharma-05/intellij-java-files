public class Main {
    public static void main(String[] args) {
       int result =  printSumAverage(10);
        System.out.println(result);

    }

    public static int printSumAverage(int n) {
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum=sum+i;


        }
        return sum/n;

    }
}