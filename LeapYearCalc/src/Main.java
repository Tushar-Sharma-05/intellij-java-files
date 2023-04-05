public class Main {
    public static void main(String[] args) {

        boolean YEAR = isLeapYear(1800);
        System.out.println(YEAR);


    }

    public static boolean isLeapYear(int year) {
        if(year>=1&&year<=9999) {
            if(year%400==0){
                System.out.println(year + " is a  leap year!!");
                return true;

            } else if (year%4==0&&year%100!=0) {
                System.out.println(year + " is a  leap year!!");
                return true;

            }
            else{
                System.out.println(year + " is not  a  leap year!!");
                return false;



            }



        }
        else{
            System.out.println(year + "does not exist c");
            return false;
        }


    }
}