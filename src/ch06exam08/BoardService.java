package ch06exam08;

public class BoardService {
	//Field
	int count = 0;
	String[][] boards;

	//Constructor
	BoardService(int rows, int columns){
		boards = new String[rows][columns];
	}

	int getNewBno() {
		return ++count;
	}

	//Method
	void Registered(String title, String content, String writer, int viewCount) {

		String[] board = {
				String.valueOf(getNewBno()),
				title,
				content,
				writer,
				String.valueOf(viewCount)
		};

		for(int i=0; i<boards.length; i++) {
			if(boards[i][0] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	void showList() {
		for(int i=0; i<boards.length; i++) {
			if(boards[i] == null) {
				break;
			}
			for(int j=0; j<5; j++) {
				System.out.print(boards[i][j]+", ");
			}
			System.out.println();
		}

	}

	String[] read(int bno) {
		String strBno = String.valueOf(bno);
		String[] result = null;

		for(int i=0; i<boards.length; i++) {
			if(boards[i][0] != null) {
				if(boards[i][0].equals(strBno)) {
					result = boards[i];
					break;
				}
			}
		}

		return result;


	}
}
