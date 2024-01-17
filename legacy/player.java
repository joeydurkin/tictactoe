import java.util.Scanner;

/**
 * Player class represents the user.
 *
 * @author Joey Durkin
 * @version 2018
 */
public class player{
    private String name;
    /**
     * Constructor for objects of class player
     */
    public player(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    /**
     * Takes input of user, considers state of board, updates board with move
     *
     * @param  b  the board
     * @return  updated board
     */
    public static int[][] play(int[][] b){
        int row = 0;
        int column = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input your move's row number from 0 to 2:");
        row = input.nextInt();
        System.out.println("Input your move's column number from 0 to 2:");
        column = input.nextInt();
        
        if(b[row][column] != 0){ //checks to see if space is free
            System.out.println("That space is already taken. You know kids can play this game, right?\nUgh, I'll let you try again.");
            player.play(b); //lets user try a new input if the space is taken
            return b;
        }else{
            b[row][column] = 2; //places move on correct spot on board
            return b;
        }
    }
}
