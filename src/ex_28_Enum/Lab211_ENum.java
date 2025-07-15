package ex_28_Enum;

public class Lab211_ENum {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
        System.out.println(Locators.page_input_password.getLocators());
        System.out.println(Locators.page_button.getLocators());

        System.out.println(Colors.Red.getHexcode());
        System.out.println(Colors.Blue.getHexcode());
        System.out.println(Colors.white.getHexcode());
        System.out.println(Colors.orange.getHexcode());



        System.out.println(APIURL.vwo.getUrl());
        System.out.println(APIURL.google.getUrl());
    }}