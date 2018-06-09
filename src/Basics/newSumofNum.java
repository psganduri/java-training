package Basics;

public class newSumofNum {
    public static void main(String[] args) {
        System.out.println("Result"+newSumofNum(5));


    }
    public static int newSumofNum(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else return (n+ (newSumofNum(n-1)));

    }
}
