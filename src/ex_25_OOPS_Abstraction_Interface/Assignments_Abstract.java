package ex_25_OOPS_Abstraction_Interface;

public class Assignments_Abstract {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.makeSound();
        Animal d=new Dog();
        d.makeSound();
    }
}
abstract class Animal{
    abstract void makeSound();

}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Mewoo   meowooo");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Baww   Baw");
    }
}