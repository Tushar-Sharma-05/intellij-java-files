public class Main {
    public static void main(String[] args) {
        isPrime(30);

    }

    public static void isPrime(int n) {



        for(int i = 2;i<=n;i++){
            boolean prime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }



        }

    }
}