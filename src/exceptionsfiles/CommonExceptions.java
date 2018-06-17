package exceptionsfiles;

public class CommonExceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        1.Identify where the possible exception is
//        2. Add Try and catch
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("CAN NOT BE DIVIDED BY ZERO");
            System.out.println(e.toString());
        }
        System.out.println("Program continues");

        String [] states = {"VIC","NSW","QL","NT","SA","WA"};
for (int i=0;i<=states.length;i++){
    try{
    System.out.println(states[i]);
}catch (ArrayIndexOutOfBoundsException e){
        System.out.println("ERROR: index should be equal to length of Array");
        System.out.println(e.toString());
    }finally {
        System.out.println("Entered loop");
    }
    }

    }
}
