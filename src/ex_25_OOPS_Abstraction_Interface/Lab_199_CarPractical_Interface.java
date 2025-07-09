package ex_25_OOPS_Abstraction_Interface;

public class Lab_199_CarPractical_Interface {
public static void main(String[] args){
    Car c=new Car();
    c.drive();
}
}
interface Brakes{
    void applyBrakes();
    void money();
}
interface Engine1{
    void startEngine1();
    void money();
    void stopEngine();

    default void complete1(){
        System.out.println("default complete method in the interface");
    }
}
class Car implements Brakes,Engine1{

    @Override
    public void startEngine1() {
        System.out.println("engine started");
    }
    public void stopEngine(){
        System.out.println("Stop engine");
    }

    @Override
    public void money() {
        System.out.println("son has to give money bcs abstracr method is not having anything");
    }
public void applyBrakes(){
        System.out.println("break applied");
}
    void drive(){
       startEngine1();
       applyBrakes();
       stopEngine();
    }

}