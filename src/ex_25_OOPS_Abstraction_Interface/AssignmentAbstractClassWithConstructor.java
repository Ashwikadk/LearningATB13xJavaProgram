package ex_25_OOPS_Abstraction_Interface;

public class AssignmentAbstractClassWithConstructor {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.DemoMethod();
    }

}
class Demo{
    Demo(){
        System.out.println("Abstract class constructor called");
    }

    void DemoMethod(){
        System.out.println("Method from abstract class");
    }
}
