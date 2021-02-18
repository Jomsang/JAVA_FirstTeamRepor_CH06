package ch05;

public class Exam_11 {

	public static void main(String[] args) {
		Season NowSeason = Season.WINTER;
		
		if(NowSeason == Season.SUMMER) {
			System.out.println("네");
		}
		else {
			System.out.println("아입니다.");
		}

		System.out.println(NowSeason);
		//-----------------------------
		
		Login_Result Access = Login_Result.SUCCESS;
		
		if(Access == Login_Result.FAIRURE_ID) {
			System.out.println("ID가 잘못 입력되었습니다.");
		}
		else if(Access == Login_Result.FAIRURE_PASSWORD) {
			System.out.println("PASSWORD가 잘못 입력되었습니다.");
		}
		else {
			System.out.println("로그인 되었습니다.");
		}

	}

}
