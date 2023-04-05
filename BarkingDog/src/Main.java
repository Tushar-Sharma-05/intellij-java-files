public class Main {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay<8&&hourOfDay>=0&&barking==true){
            return true;
        }
        else if(hourOfDay>22&&hourOfDay<=23&&barking==true){return true;}
        else{return false;}
    }

}
