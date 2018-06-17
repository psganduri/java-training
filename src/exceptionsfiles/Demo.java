package exceptionsfiles;

public class Demo {
    public static void main (String[] args){
        division(5,0);
//        System.out.println(calldivision(5,0));

    }
    public static void division (int c, int d ){
        calldivision(c,d);
    }
    public static int calldivision (int x, int y){
        int z = x/y;
        System.out.println("entered calldivision");
    return z;


    }
}
