#  Hand Cricket Game

Welcome to the Hand Cricket Game! This simple yet entertaining game is designed to be played in Eclipse using JavaFX.

## Setup Instructions

Follow these steps to set up and run the game in Eclipse:

1. Install the e(fx)clipse plugin from the Eclipse Marketplace by going to `Help > Eclipse Marketplace`.

2. Create a new JavaFX project by going to `File > New > JavaFX Project`.

3. Download and install JavaFX on your computer if you haven't already.

4. Configure the Java Build Path for JavaFX:
   - Go to `Window > Preferences > Java > Java Build Path > User Library`.
   - Click on "New" and name it (e.g., JavaFX).
   - Locate the JavaFX library on your computer and copy its path.
   - Click on "JavaFX" in the User Library list.
   - Click "Add External JARs" and paste the copied path to the JavaFX library.
   - Click "Apply" and then "Close."

5. Add the JavaFX library to your project:
   - Right-click on your project folder in the Eclipse Project Explorer.
   - Choose "Build Path > Configure Build Path."
   - Under the "Libraries" tab, click "Add Library."
   - Select "User Library" and add the library you just created (JavaFX).
   - Click "Apply" and then "Close."

6. Run the game by clicking on the "Run" icon in Eclipse.
   - In "Run Configurations," select "Java Application," choose your `main.java` file.
   - Under "Arguments," add the following in VM arguments: `--module-path "path to the lib folder of JavaFX" --add-modules javafx.controls,javafx.fxml`.
   - Click "OK."

7. Your game will now run, and you'll see the game outputs in your Eclipse console.

## How to Play

**Objective**: Score more runs than the computer.

1. This hand cricket game requires two players: you and the computer.
2. Both players use finger gestures (1 to 6) and consider them as one to six points.
3. Allowed hand gestures and their corresponding scores are as follows:
   - One: Score = 1
   - Two: Score = 2
   - Three: Score = 3
   - Four: Score = 4
   - Five: Score = 5
   - Six: Score = 6

4. You have the choice to either bat or bowl first. If you choose batting, the computer will bowl; if you choose bowling, you will bowl first.

5. The game proceeds as follows:
   - If you choose batting, you and the computer take turns until you both have the same hand gesture. At that point, you are out, and the computer starts batting.
   - If you choose bowling, the computer and you take turns until you both have the same hand gesture. At that point, the computer is out, and you start batting.

6. The game continues until the computer's score exceeds yours or you both have the same hand gesture.

7. If the computer's score is greater than yours, the computer wins. If your score is greater, you win.

## Software Development Process

For developing this game, an Agile software development process was used. Agile was chosen because it breaks down the work into smaller tasks, helping meet deadlines.

Here's the development process:
1. Plan and implement the game's requirements.
2. Design the game using JavaFX.
3. Develop the game.
4. Test the game for accuracy and correctness.
5. Used the Kanban method to visualize the game's progress and track work.

Testing was a challenge, especially for checking the accuracy of game logic. The game required testing for various scenarios, including the playball method and computer play method.

Enjoy playing Eclipse JavaFX Hand Cricket Game!
