package ch04_HomeWork;

public class IfNesteadExample {

	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81; // 81이상 101 미만의 랜덤 수를 int형 형변환 후 score 변수에 선언
		System.out.println("점수: " + score);

		String grade;

		if (score >= 90) { 							// score가 90이상이 나올 경우. 첫 if문(score >= 90)에 들어감.
			if (score >= 95) { 						// 안에서 95점 이상일 경우 'grade'변수에 A+ 저장
				grade = "A+";
			} else { 								// 90이상 ~ 95미만일 경우 A
				grade = "A";
			}

		} else {									//	90이상이 아닐 경우.
			if(score >= 85) {						//	85이상 ~ 90 미만일 경우 B+
				grade = "B+";
			}
			else {									// 85미만일 경우 B
				grade = "B";
			}
		}

		System.out.println("학점 : "+grade);

	}

}
