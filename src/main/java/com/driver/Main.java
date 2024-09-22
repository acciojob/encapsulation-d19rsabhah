package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Rishav";
//        C:\document\Acciojob_Backend\Spring_September\encapsulation-d19rsabhah\src\main\java\com\driver\Main.java:6:12
//        java: name has private access in com.driver.RWOnly
        obj.setName("Rishav das");
        System.out.println("Name: " + obj.getName());
    }
}g