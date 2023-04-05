public class Main {
    public static void main(String[] args) {

        int result = sumFirstAndLastDigit(1237);
        System.out.println(result);
    }

    public static int sumFirstAndLastDigit(int number) {

        if(number>0){
            int sum = 0;
            int lastDigit= number%10;
            sum+=lastDigit;
            while(number>=10){

                number/=10;
            }
            sum+=number;
            return sum;
        }
        else{
            return -1;
        }

    }
}