package Basics;


public class Helloword3 {
    public static void main (String [] args){
        System.out.println("Hello World again!");

        NumCalc1.sum(5,10);
       System.out.println("Product of " + 5 + " * "+ 10 + " = " +NumCalc1.product(5,10));
       NumCalc1 nc = new NumCalc1();
       nc.sum(5,15);
testMethod  ();

    }
    public static  void testMethod (){
        System.out.println("Test");
    }

}
