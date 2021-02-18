package ch05_HomeWork;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//복사 할 배열, 복사 할 시작 인덱스, 복사 받는 배열, 복사 받을 시작 인덱스, 복사 할 배열 길이 설정
		for(int i = 0; i< newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}


	}

}
