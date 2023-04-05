public class Main {
    public static void main(String[] args) {
        printpattern();

    }

    public static void printpattern() {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}