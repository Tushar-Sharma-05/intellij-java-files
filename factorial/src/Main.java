public class Main {
    public static void main(String[] args) {
      int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
}