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
		System.out.println(title+"저장이 됬습니다");
		System.out.println(content+"저장이 됬습니다");
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
