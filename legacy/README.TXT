HOW TO USE:
Make sure all of the .java files are together, and run the main in the tictactoe class. That's it!

EXPLANATION:
The program is a tic tac toe game against an algorithm that assures the user cannot win.
The program consists of a main the collects information from the user, runs, and prints the game.
Inside a while loop checking to see if the game is not over, the main calls the player's play method, the computer's play method, and its own print method unit the game is over. The player's play method takes in the board's two-dimensional array, gets user input, and returns a modified array. The computer also modifies the array, but as decided by a series of if statements that chose a move based on the board state. The printBoard method goes line by line printing the board in ASCII art style. The x vs o vs empty tile is decided by the array's value at each index.

SAMPLE INPUT:
When asked for trash talk, input strings of whatever you can think up. Doesn't matter what.
When given the prompt to enter the row number enter a number from 0 to 2.
Same for column number (and make sure they're separate inputs).
The output is a display of a tic tac toe board, where X is the computer, and O is the user.
