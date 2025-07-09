package ex_24_OOPS_Abstraction_Abstract_Class;

public class Lab_195_Abstraction {
    public static void main(String[] args) {
Father f1=new Child();
Child child=new Child();
Car c=new Car();
//Father f2=new  Father();//not possible because Father is abstract class
   child.loan50k();
    }
}

abstract class Father{

    abstract void loan50k();//abstract method

    void loan25k(){
        System.out.println("25k given ");//concretemethod
                    }


}
class Child extends Father
{
    void loan50k(){
        System.out.println("Son has given 50k");
    }
}
class Car{
    // This is concreate class
    // this doesn't have the abstract methods
    void done(){

    }
}