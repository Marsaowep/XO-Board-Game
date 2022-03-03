
public class RandomPlayer extends Player{

	public RandomPlayer(String name, char mark) {
		super(name, mark);
	}
	
	public void makeMove() {
		RandomGenerator ran=new RandomGenerator();
		int i=0;
		int j=0;
		do {
			i=ran.discrete(0,2);
		    j=ran.discrete(0,2);
		}while(board.getMark(i, j)!=SPACE_CHAR);
		board.addMark(i, j, mark);
	}

	void play() {
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
}
