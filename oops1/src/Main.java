public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student s2 = new Student();
        s2.name= "Tushar";
        s2.age=24;
        s2.printInfo(s2.name,s2.age);

    }
}
class  Student{
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);

    }   public void printInfo(int age) {
        System.out.println(age);

    }
    public void printInfo(String name,int age) {
        System.out.println(name + "," + age);

    }




}