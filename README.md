# tictactoe
This is an old tic tac toe school project dusted off for Java React practice.

INITIAL COMMIT 1/16/24
The old version is from my intro to computer science class that I took in Fall
2018. The final project was to create whatever we liked, so I made a tic tac
toe algorithm to play perfectly with the first turn. This will always result in
a CPU win (with imperfect player behavior) or a tie (with perfect player 
behavior). It also prompts the player for trash talk, which just gets thrown 
back when the player loses.

This is a nifty piece of code, it functions as intended, and it got me the "A".
However, it also reeks of baby's first project and I'm going to fix that with 
two goals in mind: (1) The game logic is a sickening cascade of if statements 
and I will change that. Really any improvement to style and simplicity will 
make me happy. (2) I really abused System.out.println, this was before any of 
my experience with ui. I will give this project a proper display, using this 
as an opportunity to learn React. (Hi PWW!)

ANOTHER INITIAL COMMIT 1/17/24
Stumbled on https://react.dev/learn/tutorial-tic-tac-toe. How convenient!
Committing after getting my local WSL environment set up for nodejs. That was
more of a headache than I expected but I'm an incredibly hireable scientist so
I of course figured it out. Most interesting/notable problem was learning that
nodejs versions >16 have a breaking fix to some security problem, and the most
accepted workaround to this (downgrading to v16 or using legacy ssl provider)
unsafely undos the fix. Thank god I used my big brain to scroll to the second-
most accepted workaround.
