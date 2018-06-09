package Basics;

public class minMaxAveOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Sequence = {5, -5, 3};
		System.out.println("Maximum value in the array is: " + maxInArray(Sequence));
		System.out.println("Average value in the array is: "+averageInArray(Sequence));
		minInArr(Sequence);
	}
	static void minInArr(int[] Sequence){
			int min = Sequence[0];
			for (int i = 0; i < Sequence.length; i++) {
				if (min > Sequence[i]) {
					min = Sequence[i];
				}
			}
			System.out.println("Minimum value in array is: " + min);


			}

		static int maxInArray ( int[] Sequence){
			int max = Sequence[0];
			for (int j = 0; j < Sequence.length; j++) {
				if (max < Sequence[j]) {
					max = Sequence[j];
				}
			}
			return max;
		}

		static int averageInArray ( int[] Sequence){
			int sum = 0;
			int ave = 0;
			for (int n = 0; n < Sequence.length; n++) {

				sum = sum + Sequence[n];
				ave = sum / Sequence.length;
			}
			return ave;


		}
	}

