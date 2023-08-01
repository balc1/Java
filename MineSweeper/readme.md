Minesweeper Game

patika.dev Java 101 Final Project @balc1

Game Rules:
    -The game is text-based.
    -It should be played on a two-dimensional array and designed within the MineSweeper class.
    -The matrix size, i.e., the number of rows and columns, should be determined by the user.
    -The number of mines to be placed in the array should be one-fourth of the total number of elements (elementCount / 4). For example, if the array is 4x3, the total number of elements should be calculated using the formula (rowCount * columnCount), which results in 12 elements. In this case, there should be 12 / 4 = 3 mines. (Hint: You can create a second array to store the locations of the mines.)
    -The user should select a point on the matrix by entering row and column values.
    -The selected point should be checked if it is within the boundaries of the array, and if not, the user should be prompted to enter a valid point.
    -If the selected point contains a mine, the game should be lost.
    -If there is no mine at the selected point, the program should examine all adjacent positions (right, left, up, down, upper-left diagonal, upper-right diagonal, lower-right diagonal, lower-left diagonal) and write the total number of mines surrounding that point. If there are no mines around the point, it should be marked with "0".
    -If the user manages to select all points without hitting a mine, the game should be won.

#Losing Scenario
``````
Mine Locations
* - - 
- - * 
- - - 
===========================
Welcome to the Minesweeper Game!
- - - 
- - - 
- - - 
Enter Row: 0
Enter Column: 1
===========================
- 2 - 
- - - 
- - - 
Enter Row: 2
Enter Column: 0
===========================
- 2 - 
- - - 
0 - - 
Enter Row: 0
Enter Column: 2
===========================
- 2 1 
- - - 
0 - - 
Enter Row: 0
Enter Column: 0
Game Over!!
===========================

# Winning Scenario

``````
Mine Locations
- - -
- * -
- * -
===========================
Welcome to the Minesweeper Game!
- - -
- - -
- - -
Enter Row: 0
Enter Column: 0
===========================
1 - -
- - -
- - -
Enter Row: 0
Enter Column: 1
===========================
1 1 -
- - -
- - -
Enter Row: 0
Enter Column: 2
===========================
1 1 1
- - -
- - -
Enter Row: 1
Enter Column: 0
===========================
1 1 1
2 - -
- - -
Enter Row: 2
Enter Column: 0
===========================
1 1 1
2 - -
2 - -
Enter Row: 1
Enter Column: 2
===========================
1 1 1
2 - 2
2 - -
Enter Row: 2
Enter Column: 2
Congratulations! You Won!
1 1 1
2 - 2
2 - 2
===========================
``````
