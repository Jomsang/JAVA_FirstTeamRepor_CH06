package ReportTest;
import java.util.*;
public class MyTeamProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 100;
		String[][] boardArray = new String[max][5];	//boardArray[][] 5������ 1���� �迭�� �����ϴµ�, 1���� �迭 ������ �ε��� ���� 5���� �ε����� ���� �ִ� 2���� �迭�� �����ϰ� ����.
		int numCount = 0;							//���� �� �� ���� ��ȣ ���� ��� �ϱ� ������ ���� ������ ����. �ϳ��� ���� �� ���� �����ǰ� ��Ÿ���� �ϱ� ������ �������� �����ؾ� ���α׷��� ����Ǵ� ��Ȳ���� 0���� �ʱ�ȭ �� ��.

		int i, j, k;

		while(true) {



			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ���� (Create) | 3. �б� (Read) | 4. ���� (Update) | 5.���� (Delete) | 6.���� ");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.print("�޴� ���� : ");

			String selectNumber = input.nextLine();			//�޴� ���ÿ� �� String ������
			int selecNum1 = Integer.parseInt(selectNumber); 

			if(selecNum1 == 1) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println("��ȣ   ����      ����         �۾���      ��ȸ��");
				System.out.println("--------------------------------------------------------------------------------------------");



				for(i = 0; i < boardArray.length; i++) {	// boardArray 1���� �迭�� ����.
					if(boardArray[i][0] == null) {			//1���� �迭�� ���� �ִ� 2���� �迭�� ù��° �ε����� ���� ���� ��� ���� �ݺ� ������ �Ѿ.
						continue;	
					}else {									//1���� �迭�� ���� �ִ� 2���� �迭�� ù��° �ε����� ���� ���� �� ��� ����Ʈ���� ���! (������ ����Ʈ ���)
						System.out.print(boardArray[i][0]+"\t");
						System.out.print(boardArray[i][1]+"\t");
						System.out.print(boardArray[i][2]+"\t");
						System.out.print(boardArray[i][3]+"\t");
						System.out.print(boardArray[i][4]+"\t");
					}

					System.out.println();					//���� ����Ʈ�� ���� ��� ������Ѽ� ���

				}


			}





			else if(selecNum1 == 2) {


				String tempTitle;	// ����,����, �۾��� �Է��� ���� String �� �ӽ� ����
				String tempContent; 
				String tempWriter;


				// �ӽ�����ҿ� ����
				System.out.print("����> ");
				tempTitle = input.nextLine();

				System.out.print("����> ");
				tempContent= input.nextLine();

				System.out.print("�۾���> ");
				tempWriter= input.nextLine();

				for( i = 0; i < boardArray.length; i++) {// boardArray 1���� �迭�� ����

					if(boardArray[i][0] == null) {		//boardArray 1���� ��� ���� 0 �ε����� null���� ��� �� 2���� �迭 �ε����鿡 ������� ���� �Է�
						boardArray[i][0] = String.valueOf(++numCount);	// 0 �ε������� ��ȣ ���� ��. ���������� ���� �ߴ� numCount�� ���������ڷ� 1 ������Ű�� ����
						boardArray[i][1] = tempTitle;					// 1 �ε������� tempTitle�� ������ �Է� ���� ���� ������
						boardArray[i][2] = tempContent;					// 2 , 3 ����
						boardArray[i][3] = tempWriter;
						boardArray[i][4] = ""+ 0 ;						// 4 �ε������� ��ȸ���� �ʱ� ���� 0�� �Է�, �迭�� String���̱� ������ ""+�� �ٿ���� ���ڿ��� ���� ��.
						break;											// �Է��� �Ϸ�Ǹ� for���� ��������, �׷��� ������ ������ �Է��϶�� �ݺ����� ��� ���� ��.
					}

				}
				System.out.println();		//����
			}






			else if(selecNum1 == 3) { 

				String nuum;
				System.out.println("��ȣ > ");
				nuum = input.nextLine();			//����� ����Ʈ �� �Է��� ��ȣ�� ���� ��ȣ�� ����Ʈ�� ����ϱ� ���� �Է¹�

				for(int l = 0; l < boardArray.length; l++) {	//boardArray 1���� �迭�� ����
					if(boardArray[l][0].equals(nuum)) {			//boardArray 1���� �迭�� �д� �߿� �����ϴ� 2���� �迭�� 0 �ε����� �Է��� ��ȣ�� ���� ���� ��� (���� �������� .equals�� ���)

						int a = Integer.parseInt(boardArray[l][4]);	// ������ ����� �ִ� ��ȸ���� ������ ����ȯ ��Ŵ.  
						a++;										//��ȸ�� 1 ����
						String b = String.valueOf(a);				//�ٽ� ��ȸ���� Stringȭ ��Ŵ
						boardArray[l][4] = b;						//��ȸ���� ��� boardArray[l][4]�� ����


						System.out.println("���� : "+ boardArray[l][1]);		//�Է��� ��ȣ�� boardArray[l][0] �� ���� ���� ����Ʈ���� ���
						System.out.println("���� : "+ boardArray[l][2]);
						System.out.println("�۾��� : "+ boardArray[l][3]);
						System.out.println("��ȸ�� : "+ boardArray[l][4]);

						break;												//��ȣ�� �����ϱ� ������ ��ȣ�� �´� �ε����� ã�� �� �� ����Ʈ�� ����ϰ� break�� ����� �� 
						//  �׷��� ������ for������ �������� ���� null ���� �ε������� �����Ϸ� �ؼ� NullPointerException �߻�
					}
				}

			}






			else if(selecNum1 == 4) {									
				String nuumm;												//���ϴ� ����Ʈ�� ã������ ��ȣ�� �Է� �� ����
				System.out.println("��ȣ > ");
				nuumm = input.nextLine();

				String enter1;												//�Է� ���� ���� �ʰ� ����ġ�� �Ѿ� ���� ���� ���� �״�� �����ϱ� ���� ���� �ӽ� ����
				String enter2;


				for(int l = 0; l < boardArray.length; l++) {	//
					if(boardArray[l][0].equals(nuumm)) {					//boardArray 1���� �迭�� �д� �߿� �����ϴ� 2���� �迭�� 0 �ε����� �Է��� ��ȣ�� ���� ���� ��� (���� �������� .equals�� ���)
						System.out.println("���� ���� : "+ boardArray[l][1]);	//��ȣ�� ���� ����Ʈ�� ���� �ε����� ��� 
						System.out.print("���� ���� : ");

						enter1 = input.nextLine();					//enter1 �ӽ� ������ ���ο� ������ �Է�.
						if(!enter1.equals("")) {					//����(enter)�� �ƴ� ��쿡�� (������ ��� �׳� �Ѿ)
																
							boardArray[l][1] = enter1;				//���ο� ������ ���� �ε����� ����. 
						}

						System.out.println("���� ���� : "+ boardArray[l][2]); //��ȣ�� ���� ����Ʈ�� ���� �ε����� ��� 
						System.out.print("���� ���� : ");
						
						
						enter2 = input.nextLine();				//enter2 �ӽ� ������ ���ο� ������ �Է�.

						if(!enter2.equals("")) {					//���� ����(����)�� ĥ ��� 
															//���� �ִ� �� �״�� ���
															//���� ����2 �� ��� ���� �ε����� ����.
							boardArray[l][2] = enter2;
						}



						break;														//��ȣ�� �����ϱ� ������ ��ȣ�� �´� �ε����� ã�� �� �� ����Ʈ�� ����ϰ� break�� ����� �� 
						//  �׷��� ������ for������ �������� ���� null ���� �ε������� �����Ϸ� �ؼ� NullPointerException �߻�
					}

				}

				System.out.println("--------------------------------------------------------------------------------------------");	// ����Ʈ�� ���
				System.out.println("��ȣ   ����      ����         �۾���      ��ȸ��");
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
				String nn;							//��ȣ�� ���� �� �ӽú��� �� �޴� �� �� �ش�Ǵ� �޴��� ���� �ÿ��� ���������� ����, �Ϸ�Ǹ� �ٽ� �ʱ�ȭ

				System.out.println("��ȣ > ");			
				nn = input.nextLine();

				for(int l = 0; l < boardArray.length; l++) {	
					if(boardArray[l][0].equals(nn)) {		//��ȣ�� ���� boardArray[l][0]�� ã���� �ش� ����Ʈ�� null�� ä��
						boardArray[l][0] = null;
						boardArray[l][1] = null;
						boardArray[l][2] = null;
						boardArray[l][3] = null;
						boardArray[l][4] = null;

						break;								//�� �ɾ��ٽ� NullPointer �߻�




					}
				}

				System.out.println("--------------------------------------------------------------------------------------------");	// ���
				System.out.println("��ȣ   ����      ����         �۾���      ��ȸ��");
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
				System.out.println("���α׷� ����");
				break;
			}

		}
	}
}
