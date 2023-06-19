

public class Practice {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		do {
			sum = sum + num;
			num++;
		} while (num <= 10);
		
		System.out.println(sum);
		
		
//		for문
		sum = 0;
		
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
//		1부터 100까지의 합
		
		sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
//		1부터 100까지 중 짝수의 합
		
		sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;				
			} else {				
			
			}
			
		}
		System.out.println(sum);
		
//		1~100까지 홀수의 합 구하기
		
		sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				
			} else {				
				sum = sum + i;								
			}
			
		}
		System.out.println(sum);
		
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
		
//		1부터 1000까지의 수중에
//		11의 배수이자 7의 배수인 첫번째 숫자
		
		for (int i = 1; i <= 1000; i++) {
			if ((i % 7 == 0) && (i % 11 == 0)) {
				System.out.println(i);
				break;
			}
		}
		
//		처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
		
		num = 1;
		boolean search = false;
		
		while (num <= 100) {
			if ((num % 5 == 0) &&(num % 7 == 0) ) {
				search = true;
				break;			//while문을 탈출
			} else {
				num++;
			}
		}
		if (search == true) {
			System.out.println("찾는 정수 : " + num);
		} else {
			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
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
		
//		구구단 결과 값이 홀수인 것만 출력
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((i * j) % 2 == 1) {
					
					System.out.println(i + " X " + j + " = " + (i * j));
				}
			}
			System.out.println();
		}
		
		
	}
	
}
