public class Main {
    public static void main(String[] args) {
        isSunny();


    }

    public static void isSunny() {
        int i =1;
        while(i<=100){
            double nextNum = i + 1;
            double sq = Math.sqrt(nextNum);
            double x = (sq - Math.floor(sq));
//            System.out.println(x);

            if (x == 0) {
                System.out.println(i);

            } 

            i++;

        }





    }


}