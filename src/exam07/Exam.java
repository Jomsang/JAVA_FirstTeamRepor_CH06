package exam07;

public class Exam {

	public static void main(String[] args) {
		BoardService s1 = new BoardService();
		
		int a = s1.getNewBnum();
		System.out.println(a);
		
		s1.save("����1", "����1");
		s1.save("����2", "����2");
		
		int [] b = {3,5};
		int sum = s1.getSum(b);
		
		int sum1 = s1.getSum(new int[] {3,4,6,7});
		
		int sum2 = s1.getSum2(1, 2, 3);
		int sum3 = s1.getSum2(1, 2, 3, 4, 5);// ���� ���� �����ϰ� ���� 
		
	}

}
