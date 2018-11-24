package algorithms;

public class sort {
	public void bubbleSort (int [] dataset) {
		Boolean swapped =false;
		do {
		for(int i=0; i<dataset.length-1;i++) {
			if(dataset[i]>dataset[i+1]) {
				int temp = dataset[i];
				dataset[i]=dataset[i+1];
				dataset[i+1]=temp;
				printArr(dataset);
				swapped=true;
			}
		}
		
	}while (swapped);
	}
	private void printArr(int[] arr) {
		System.out.println("Swap");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
