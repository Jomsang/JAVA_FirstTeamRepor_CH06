package ch04;

public class Exam_05 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		for (; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}

		// System.out.println(sum + i);

		boolean stop = true;
		int count = 0;
		do {
			System.out.println("HHII");
			count++;
			if (count > 10) {
				stop = false;
			}

		}while(stop);
		
		//---------------------------------------
		count = 0;
		while(count < 10) {
			System.out.println("zz");
			count++;
		}
	}

}
