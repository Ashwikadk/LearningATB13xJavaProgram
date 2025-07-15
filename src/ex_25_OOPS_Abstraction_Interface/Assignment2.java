package ex_25_OOPS_Abstraction_Interface;

public class Assignment2 {
    public static void main(String[] args) {
        Bank sbi=new SBI();
        Bank hdfc=new HDFC();
        sbi.getInterestRate();
        hdfc.getInterestRate();
        System.out.println( sbi.getInterestRate());
        System.out.println( hdfc.getInterestRate());
    }
}
abstract class Bank{
    abstract double getInterestRate();
}
class SBI extends Bank{
     double getInterestRate(){
        System.out.println("SBI Interest Rate");
        return 6.5;
    }

}
class HDFC extends Bank{

    double getInterestRate()
    {

        System.out.println("HDFC Interest Rate");
        return 7.00;
    }
}