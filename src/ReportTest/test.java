package ReportTest;
import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][] boardArray = new String[100][5];

		int CreateIndex = 0;
		int Count = 0;
		int InitNumberCount = 0;
		int ViewCount = 0;




		while(true) {
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성 (Create) | 3. 읽기 (Read) | 4. 수정 (Update) | 5.삭제 (Delete) | 6.종료 ");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.print("메뉴 선택 : ");

			int SelctNumber = input.nextInt();

			if(SelctNumber == 1) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("번호   제목      내용         글쓴이      조회수");
				System.out.println("--------------------------------------------------------------------------------------------");
				String tmp;
				for(int i = 0; i < boardArray.length; i++) {
					for(int j = 0; j < boardArray[i].length; j++) {
						if(boardArray[i][j] == null){
							continue;
						}
						System.out.print(boardArray[i][j]+"       ");


					}
					System.out.println();

				}


				//--------------------------------------------------------------------------------------------------------------------------------------------------



			}
			else if(SelctNumber == 2) {
				InitNumberCount++;


				for(int i = 0; i < boardArray[CreateIndex].length; i++) {
					if(i == 0) {
						boardArray[CreateIndex][0] = Integer.toString(InitNumberCount);
						continue;
					}
					else if(i == 1 || i == 2 || i == 3) {
						boardArray[CreateIndex][i] = input.next();
					}

					else if(i == 4) {
						boardArray[CreateIndex][4] = Integer.toString(Count);
						continue;
					}
				}

				for(int i = 0; i < boardArray.length; i++) {
					for(int j = 0; j < boardArray[i].length; j++) {
						if(boardArray[i][j] == null){
							continue;
						}
						System.out.print(boardArray[i][j]+"       ");


					}
					System.out.println();

				}

				CreateIndex++;
			}


			//--------------------------------------------------------------------------------------------------------------------------------------------------


			else if(SelctNumber == 3) {
				int CCC = 0;
				System.out.print("번호를 입력하시오.");
				int ViewPointIndex = 0;
				int ViewPointIndex2 = 0;
				int num = input.nextInt();
				Count++;
				int i;
				int j;



				for(i = 0; i < boardArray.length; i++) {
					for(j = 0; j <  boardArray[i].length; j++) {
						if(boardArray[j].equals(num)) {
							boardArray[j][4] = Integer.toString(Count);
						}

					}
					System.out.println(boardArray[i][j]);

				}

			}


			//--------------------------------------------------------------------------------------------------------------------------------------------------


			else if(SelctNumber == 4) {

			}
			else if(SelctNumber == 5) {

			}
			else {
				System.out.println("프로그램 종료");
				break;
			}
		}


	}

}
