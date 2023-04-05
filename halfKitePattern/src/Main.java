public class Main {
    public static void main(String[] args) {
        printPattern();

    }

    public static void printPattern() {
        for(int i=1;i<=10;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=9;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}