package ex_10_forLoop;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        String s="Praamod";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string of your choice");
        String input=sc.nextLine();
        int vowelCount=0;
        int consnantsCount=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch=='a'||ch=='e'|ch=='i'||ch=='o'|ch=='u')
            {
                vowelCount++;
                System.out.println(vowelCount+"vowelcount");
            }

            else
                consnantsCount++;
            System.out.println(consnantsCount+"conconsnantsCount");
            }}

        }



