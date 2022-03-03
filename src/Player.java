import java.util.Scanner;

/**
 * Provides data fields and methods to create a Java data-type, representing a
 * player in Java application.
 * @author Zirui Li
 * @version 1.0
 * @since February. 5th
 */
abstract class Player implements Constants{
   /**
    * The name of the player
    */
   protected String name;
   /**
    * The board of the game
    */
   protected Board board;
   /**
    * The opponent of the player
    */
   protected Player opponent;
   /**
    * The character the player used for mark
    */
   protected char mark;
   abstract void makeMove();
   abstract void play();
   
   /** 
    * Construct a Player Object with the specified values for name and mark. The values of the data fields are supplied by the given parameter.
    * @param name the Player's object name
    * @param mark the Player's object mark
    */
   public Player(String name,char mark) {
		this.name = name;
		this.mark = mark;
	}
   
   /**
    * Check whether the game is over 
    * @return true or false to indicate whether the game is over
    */
   public boolean check() {
	   if(board.xWins()==true) {
		   if(mark=='X') {
		       System.out.println("THE GAME IS OVER: The winner is "+name);
		   }
		   else {
			   System.out.println("THE GAME IS OVER: The winner is "+opponent.name);
		   }
		   return true;
	   }
	   if(board.oWins()==true) {
		   if(mark=='O') {
		       System.out.println("THE GAME IS OVER: "+name+" is the winner!");
		   }
		   else {
			   System.out.println("THE GAME IS OVER: "+opponent.name+" is the winner!");
		   }
		   return true;
	   }
	   
	   if(board.isFull()==true) {
		   System.out.println("THE GAME IS OVER: It is a tie.");
		   return true;
	   }
	   return false;
   }
   
   public Board getBoard() {
	   return board;
   }
   
   public char getMark() {
	   return mark;
   }
   /**
    * Set a specified value to opponent 
    * @param opponent the Player that is the opponent to this one
    */
   public void setOpponent(Player opponent) {
	   this.opponent=opponent;
   }
   
   /**
    * Set a specified value to board
    * @param theBoard the specified board input
    */
   public void setBoard(Board theBoard) {
	   this.board=theBoard;
   }
}
