package com.Day23Problems;


import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name :  ");
        String name = sc.next();
        String regex = "[A-Z][\\w]{3,}$";
        System.out.println(name.matches(regex));

        Predicate<String> p = i -> Boolean.parseBoolean(("[A-Z][\\w]{3,}$"));
        System.out.println(p.test(String.valueOf("Sharad")));



        System.out.println("Enter Last Name : ");
        String name1 = sc.next();
        String regex1 = "[A-Z][\\w]{3,}$";
        System.out.println(name1.matches(regex1));

        System.out.println("Enter Valid Email-Id : ");
        String emailId = sc.next();
        String regexEmail = "[a-z]+[.&+/A-za-z0-9]+[@][a-z]+[./a-z]{2,4}[./a-z]{0,4}";
        System.out.println(emailId.matches(regexEmail));

        System.out.println("Enter Valid Mobile Number : ");
        String mobileNumber = sc.next();
        String regexMobileNumber = "(91/0)?[ ][6-9][0-9]{9}";
        System.out.println("91 7387232500".matches(regexMobileNumber));

        System.out.println("Enter Password : ");
        String password = sc.next();
        String regexPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*()[{}]:;'?~+=<>]).{8,20}$";
        System.out.println(password.matches(regexPassword));
    }
}