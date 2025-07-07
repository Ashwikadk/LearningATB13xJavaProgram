package ex_15_StringBuilder_StringBuffer_StringFunction;

public class Lab144_StringBuilder_vsStringBuffer {
    public static void main(String[] args){
        String s0="Ashwika";
        String s1=new String("DK");

        StringBuffer buffer=new StringBuffer("Ashwika");
        StringBuilder builder=new StringBuilder("Ashwika");
        String s3=s0+s1;
        System.out.println(s3);
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(buffer);
        System.out.println(builder);
    }
}
