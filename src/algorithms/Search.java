package algorithms;

public class Search {
	public int LinearSearch(int[] dataset, int target) {
		for (int i = 0; i < dataset.length; i++) {
			if (dataset[i] == target) {
				target = i;
			}
		}

		return target + 1;
	}

	public int binarySearch(int[] dataset, int target, int start, int end) {
		// To find middle value
		int middle = (int) Math.floor(((start + end)/2));
		int value = dataset[middle];
		System.out.println("Midpoint is"+value);
		System.out.println(middle+" "+value);
		if (target > value) {
			System.out.println(target+">"+value);
			return binarySearch(dataset, target, middle +1, end);

		} else if (target < value) {
			System.out.println(target+"<"+value);
			return binarySearch(dataset, target, start, middle-1);

		}
		System.out.println(target+"="+value);
		return middle+1;
	}
}
