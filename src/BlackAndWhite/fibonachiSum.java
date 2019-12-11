package BlackAndWhite;

public class fibonachiSum {
    //    fib n = n+(n-1)
//    n=1
//@Test
    public  static void main (String [] args ){
        System.out.println("fibonachi sum of given number is: "+fibinachi(5));

    }
    //    @Test
    public  static int fibinachi(int n){
        int fn;
        if (n==1) {
            fn=1;
        }
        else if (n==0) {
            fn=0;
        }
        else {
            fn = n+fibinachi(n-1);
        }

        return fn;
    }

}
