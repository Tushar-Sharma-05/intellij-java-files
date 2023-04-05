public class Main {
    public static void main(String[] args) {
        gcd(12,8);

    }

    public static void gcd(int a,int b) {
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
        for(int j=1;j<=a;j++){
            if(b%j==0){
                System.out.println(j);
            }
        }
        

    }
}