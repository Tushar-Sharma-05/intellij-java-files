public class Main {
    public static void main(String[] args) {
        for(int i=8;i>=2;i--){
            System.out.println("10,100 at"+(i)+"% interest= "+ String.format("%.2f",calculateIntrest(10000,i)));


        }







    }

    public static double calculateIntrest(double amount,double intrest) {
        return(amount*(intrest/100));

    }
}