package org.example.Consumer;

public class Parent {
    public static String name;
    public int x;
    public Parent(){
        System.out.println("this is constructor");
    }
    static {
        System.out.println("this is static block");
    }
    {
        System.out.println("this is instance block");
    }
    public static void m1(){
        System.out.println("this is static method");
    }
    public void m2(){
        System.out.println("this is instance method");
    }

    public static void main(String[] args) {
      Parent p = new Parent();
    }
}
