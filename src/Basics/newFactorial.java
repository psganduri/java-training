package Basics;

public class newFactorial {
    public static void main (String[] args){
        System.out.println("Factorial is" +newFactorial(5));
    }

    public static int newFactorial (int n){
        if (n == 0){
            return 1;
        }
        else if (n==1){
            return 1;
        }
        else return (n*newFactorial(n-1));

    }
}
