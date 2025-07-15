package ex_27_Static;

public class Lab208_REAL {
}
class ATB{
    static{
        System.out.println("lOAD the class?, I will execute");
    }
    {
        System.out.println("this is called when object os created");
            }
            private String name;
            private long phone;
    public long getPhone(){
        return phone;
    }
    public long setPhone(long phone){
        this.phone=phone;
        return phone;
    }
    public String getName()
    {
        return name;
    }
    public String setName(String name)
    {
        this.name=name;
return name;
    }
    private long phone;

    static String courseName = "ATB13x";
    static String mentorName = "Pramod";

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }

}