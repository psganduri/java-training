package algorithms;

public class Demo {
    public static void main(String[] args) {
    	
    	int []numbers = {1, 5, 9, 6, 8,30,4,60,2};
    	int []sortedNumbers = {3,5,7,9,11,20,23,26,30,35,46,59,83,84,86,88,90,96,97,98,99,1030};
        Search ls = new Search();
        //    call the linear search method
        int pos = ls.LinearSearch(numbers,8);
        System.out.println("Number in search is in pos: "+pos + " of the array");
        
        
//        Call Binary search method
        System.out.println("Target number is in Pos no "+ls.binarySearch(sortedNumbers,59,0,sortedNumbers.length));
        
//        Call bubble sort
        sort sort = new sort();
        sort.bubbleSort(numbers);
        
    }






}


