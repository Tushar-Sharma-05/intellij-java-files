package inheritance;

public class Outlander extends Car{
    private int roadServicemonths;

    public Outlander(  int roadServicemonths) {
        super("outlander", "4WD", 5, 5, 6, false);
        this.roadServicemonths = roadServicemonths;
    }
}
