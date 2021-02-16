package ch02;

public class Exam_03 {

	public static void main(String[] args) {
		// 연산 시 자동 형변환
		//int 타입 이하의 피연산자의 연산은 결과도 int!
		
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2; // byte로 두면 오류 뜸
		//byte var4 = (byte)(var1 + var2); 이렇게 하면 오류는 안 뜨지만 옳지 않음
		
		
		int var4 = 10;
		long var5 = 20;
		long var6 = var4 + var5; // int로 하면 오류. long보다 작기 때문
		
		int var7 = 10;
		double var8 = 1.5;
		double var9 = var7 + var8;
		
		
	}

}
