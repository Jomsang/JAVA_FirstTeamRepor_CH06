package ch05_HomeWork;

public class ArrayCopyByForExample {

	public static void main(String[] args) {	//이 방식은 추천하지 않음 X
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];

		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+", ");
		}

	}

}
