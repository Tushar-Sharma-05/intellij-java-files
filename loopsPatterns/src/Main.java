public class Main {
    public static void main(String[] args) {
       pattern();
    }

    public static void pattern() {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*" );

            }
            System.out.print( "\n");


        }

    }
}