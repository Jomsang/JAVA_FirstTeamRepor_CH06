package ch02;

public class Exam_04 {

	public static void main(String[] args) {
		// 문자열 -> 숫자(정수, 실수)
		// 문자열은 String 타입 변수에 저장한다.
		String var1 = "10";
		System.out.println(var1);

		// 문자 + 숫자가 되면 문자로 결합됨.
		String var2 = var1 + 5;
		System.out.println(var2);

		// 문자열 -> 정수
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println(var3);

		// 문자열 -> 실수
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println(var5);

		// 숫자 -> 문자열
		int var6 = 3;
		String var7 = "" + var6;
		String var8 = String.valueOf(var6);
		System.out.println(var6);
		
	}

}
