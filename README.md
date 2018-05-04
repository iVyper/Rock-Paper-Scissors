# Rock-Paper-Scissors Game in Java

This project is a simple, console-based Rock-Paper-Scissors game written in Java. It is designed as a beginner-level project for a college freshman course. The game allows a user to play against the computer by choosing between Rock, Paper, and Scissors.

## Features

- **User vs Computer Gameplay:** The user competes against the computer.
- **Randomized Computer Choice:** The computer's move is randomly generated.
- **Input Validation:** Ensures the user enters a valid move.
- **Replay Option:** Allows the user to play multiple rounds until they choose to exit.

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Compile and Run

1. **Clone the Repository or Download the Project Files:**

   ```bash
   git clone https://github.com/yourusername/rock-paper-scissors-java.git
   cd rock-paper-scissors-java

2. **Compile the Java Program:**

    ```bash
    javac RockPaperScissors.java


3. **Run the Program:**
    ```bash
    java RockPaperScissors

## Code Overview

- **getMoveName(int move):** Converts a numeric choice (0, 1, 2) to its corresponding move name ("Rock", "Paper", "Scissors").
- **determineWinner(int userChoice, int computerChoice):** Determines the winner based on the classic rules of Rock-Paper-Scissors.
- **main(String[] args):** Contains the game loop which prompts the user for input, generates the computer's choice, displays the results, and asks if the user wants to play again.

## License

This project is open-source and available under the MIT License.