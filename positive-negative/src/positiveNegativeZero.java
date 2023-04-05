public class positiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(0);


    }

    public static void checkNumber(int number) {
        if(number>0){
            System.out.println("Its a positive number");
        }
        else if(number<0){
            System.out.println("Its negative number");
        }
        else{
            System.out.println("its zero");
        }

    }
}