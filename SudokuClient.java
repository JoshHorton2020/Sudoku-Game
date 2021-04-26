import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class SudokuClient {

   public static void main(String[] args) throws Exception {
      Sudoku test = new Sudoku("p096_sudoku.txt");
      
      System.out.println(test.getLex());
   
      int[][] puzzle = test.getPuzzle();
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            System.out.print(puzzle[i][j] + " ");
         }
         System.out.println();
      }
      test.removePuzzle();
      System.out.println(test.getLex());
      
      
      int[][] testPuz = {{1,7,3,4,5,6,7,8,9}, 
                         {1,9,2,4,3,3,6,7,0}};
      System.out.println(test.checkLine(testPuz, 1));
   
   
   
   }


}