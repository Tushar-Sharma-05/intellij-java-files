public class Main {
    public static void main(String[] args) {
        numberToWords(123);

    }

    public static int  numberToWords(int number) {
        if(number<0){
            return -1;
        }
        else{
            int lastdigit = number%10;
            switch (lastdigit){
                case 0:
                    System.out.println(lastdigit + ": ZERO");
                    break;
                case 1:
                    System.out.println(lastdigit + ": ONE");
                    break;

                case 2:
                    System.out.println(lastdigit + ": TWO");
                    break;

                case 3:
                    System.out.println(lastdigit + ": THREE");
                    break;

                case 4:
                    System.out.println(lastdigit + ": FOUR");
                    break;

                case 5:
                    System.out.println(lastdigit + ": FIVE");
                    break;

                case 6:
                    System.out.println(lastdigit + ": SIX");
                    break;

                case 7:
                    System.out.println(lastdigit + ": SEVEN");
                    break;

                case 8:
                    System.out.println(lastdigit + ": EIGHT");
                    break;

                case 9:
                    System.out.println(lastdigit + ": NINE");
                    break;

                default:
                    return -1;


            }
            return -1;


        }

    }
}