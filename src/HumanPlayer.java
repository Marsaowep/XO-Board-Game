import java.util.Scanner;

public class HumanPlayer extends Player{

	public HumanPlayer(String name, char mark) {
		super(name, mark);
	}
	
	public void play() {
		while(true) {
		    makeMove();
			board.display();
			if(check()==true) {
			    break;
			}
			opponent.makeMove();
			board.display();
			if(opponent.check()==true) {
				break;
			}
		}
	}

	public void makeMove() {
		Scanner scan=new Scanner(System.in);
		int row=0;
		int col=0;
		do {
		    System.out.println(name+",what row should your next "+mark+" be placed in?");
		    row=Integer.parseInt(scan.nextLine());
		    System.out.println(name+",what column should your next "+mark+" be placed in?");
		    col=Integer.parseInt(scan.nextLine());
		}while(board.getMark(row, col)!=SPACE_CHAR);
		board.addMark(row, col, mark);
	
	}
		
	}
