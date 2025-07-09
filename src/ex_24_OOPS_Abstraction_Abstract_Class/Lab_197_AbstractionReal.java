package ex_24_OOPS_Abstraction_Abstract_Class;

public class Lab_197_AbstractionReal {
public static void main(String[] args){

    Company c1=new Company();
    c1.computePay();
}}


abstract class Employee
{
   private String name;
   private String address;
   private int number;

   Employee(){
       System.out.println("Default constructor");
   }

   Employee(String name,String address,int number){
       this.address=address;
       this.name=name;
       this.number=number;
   }

   abstract double computePay();

   void mainCheck(){
       System.out.println("Mailing a check to" +this.name+" " +this.address);
   }

}


class Company extends Employee{

    @Override
    double computePay() {
        System.out.println("salary is 2000");
        return 2000;
    }
}