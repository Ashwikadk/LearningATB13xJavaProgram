package ex_25_OOPS_Abstraction_Interface;

public class Assignment3 {
    public static void main(String[] args) {
        Parent1 p=new Child1();
        p.display();
        p.show();
    }
}
abstract class Parent1{

  abstract  void show();
public void display(){
    System.out.println("Concrete method in abstract class");
}
}
class Child1 extends Parent1{
    public void show(){
        System.out.println("Abstract method implemented");
    }
}
