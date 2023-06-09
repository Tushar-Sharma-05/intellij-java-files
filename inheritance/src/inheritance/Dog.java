package inheritance;

public class Dog extends Animal{

    private int eyes;
    private  int legs;
    private int tail;
    private int teeth;
    private String coat;



    public Dog(String name, int size, int weight,int eyes, int legs,int tail,int teeth,String coat) {
        super(name, 1,1, size, weight);

        this.eyes= eyes;
        this.legs=legs;
        this.coat=coat;
        this.tail=tail;
        this.teeth=teeth;


    }

    private void chew(){
        System.out.println("dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk() called");
        super.move(5);
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move called ");
        super.move(speed);
    }

    public void run(){
        System.out.println("dog.run() called");
        super.move(10);
    }
}
