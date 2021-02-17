package ch04;

public class Exam_06 {

	public static void main(String[] args) {
		int count = 0;
		boolean stop = false;
		while(!stop) {
			count++;
			System.out.println(count);
			if(count >= 10) {
				break;
			}
		}
		System.out.println("End");
	}

}
