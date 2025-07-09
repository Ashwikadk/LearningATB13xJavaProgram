package ex_25_OOPS_Abstraction_Interface;

public class Lab_198_Interface {
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
      r1.getArea(11,22);
      Square s=new Square();
      s.getArea(5,5);
    }
}

interface Polygon{

    void getArea(int length,int breadth);
    default void complete() {
        System.out.println("This is possible !");
    }

    default void complete2() {
        System.out.println("This is possible2 !");
    }

    static void staticComplete() {
        System.out.println("Static F1 in interface allowed, complete");
    }

}
class Rectangle implements Polygon{
    @Override
     public void getArea(int length, int breadth){
      System.out.println( "area of rectangle is "+ length*breadth);

    }
}

class Square implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
      System.out.println(   length*length);
    }
}

abstract class A {
    abstract void m1();

    void complete() {
        System.out.println("complete!");
    }

}