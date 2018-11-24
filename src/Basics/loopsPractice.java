package Basics;

public class loopsPractice {
    //    Define and declare array of fruits
    public static void main(String[] args) {

        String[] fruits = {"Apple", "banana", "Pear", "grapes"};
        System.out.println(fruits[1]);

//        do while
        int n=0;
        do {
            System.out.println(fruits[n]);
            n++;
        }
        while (n<=3);

//        While
        System.out.println("While loop starts");
        int i=0;
        boolean myFruit = false;
        while (!myFruit){
            if (fruits[i]=="banana"){
                System.out.println("Banana is in position "+ i);
//                myFruit = true;
            }
//            System.out.println(fruits[i]);
            i++;
        }
        System.out.println("Length of Fruits array is"+fruits.length);
        for (int j=0; j<fruits.length; j++){
            System.out.println(fruits[j]);

        }




    }
}