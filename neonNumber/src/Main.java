public class Main {
    public static void main(String[] args) {
        isNeon();

    }

    public static void isNeon() {

        int i= 0;
        while (i<=10000){
            int sq = i*i;


            int sum=0;
            while (sq>0){
                int lastDigit=sq%10;
                sum=sum+lastDigit;
                sq=sq/10;


            }

            if(i==sum){
                System.out.println(i + " is a neon number");
            }

            i++;




        }





    }

}