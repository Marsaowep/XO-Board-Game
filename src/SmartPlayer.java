
public class SmartPlayer extends BlockingPlayer{

	public SmartPlayer(String name, char mark) {
		super(name, mark);
	}

	public void makeMove() {
		int i;
		int j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(testForWinning(i,j)) {
					board.addMark(i,j,mark);
					return;
				}
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(testForBlocking(i,j)) {
					board.addMark(i, j, mark);
					return;
				}
			}
		}
		RandomGenerator ran=new RandomGenerator();
		do {
			i=ran.discrete(0,2);
		    j=ran.discrete(0,2);
		}while(board.getMark(i, j)!=SPACE_CHAR);
		board.addMark(i, j, mark);
		
	}

	private boolean testForWinning(int row, int col) {
		if(board.getMark(row, col)==SPACE_CHAR) {
			int c=0;
		    for(int m=0;m<3;m++) {
		    	if(board.getMark(row,m)==mark) {
		    		c++;
		    		if(c==2) {
		    			return true;
		    		}
		    	}
		    }
		    c=0;
		    for(int n=0;n<3;n++) {
		    	if(board.getMark(n, col)==mark) {
		    		c++;
		    		if(c==2) {
		    			return true;
		    		}
		    	}
		    }
		    if(col==row) {
		    	c=0;
		    	for(int i=0;i<3;i++) {
		    		if(board.getMark(i, i)==mark) {
		    			c++;
		    			if(c==2) {
		    				return true;
		    			}
		    		}
		    	}
		    }
		    if((row==2&&col==0)||(row==0&&col==2)){
		    	c=0;
		    	for(int m=0,n=2;m<3;m++,n--) {
		    		if(board.getMark(m,n)==mark) {
		    			c++;
		    			if(c==2) {
		    				return true;
		    			}
		    		}
		    	}
		    }
		}
		return false;
		
	}
	

}
