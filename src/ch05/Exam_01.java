package ch05;

public class Exam_01 {

	public static void main(String[] args) {
	
		int var1 = 10;
		int var2 = 10;
		System.out.println(var1 == var2);
		// 값 비교
		
		String var3 = "자바";
		String var4 = "자바";
		System.out.println(var3 == var4);
		//번지 비교
		
		String var5 = new String("자바");
		String var6 = new String("자바");
		System.out.println(var5 == var6);
		System.out.println(var5.equals(var6));
	}

}
