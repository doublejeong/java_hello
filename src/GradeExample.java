

public class GradeExample {

	public static void main(String[] args) {

		int kor = 90;
		int eng = 70;
		int math = 45;
		
		int total;
		double avg;
		char grade;
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("성적 : " + grade);
		
	}

}
