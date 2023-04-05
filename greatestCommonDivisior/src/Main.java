public class Main {
    public static void main(String[] args) {
        int result = getGreatestCommonDivisor(12,30);
        System.out.println(result);

    }


        public static int getGreatestCommonDivisor(int first,int second){
            int a=0;
            if(first<10||second<10){
                return -1;
            }
            for(int i=1;i<=first;i++){
                if(first%i==0&&second%i==0)
                    a=i;
            }
            return a;
        }


}