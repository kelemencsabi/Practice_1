package org.fasttrackit;

public class App {

    public static void main(String[] args){
        System.out.println(average(16,7,9));

    }
        public static double average( double a, double b, double c){
            System.out.println(a + " " + b + " " + c);
            double sum = a + b + c;
            return sum/3;
        }

}