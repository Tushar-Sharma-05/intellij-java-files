public class Main {
    public static void main(String[] args) {
        isTech(2025);



    }

    public static void isTech(int n) {
        int count = 0;
        int num =n;

        while(n>0){
            int lastDigit = n%10;
            n=n/10;
            count++;
        }
        if(count%2==0){
            n=num;

            System.out.println(n);
            int firstNumber = n%(100);
            System.out.println(firstNumber);
            int secondNumber = num/100;
            System.out.println(secondNumber);
            int sum = firstNumber+ secondNumber;
            int sq = sum*sum;
            if(sq==num){
                System.out.println(num + " IS A TECH NUMBER");
            }
            else {
                System.out.println(num+" IS NOT A TECH NUMBER");
            }



        }



        else{
            System.out.println(num+ " NOT A TECH NUMBER");
        }

    }
}