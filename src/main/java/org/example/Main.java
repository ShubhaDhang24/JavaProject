package org.example;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String myName= "Shubha" ;
        System.out.println("THIS IS FIRST TASK");
        System.out.println("My name : "+myName);
        String  myFirstName="\"Shubha\" ";
        String myLastName="\" Dhang \" ";
        System.out.println("THIS IS SECOND TASK ");
        System.out.println("My full name is:"+myFirstName  +myLastName);
        double decimal1= 45.67d;
        double decimal2= 10.58d;
        double result = decimal1 + decimal2;
        System.out.println("This is third task");
        System.out.println("Result :" +result);
        Car car1=new Car();
        car1.getInformation();
        //Score s1= new Score();
        //s1.getScore();
        int myScore= 65;
        if(myScore>65)
        {
            System.out.println("YOU ARE ALMOST THERE");
        } else if (myScore>55 && myScore< 64) {
            System.out.println("Hurray you did it");
        }
        else
            System.out.println("Sorry you have not passed");
        }

    }
