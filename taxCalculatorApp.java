package com.internshala;
import java.util.Scanner;

public class taxCalculatorApp {

    public static void calculateTax(String name , long income){
            if(income>=300000){
                System.out.println(name +" :Rs "+income*0.2);
            }
            else if(income>=100000 && income<300000){
                System.out.println(name+" : Rs "+income*0.1);
            }
            else{
                System.out.println(name+" : Rs "+0);
            }
    }
    public static void main(String[] args) {
        int person;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total person count: ");//reading the number of elements from the that we want to enter
        person=sc.nextInt();
        String[] name = new String[person];
        long[] income = new long[person];
        int a=1;
            for(int i=0; i<person; i++){
                System.out.println("Enter name " + a);
                a++;
                name[i]=sc.next();
                System.out.println("Enter " + name[i] + "'s income ");
                income[i]=sc.nextLong();
        }
            for(int k=0; k<name.length;k++){
                calculateTax(name[k],income[k]);
            }

    }
}
