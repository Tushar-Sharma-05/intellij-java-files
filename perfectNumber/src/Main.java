public class Main {
    public static void main(String[] args) {
       boolean result =  isPerfectNumber(28);
        System.out.println(result);

    }

    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        else{
            int sum = 0;
            for(int i = 1;i<=number;i++){
                if(number%i==0){
                    sum = (sum+i);


                }


            }
            if((sum-number)==number){
                return true;
            }
            else{
                return false;
            }


        }




    }
}