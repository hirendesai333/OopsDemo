package org.Oops2basic;

import java.util.Scanner;

/*
In this program I will try to give basic example of Inheritance
 */
class SolarSystem {
    public void print(){
        System.out.println("Solar System...");
    }
}
class Earth extends SolarSystem {
    public void weight(int a){
        print();
        System.out.println("Your weight on Earth is: "+ a+" lbs");
    }
}
class Mars extends SolarSystem {
    public void weight(int b){
        System.out.println("Your weight on Mars is: "+ b+" lbs");
    }
}

public class Moon extends Earth {
    public static void main(String args[])
    {
        //variable declaration for weight
        int weight = 0;

        //scanner class
        Scanner sc = new Scanner(System.in);
        //object init
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        //to check whether objects are instance of class or not
        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);

        s.print();
        System.out.print("Please enter your weight on Earth: ");
        weight = sc.nextInt();
        e.weight(weight);
        weight = (weight*38)/100;
        m.weight(weight);
        weight = (int) ((weight*16.5)/100);
        System.out.println("Your weight on Moon is: "+ weight+" lbs");

    }
}
