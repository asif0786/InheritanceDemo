public class Parent {
    int x = 20;
    int y = 40;
}
class Child extends Parent{
    int a = 5;
    int b = 6;
    void add(int p, int q){
        System.out.println("Sum of given Numbers: "+(x+y)); //It is super class
        System.out.println("Sum of given Numbers: "+(a+b)); // It is current class
        System.out.println("Sum of given Numbers: "+(p+q)); // It is local
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.add(123,321);
    }
}