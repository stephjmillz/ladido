package com.zipcodewilmington;

public class Main {
    public static void main(String[] args) {

        Person per1 = new Person("Yeyo", "Guy");
        Person per2 = new Person("Ronald", "Bro");
        Person per3 = new Person("Fogell", "Mclovin");


        Person[] balls = {per1, per2, per3,};


        PersonHandler nikko = new PersonHandler(balls);
        System.out.println(nikko.whileLoop());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(nikko.forLoop());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(nikko.forEachLoop());



    }
}
