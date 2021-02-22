package ReportTest;
import java.util.*;
public class MyTeamProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 100;
		String[][] boardArray = new String[max][5];	//boardArray[][] 5개의의 1차원 배열이 존재하는데, 1차원 배열 각각의 인덱스 마다 5개의 인덱스를 갖고 있는 2차원 배열을 참조하고 있음.
		int numCount = 0;							//생설 할 때 마다 번호 값을 줘야 하기 때문에 전역 변수로 선언. 하나씩 생길 때 마다 누적되게 나타내야 하기 때문에 전역으로 선언해야 프로그램이 실행되는 상황에서 0으로 초기화 안 됨.

		int i, j, k;

		while(true) {



			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성 (Create) | 3. 읽기 (Read) | 4. 수정 (Update) | 5.삭제 (Delete) | 6.종료 ");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.print("메뉴 선택 : ");

			String selectNumber = input.nextLine();			//메뉴 선택에 들어갈 String 데이터
			int selecNum1 = Integer.parseInt(selectNumber); 

			if(selecNum1 == 1) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("번호   제목      내용         글쓴이      조회수");
				System.out.println("--------------------------------------------------------------------------------------------");



				for(i = 0; i < boardArray.length; i++) {	// boardArray 1차원 배열을 읽음.
					if(boardArray[i][0] == null) {			//1차원 배열이 갖고 있는 2차원 배열의 첫번째 인덱스에 값이 없을 경우 다음 반복 순서로 넘어감.
						continue;	
					}else {									//1차원 배열이 갖고 있는 2차원 배열의 첫번째 인덱스에 값이 존재 할 경우 리스트들을 출력! (생성된 리스트 출력)
						System.out.print(boardArray[i][0]+"\t");
						System.out.print(boardArray[i][1]+"\t");
						System.out.print(boardArray[i][2]+"\t");
						System.out.print(boardArray[i][3]+"\t");
						System.out.print(boardArray[i][4]+"\t");
					}

					System.out.println();					//다음 리스트가 있을 경우 개행시켜서 출력

				}


			}





			else if(selecNum1 == 2) {


				String tempTitle;	// 제목,내용, 글쓴이 입력을 받음 String 형 임시 변수
				String tempContent; 
				String tempWriter;


				// 임시저장소에 저장
				System.out.print("제목> ");
				tempTitle = input.nextLine();

				System.out.print("내용> ");
				tempContent= input.nextLine();

				System.out.print("글쓴이> ");
				tempWriter= input.nextLine();

				for( i = 0; i < boardArray.length; i++) {// boardArray 1차원 배열을 앍음

					if(boardArray[i][0] == null) {		//boardArray 1차원 배욜 안의 0 인덱스에 null값일 경우 그 2차원 배열 인덱스들에 순서대로 값을 입력
						boardArray[i][0] = String.valueOf(++numCount);	// 0 인덱스에는 번호 값이 들어감. 전역변수로 선언 했던 numCount를 전위연산자로 1 증가시키고 저장
						boardArray[i][1] = tempTitle;					// 1 인덱스에는 tempTitle에 제목을 입력 받은 값을 저장함
						boardArray[i][2] = tempContent;					// 2 , 3 동일
						boardArray[i][3] = tempWriter;
						boardArray[i][4] = ""+ 0 ;						// 4 인덱스에는 조회수의 초기 값인 0을 입력, 배열이 String형이기 때문에 ""+를 붙여줘야 문자열로 대입 됨.
						break;											// 입력이 완료되면 for문을 빠져나감, 그렇지 않으면 생성을 입력하라는 반복문이 계속 실행 됨.
					}

				}
				System.out.println();		//개행
			}






			else if(selecNum1 == 3) { 

				String nuum;
				System.out.println("번호 > ");
				nuum = input.nextLine();			//저장된 리스트 중 입력한 번호와 같은 번호의 리스트를 출력하기 위한 입력문

				for(int l = 0; l < boardArray.length; l++) {	//boardArray 1차원 배열을 읽음
					if(boardArray[l][0].equals(nuum)) {			//boardArray 1차원 배열을 읽는 중에 참조하는 2차원 배열의 0 인덱스와 입력한 번호와 같은 값일 경우 (값이 같은지는 .equals를 사용)

						int a = Integer.parseInt(boardArray[l][4]);	// 기존에 저장되 있던 조회수를 정수로 형변환 시킴.  
						a++;										//조회수 1 증가
						String b = String.valueOf(a);				//다시 조회수를 String화 시킴
						boardArray[l][4] = b;						//조회수를 담는 boardArray[l][4]에 저장


						System.out.println("제목 : "+ boardArray[l][1]);		//입력한 번호와 boardArray[l][0] 의 값이 같은 리스트들을 출력
						System.out.println("내용 : "+ boardArray[l][2]);
						System.out.println("글쓴이 : "+ boardArray[l][3]);
						System.out.println("조회수 : "+ boardArray[l][4]);

						break;												//번호는 고유하기 때문에 번호에 맞는 인덱스를 찾은 후 그 리스트를 출력하고 break로 멈춰야 함 
						//  그러지 않으면 for문으로 생성되지 않은 null 값의 인덱스들을 참조하려 해서 NullPointerException 발생
					}
				}

			}






			else if(selecNum1 == 4) {									
				String nuumm;												//원하는 리스트를 찾기위한 번호를 입력 할 변수
				System.out.println("번호 > ");
				nuumm = input.nextLine();

				String enter1;												//입력 값을 주지 않고 엔터치고 넘어 갈때 원래 값을 그대로 보존하기 위해 만든 임시 변수
				String enter2;


				for(int l = 0; l < boardArray.length; l++) {	//
					if(boardArray[l][0].equals(nuumm)) {					//boardArray 1차원 배열을 읽는 중에 참조하는 2차원 배열의 0 인덱스와 입력한 번호와 같은 값일 경우 (값이 같은지는 .equals를 사용)
						System.out.println("기존 제목 : "+ boardArray[l][1]);	//번호와 같은 리스트의 제목 인덱스를 출력 
						System.out.print("수정 제목 : ");

						enter1 = input.nextLine();					//enter1 임시 변수에 새로운 제목을 입력.
						if(!enter1.equals("")) {					//공백(enter)이 아닌 경우에만 (공백일 경우 그냥 넘어감)
																
							boardArray[l][1] = enter1;				//새로운 제목을 제목 인덱스에 저장. 
						}

						System.out.println("기존 내용 : "+ boardArray[l][2]); //번호와 같은 리스트의 내용 인덱스를 출력 
						System.out.print("수정 제목 : ");
						
						
						enter2 = input.nextLine();				//enter2 임시 변수에 새로운 내용을 입력.

						if(!enter2.equals("")) {					//만약 엔터(공백)을 칠 경우 
															//원래 있는 값 그대로 출력
															//값이 존재2 할 경우 내용 인덱스에 저장.
							boardArray[l][2] = enter2;
						}



						break;														//번호는 고유하기 때문에 번호에 맞는 인덱스를 찾은 후 그 리스트를 출력하고 break로 멈춰야 함 
						//  그러지 않으면 for문으로 생성되지 않은 null 값의 인덱스들을 참조하려 해서 NullPointerException 발생
					}

				}

				System.out.println("--------------------------------------------------------------------------------------------");	// 리스트를 출력
				System.out.println("번호   제목      내용         글쓴이      조회수");
				System.out.println("--------------------------------------------------------------------------------------------");

				for(int l = 0; l < boardArray.length; l++ ) {
					if(boardArray[l][0] == null) {	
						continue;	
					}else {

						System.out.print(boardArray[l][0]+"\t");
						System.out.print(boardArray[l][1]+"\t");
						System.out.print(boardArray[l][2]+"\t");
						System.out.print(boardArray[l][3]+"\t");
						System.out.print(boardArray[l][4]+"\t");
					}


					System.out.println();

				}

			}




			else if(selecNum1 == 5) {
				String nn;							//번호를 저장 할 임시변수 각 메뉴 별 그 해당되는 메뉴만 실행 시에는 지역변수로 설정, 완료되면 다시 초기화

				System.out.println("번호 > ");			
				nn = input.nextLine();

				for(int l = 0; l < boardArray.length; l++) {	
					if(boardArray[l][0].equals(nn)) {		//번호와 같은 boardArray[l][0]를 찾으면 해당 리스트에 null로 채움
						boardArray[l][0] = null;
						boardArray[l][1] = null;
						boardArray[l][2] = null;
						boardArray[l][3] = null;
						boardArray[l][4] = null;

						break;								//안 걸어줄시 NullPointer 발생




					}
				}

				System.out.println("--------------------------------------------------------------------------------------------");	// 출력
				System.out.println("번호   제목      내용         글쓴이      조회수");
				System.out.println("--------------------------------------------------------------------------------------------");

				for(int l = 0; l < boardArray.length; l++ ) {
					if(boardArray[l][0] == null) {	
						continue;	
					}else {

						System.out.print(boardArray[l][0]+"\t");
						System.out.print(boardArray[l][1]+"\t");
						System.out.print(boardArray[l][2]+"\t");
						System.out.print(boardArray[l][3]+"\t");
						System.out.print(boardArray[l][4]+"\t");
					}


					System.out.println();

				}

			}


			else {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}
