public class Main {
    public static void main(String[] args) {

        boolean result = isPalindrome(121);
        System.out.println(result);

    }
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int temp = number;
        while(number!=0){
            int lastDigit= number%10;

            reverse=reverse*10+lastDigit;
            number/=10;

        }
        if(temp==reverse){
            System.out.println( reverse);
            return true;
        }
        else{
            System.out.println(reverse);
            return false;
        }
    }
}