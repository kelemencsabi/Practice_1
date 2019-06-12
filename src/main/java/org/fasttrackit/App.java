package org.fasttrackit;

public class App {

    public static void main(String[] args){
        App app =new App();
        System.out.println(displayAverage(16,7,9));
        app.displayAverage(5,9,12);


    }
        public static  double displayAverage( double a, double b, double c){
            System.out.println(a + " " + b + " " + c);
            double sum = a + b + c;
            double average=sum/3;
            return average;
        }

}