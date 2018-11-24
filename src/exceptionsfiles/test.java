package exceptionsfiles;

import org.apache.poi.util.SystemOutLogger;

public class test {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Not divisibale by zero!!");
        }
    }
}
