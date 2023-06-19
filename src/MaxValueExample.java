
public class MaxValueExample {

	public static void main(String[] args) {

		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		int max;
		
		if ((num1 > num2) && (num1 > num2)){
			max = num1;
		} else if ((num2 > num1) && (num2 > num3)){
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("최대값 : " + max);
	}

}
