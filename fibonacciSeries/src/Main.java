public class Main {
    public static void main(String[] args) {
      int result = fibSeries(8);
        System.out.println(result);

    }

    public static int fibSeries(int n) {
        int sum = 0;
        if(n==1){
            return 0;
        }
        else if (n==2) {
            return 1;

        }
        else{
         return fibSeries(n-1)+fibSeries(n-2);

        }


    }
}