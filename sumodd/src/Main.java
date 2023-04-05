public class Main {
    public static void main(String[] args) {

        int sum = sumOdd(100,1000);
        System.out.println(sum);
    }
    public static boolean isOdd(int number) {
        if(number<0){
            return false;
        }

        else {
            return number % 2 != 0;
        }
    }
    public static int sumOdd(int start , int end) {
        int sum = 0;
        if (start > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }return sum;
        }
        return -1;}




}
