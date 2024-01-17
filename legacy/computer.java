import java.util.Random;
/**
 * Algorithm that never loses tic tac toe given that it goes first on [2][0]
 *
 * @author Joey Durkin
 * @version 2018
 */
public class computer{
    private String name;
    private String[] trashTalk = new String[5];
    /**
     * Constructor for objects of class computer
     */
    public computer(String n, String[] tT){
        this.name = n;
        this.trashTalk = tT;
    }
    
    public String getName(){
        return this.name;
    }
    
    public static String taunt(String[] tT){
        Random r = new Random();
        int rand = r.nextInt(5);
        return tT[rand];
    }
    /**
     * Considers state of board, chooses optimal move, updates board with move
     *
     * @param  b  the board
     * @return  updated board
     */
    public static int[][] play(int[][] b, int t){
        if(t==0){
            if(b[0][0] == 2 || b[1][0] == 2){
                b[2][2] = 1;
                return b; //moveset 1
            }else if(b[1][2] == 2){
                b[2][2] = 1;
                return b; //moveset 2
            }else if(b[0][1] == 2 || b[0][2] == 2){
                b[0][0] = 1;
                return b; //moveset 3
            }else if(b[2][1] == 2 || b[2][2] == 2){
                b[0][0] = 1;
                return b; //moveset 4
            }else if(b[1][1] == 2){
                b[0][2] = 1;
                return b; //moveset 5
            }
        }else if(t == 1){
            if((b[0][0] == 2 || b[1][0] == 2) && b[2][2] == 1){ //moveset 1
                if(b[2][1] == 2){
                    b[0][2] = 1;
                    return b; //moveset 1 cont
                }else{
                    b[2][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(b[1][2] == 2 && b[2][2] == 1){ //moveset 2
                if(b[2][1] == 2){
                    b[0][0] = 1;
                    return b; //moveset 2 cont
                }else{
                    b[2][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if((b[0][1] == 2 || b[0][2] == 2) && b[0][0] == 1){ //moveset 3
                if(b[1][0] == 2){
                    b[2][2] = 1;
                    return b; //moveset 3 cont
                }else{
                    b[1][0] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if((b[2][1] == 2 || b[2][2] == 2) && b[0][0] == 1){ //moveset 4
                if(b[1][0] == 2){
                    b[0][2] = 1;
                    return b; //moveset 4 cont
                }else{
                    b[1][0] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(b[1][1] == 2 && b[0][2] == 1){ //moveset 5 (gets gross)
                if(b[0][0] == 2){
                    b[2][2] = 1;
                    return b; //5-00, will win
                }else if(b[0][1] == 2){
                    b[2][1] = 1;
                    return b; //5-01, will draw
                }else if(b[1][0] == 2){
                    b[1][2] = 1;
                    return b; //5-10, will draw
                }else if(b[1][2] == 2){
                    b[1][0] = 1;
                    return b; //5-12, will draw
                }else if(b[2][1] == 2){
                    b[0][1] = 1;
                    return b; //5-21, will draw
                }else if(b[2][2] == 2){
                    b[0][0] = 1;
                    return b; //5-22, will win
                }
            }
        }else if(t == 2){
            //moveset 1 cont
            if(((b[0][0] == 2 || b[1][0] == 2) && b[2][2] == 1) && b[0][2] == 1){
                if(b[1][2] == 2){
                    b[1][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }else{
                    b[1][2] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if((b[1][2] == 2 && b[2][2] == 1) && b[0][0] == 1){ //moveset 2 cont
                if(b[1][1] == 2){
                    b[1][0] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }else{
                    b[1][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[0][1] == 2 || b[0][2] == 2) && b[0][0] == 1) && b[2][2] == 1){ //moveset 3 cont
                if(b[2][1] == 2){
                    b[1][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }else{
                    b[2][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[2][1] == 2 || b[2][2] == 2) && b[0][0] == 1) && b[0][2] == 1){ //moveset 4 cont
                if(b[0][1] == 2){
                    b[1][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }else{
                    b[0][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[1][1] == 2 && b[0][2] == 1) && b[0][0] == 2) && b[2][2] == 1){ //5-00 cont
                if(b[2][1] == 2){
                    b[1][2] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }else{
                    b[2][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[1][1] == 2 && b[0][2] == 1) && b[0][1] == 2) && b[2][1] == 1){ //5-01 cont
                if(b[2][2] == 2){
                    b[0][0] = 1;
                    return b; // 5-01 cont2
                }else{
                    b[2][2] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[1][1] == 2 && b[0][2] == 1) && b[1][0] == 2) && b[1][2] == 1){ //5-10 cont
                if(b[2][2] == 2){
                    b[0][0] = 1;
                    return b; // 5-10 cont2
                }else{
                    b[2][2] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[1][1] == 2 && b[0][2] == 1) && b[1][2] == 2) && b[1][0] == 1){ //5-12 cont
                if(b[0][0] == 2){
                    b[2][2] = 1;
                    return b; // 5-12 cont2
                }else{
                    b[0][0] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[1][1] == 2 && b[0][2] == 1) && b[2][1] == 2) && b[0][1] == 1){ //5-21 cont
                if(b[0][0] == 2){
                    b[2][2] = 1;
                    return b; // 5-21 cont2
                }else{
                    b[0][0] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }else if(((b[1][1] == 2 && b[0][2] == 1) && b[2][2] == 2) && b[0][0] == 1){ //5-22 cont
                if(b[0][1] == 2){
                    b[1][0] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }else{
                    b[0][1] = 1;
                    for(int i = 0; i<3; i++){ //ends game
                        for(int j = 0; j<3; j++){
                            if(b[i][j]==0){
                                b[i][j] = -1;
                            }
                        }
                    }
                    return b;
                }
            }
        }else if(t == 3){ //only moveset 5 from here on
            if((((b[1][1] == 2 && b[0][2] == 1) && b[0][1] == 2) && b[2][1] == 1) && b[0][0] == 1){ //5-01 cont2
                if(b[1][0] == 2){
                    b[1][2] = 1;
                    return b; //draw
                }else{
                    b[1][0] = 1;
                    return b; //win
                }
            }else if((((b[1][1] == 2 && b[0][2] == 1) && b[1][0] == 2) && b[1][2] == 1) && b[0][0] == 1){ //5-10 cont2
                if(b[0][1] == 2){
                    b[2][1] = 1;
                    return b; //draw
                }else{
                    b[0][1] = 1;
                    return b; //win
                }
            }else if((((b[1][1] == 2 && b[0][2] == 1) && b[1][2] == 2) && b[0][0] == 1) && b[2][2] == 1){ //5-12 cont2
                if(b[2][1] == 2){
                    b[0][1] = 1;
                    return b; //draw
                }else{
                    b[2][1] = 1;
                    return b; //win
                }
            }else if((((b[1][1] == 2 && b[0][2] == 1) && b[2][1] == 2) && b[0][1] == 1) && b[2][2] == 1){ //5-21 cont2
                if(b[1][2] == 2){
                    b[1][0] = 1;
                    return b; //draw
                }else{
                    b[1][2] = 1;
                    return b; //win
                }
            }
        }
        return b;
    }
}
