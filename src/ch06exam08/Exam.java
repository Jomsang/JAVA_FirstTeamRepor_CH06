package ch06exam08;

public class Exam {

	public static void main(String[] args) {
		BoardService bs = new BoardService(100, 5);
		bs.Registered("제목 1","내용 1","글쓴이",0);
		//bs.showList();
		
		String[] board = bs.read(2);
		for(String value : board) {
			System.out.println(value + "\t");
		}
	}

}
