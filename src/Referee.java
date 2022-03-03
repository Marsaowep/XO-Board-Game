/**
 * Provides data fields and methods to create a Java data-type, representing a
 * referee in Java application.
 * @author Zirui Li
 * @version 1.0
 * @since February. 5th
 */
public class Referee{
	/**
	 * The Player xPlayer
	 */
     private Player xPlayer;
     
     /**
      * The Player oPlayer
      */
     private Player oPlayer;
     
     /**
      * The board to play the game
      */
     private Board board;
     
     /**
      * Run the game after setting the opponents and display the board
      */
     public void runTheGame() {
    	 oPlayer.setOpponent(xPlayer);
    	 xPlayer.setOpponent(oPlayer);
    	 board.display();
    	 xPlayer.play();
     }
     
     /**
      * Set a specified board
      * @param board the specified board input
      */
     public void setBoard(Board board) {
    	 this.board=board;
     }
     
     /**
      * set a specified oPlayer
      * @param oPlayer the Player that uses 'O' mark
      */
     public void setoPlayer(Player oPlayer) {
    	 this.oPlayer=oPlayer;
     }
     
     /**
      * set a specified xPlayer
      * @param xPlayer the player that uses 'X' mark
      */
     public void setxPlayer(Player xPlayer) {
    	 this.xPlayer=xPlayer;
     }
}
