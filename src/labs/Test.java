package labs;

public class Test {
    public static void main(String[] args) {
        System.out.println("entered main");
        Addition checkaddmethod = new Addition();
        checkaddmethod.addingNumbers(5, 5);
    }
}
 class Addition{

    public void addingNumbers(int i, int i1) {
        int sum = (i+i1);
        System.out.println(sum);
    }
}


