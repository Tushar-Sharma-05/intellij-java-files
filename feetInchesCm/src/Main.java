public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCm(6,0);
        calcFeetAndInchesToCm(100);


    }

    public static double calcFeetAndInchesToCm(double feet,double inches) {
        if((feet<0) || (inches<0 && inches>12)){
            System.out.println("invalid parameters");

            return -1;
        }
        double cm = (feet*12)*2.54;
        cm += inches*2.54;
        System.out.println(feet+ "feet" + inches + "inches = "+ cm+"cm");
        return cm;
    }


    public static double calcFeetAndInchesToCm(double inches) {
        if(inches<0){
            return -1;
        }
        double feet = (int)inches/12;
        double remaininginches = (int) inches % 12;
        System.out.println(inches + "inches = " + feet + "feet and "+ remaininginches+ " inches");
        return calcFeetAndInchesToCm(feet,remaininginches);

    }


}