public class Main {
    public static void main(String[] args) {
        boolean result1 = hasSameLastDigit(9,99,999);
        boolean result2 = isValid(9);
        System.out.println(result1+" , " + result2);
    }
    public static boolean  hasSameLastDigit(int num1,int num2,int num3) {

        if((num1<10||num1>1000)||(num2<10||num2>1000)||(num3<10||num3>1000)){
            return false;
        }
        else{
                int lastNum1 = num1%10;
                int lastNum2 = num2%10;
                int lastNum3= num3%10;
                if((lastNum1==lastNum2)){
                    return true;
                }
                else if(lastNum2==lastNum3){
                    return true;

                }
                else if(lastNum1==lastNum3){
                    return true;

                }
                else{
                    return false;
                }
        }

    }

    public static boolean isValid(int num) {
        if(num<10||num>1000){
            return false;
        }
        else{
            return true;
        }


    }
}