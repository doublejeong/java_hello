

public class Gugudan {

	public static void main(String[] args) {

		
//		3단 구구단 for 문
		int dan = 3;
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println(dan + " * " + i + " = " + i * dan);
			
		}

//		7단 구구단 for 문
		dan = 7;
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println(dan + " * " + i + " = " + i * dan);
			
		}
		

		
//		구구단
		
		for (int i = 2; i <= 9; i++) {			// 2단부터 9단까지 진행 위한 바깥쪽 for문
			for (int j = 1; j <= 9; j++) {		// 1부터 9까지의 곱을 위한 안쪽 for문
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
//		짝수단 만 출력 하시오
		
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + (i * j));
				}
				System.out.println();
			}
		}
		
		
		
	}
	
}
