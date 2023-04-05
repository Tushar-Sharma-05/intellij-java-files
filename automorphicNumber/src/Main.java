public class Main {
    public static void main(String[] args) {
        isAutoMorphic(27);

    }

    public static void isAutoMorphic(int num) {
        int sq = num*num;
        while(num>0){
            if(num%10!=sq%10){
                System.out.println("Not Automaorphic");
            }
            num = num/10;
            sq = sq/10;

        }
        System.out.println("Automorphic");




    }
}