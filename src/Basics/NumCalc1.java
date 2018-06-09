package Basics;

public class NumCalc1 {
    public static void main(String[] args){
        int a=1;
        int b=2;
        sum(a,b);
        System.out.println(product(3,3));

    }

    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println("Sum of "+ a +" + " + b +" is equal to "+sum);

    }

    public static double product (int c, int d){
        double product = (c * d);
        return product;
    }

}

