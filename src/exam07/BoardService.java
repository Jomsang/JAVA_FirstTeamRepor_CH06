package exam07;

public class BoardService {
	//Field
	int count;
	//Constructor
	
	//Method
	int getNewBnum() {
		return ++count;
	}
	
	void save(String title, String content){
		System.out.println(title+"������ ����ϴ�");
		System.out.println(content+"������ ����ϴ�");
	}
	
	int getSum(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	int getSum2(int ... valuees) {
		int result = 0;
		for(int value : valuees) {
			result += value;
		}
		return result;
	}
	
}
