public class Main {
    public static void main(String[] args) {
        printDiamond();

    }

    public static void printDiamond() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++){
                System.out.println("*");
            }
            for(int l =1;l<=5;l++){
                System.out.println(" ");
            }
        }
        System.out.println();

    }
}