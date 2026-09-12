# Number_Guessing_Game

Number Guessing Game (Java)

A simple console-based number guessing game built in Java. The program randomly generates a number between 1 and 100, and the player has a limited number of attempts to guess it correctly. After each guess, the game gives feedback to help narrow down the answer.

✨ Features
🎲 Random number generation within a set range (1–100)
🔢 Limited attempts (7 per round) with real-time "Too high!" / "Too low!" feedback
✅ Input validation for non-numeric entries
🔁 Replay option after each round
💻 No external dependencies — pure Java
📋 Requirements
Java Development Kit (JDK) 8 or higher
1.Compile the program:

   javac NumberGuessingGame.java
2.Run the program:

   java NumberGuessingGame
 Example Gameplay
=======================================
 Welcome to the Number Guessing Game!
=======================================

I'm thinking of a number between 1 and 100.
You have 7 attempts to guess it. Good luck!

Attempt 1/7 - Enter your guess: 50
Too high!
Attempt 2/7 - Enter your guess: 25
Too low!
Attempt 3/7 - Enter your guess: 37
Correct! You guessed the number in 3 attempt(s).

Would you like to play again? (yes/no):
🛠️ Possible Improvements
Add difficulty levels (adjustable range and attempt count)
Track and display best score / fewest attempts
Add a GUI version using JavaFX or Swing
