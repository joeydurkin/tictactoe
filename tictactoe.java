import java.util.Scanner;
/**
 * The main
 *
 * @author Joey Durkin
 * @version 2018
 */
public class tictactoe
{
    public static void main(String[] args){
        int cont = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your name:");
        String playerName = scnr.nextLine();
        System.out.println("Enter the computer's name:");
        String computerName = scnr.nextLine();
        String[] trashTalk = new String[5];
        System.out.println("Give me your best taunt (5 more):");
        trashTalk[0] = scnr.nextLine();
        System.out.println("Give me your next best taunt (4 more):");
        trashTalk[1] = scnr.nextLine();
        System.out.println("Give me your next best taunt (3 more):");
        trashTalk[2] = scnr.nextLine();
        System.out.println("Give me your next best taunt (2 more):");
        trashTalk[3] = scnr.nextLine();
        System.out.println("Give me your next best taunt (1 more):");
        trashTalk[4] = scnr.nextLine();
        player user = new player(playerName);
        computer comp = new computer(computerName, trashTalk);
        System.out.println("So " + user.getName() + ", you think you can take me, " + comp.getName() + ", on?");
        System.out.println("I'm gonna wipe the floor with you AND use your trash talk while doing so!");
        while(cont == 0){ //allows for faster replay
            int turns = 0; //used at the end of the while loop
            int[][] board = {
                {0,0,0},
                {0,0,0},
                {1,0,0}
            }; //initializes board with computer's first move
            printBoard(board);
            //following disgusting while loop will operate as long as there is at least 1 space marked 0
            while(board[0][0] == 0 || board[0][1] == 0 || board[0][2] == 0 || board[1][0] == 0 
            || board[1][1] == 0 || board[1][2] == 0 || board[2][0] == 0 || board[2][1] == 0 
            || board[2][2] == 0){
                player.play(board); //user takes turn
                computer.play(board, turns); //computer takes turn
                printBoard(board); //the board is displayed
                System.out.println(computer.taunt(trashTalk));
                turns++; //turn counter for computer
            }
            System.out.println("Game over!\nYou didn't win because I, " + comp.getName() + ", am clearly better than you.");
            System.out.println("Would you like to play again? Enter 'y' or 'n'");
            String ans = scnr.next();
            if(ans.equalsIgnoreCase("n")){
                cont++;
            }
        }
    }

    public static void printBoard(int[][] b){
        System.out.println("|–––|–––|–––|");
        for(int i = 0; i<3; i++){
            if(b[0][i] == 0 || b[0][i] == -1){ //the -1 is a tag used by the computer player to end the game, still want to print empty spaces
                System.out.print("|   ");
            }else if(b[0][i] == 1){
                System.out.print("| X ");
            }else if(b[0][i] == 2){
                System.out.print("| O ");
            }
            if(i == 2){
                System.out.print("|\n");
            }
        }
        System.out.println("|–––|–––|–––|");
        for(int i = 0; i<3; i++){
            if(b[1][i] == 0 || b[1][i] == -1){
                System.out.print("|   ");
            }else if(b[1][i] == 1){
                System.out.print("| X ");
            }else if(b[1][i] == 2){
                System.out.print("| O ");
            }
            if(i == 2){
                System.out.print("|\n");
            }
        }
        System.out.println("|–––|–––|–––|");
        for(int i = 0; i<3; i++){
            if(b[2][i] == 0 || b[2][i] == -1){
                System.out.print("|   ");
            }else if(b[2][i] == 1){
                System.out.print("| X ");
            }else if(b[2][i] == 2){
                System.out.print("| O ");
            }
            if(i == 2){
                System.out.print("|\n");
            }
        }
        System.out.println("|–––|–––|–––|");
    }
}

