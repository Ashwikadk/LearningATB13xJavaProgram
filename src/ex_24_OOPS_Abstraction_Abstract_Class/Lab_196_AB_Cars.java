package ex_24_OOPS_Abstraction_Abstract_Class;

public class Lab_196_AB_Cars {
    public static void main(String[] args){
WagonR car=new WagonR();
car.drive();
    //    car.stopEngine();
    }
}

abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();
    void checkEngine(){
        System.out.println("Everything is good");
    }
}

class WagonR extends Engine{
    @Override
    void startEngine(){
        System.out.println("Start Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop Car");
    }
    void drive(){
     checkEngine();
     startEngine();
     stopEngine();
    }
}