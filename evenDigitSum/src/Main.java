public class Main {
    public static void main(String[] args) {
        int result = getEvenDigitSum(1234567);
        System.out.println(result);

    }

    public static int getEvenDigitSum(int number) {
        if(number>0){
            int sum = 0;
            while(number!=0){
                int lastDigit = number%10;
                if(lastDigit%2==0){
                    sum = sum+ lastDigit;
                }
                number/=10;

            }
            return sum;

        }
        else{
            return -1;
        }

    }
}