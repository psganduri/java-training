package labs;

public class SurareNumbersTest {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.out.println(squareNumber(10));

		CubeofNum Cu = new CubeofNum();
		System.out.println(Cu.cubegen(5));
		
		
	}
	public static int squareNumber (int num) {
		int sqnu = num * num;
		return sqnu;
	}

	
}

 class CubeofNum {
	 public int cubegen (int num) {
		int cube = num*num*num;
		return cube;
	}
}
