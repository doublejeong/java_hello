
public class Practice2 {

	public static void main(String[] args) {

//		구구단을 찍으세요
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
//		11의 배수 이자 7의 배수인 첫번째 숫자는?

		for (int i = 1; i < 1000; i++) {
			if (i % 11 == 0 && i % 7 == 0) {
				System.out.println(i);
				break;
			}
		}
	
//		3단을 출력하시오.
		
		for (int i = 1; i < 10; i++) {
			int dan = 3;
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	
//		1부터 100까지의 짝수의 합은?
		
		int sum = 0;
		
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);
		
		
//		1부터 100까지의 합을 구하시오.
		
		int total = 0;
		
		for (int i = 0; i <= 100; i++) {
			total = total + i;
		}
		System.out.println(total);
		
//		다음을 구현하시오.
//			12,1,2,3 겨울입니다.
//			4,5,6 봄입니다.
//			7,8 여름 입니다.
//			9,10,11 가을입니다.
		
		int month = 3;
		
		switch (month) {
		case 12:
		case 1:
		case 2:
		case 3:
			System.out.println("겨울 입니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("봄 입니다.");
			break;

		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다.");
			break;

		default:
			System.out.println("잘못 입력하였습니다.");
			break;
		}
		
//		3 수가 있다. 이중 최대값을 구하시오.
//		num1 = -6
//		num2 = 10
//		num3 = 1   
//		=======
//		최대값: 10
		
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		int max = 0;
		
		if (num1 >= num2 && num1>= num3) {
			max = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			max = num2;
		} else if (num3 >= num1 && num3 >= num2) {
			max = num3;
		}
		System.out.println(max);
	
//		짝수 단만 나오게 구구단을 찍으시오.
		
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
				System.out.println();
			}
		}
		
		
		
		
		
	}
}

