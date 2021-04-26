import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner; 
import java.io.*;



public class Sudoku {

   private int[][] map; 
   private ArrayList<String> lexicon = new ArrayList<String>();
   
   public Sudoku(String fileName) {
       try {
            File file = new File(fileName); 
  
            BufferedReader br = new BufferedReader(new FileReader(file)); 
         
  
            int count = 0; 
            String st;
            String temp="";
  
            //reads in the text file per line as a string.
             while ((st = br.readLine()) != null) {
               lexicon.add(st);
    
              }
           
           }
           
        catch (java.io.IOException e) {
            System.err.println("Error reading from InputStream.");
            System.exit(1);
        }
                
        
                      
   }
   
   public ArrayList<String> getLex() {
            for (int i = 0; i < lexicon.size(); i++) {
               if (lexicon.get(i).charAt(0) == 'G') {
                  lexicon.remove(i);
               }
            }
            return lexicon; 
        }
   public int[][] getPuzzle() {
         int[][] puzzle = new int[9][9];
         for (int i = 0; i < 9; i++) {
            String temp = lexicon.get(i);
            int[] line = translateLine(temp);            
            puzzle[i] = line;

         }

         return puzzle;
   }
   
   
   
   public int[] translateLine(String temp) {
      if (temp.length() < 9) {
         return null;
      }
      int one, two, three, four, five, six, seven, eight, nine;
            one = Integer.parseInt(temp.substring(0,1));
            two = Integer.parseInt(temp.substring(1,2));
            three = Integer.parseInt(temp.substring(2,3));
            four = Integer.parseInt(temp.substring(3,4));
            five = Integer.parseInt(temp.substring(4,5));
            six = Integer.parseInt(temp.substring(5,6));
            seven = Integer.parseInt(temp.substring(6,7));
            eight = Integer.parseInt(temp.substring(7,8));
            nine = Integer.parseInt(temp.substring(8,9));
       int[] out = {one, two, three, four, five, six, seven, eight, nine};
       return out; 

   }
   
   public void removePuzzle() {
      for (int i = 0; i < 9; i++) {
         lexicon.remove(0);
      }
      
   }
   
    public boolean checkLine(int[][] puzzle, int lineNum) {
       int test = 0; 
       for (int i = 0; i < puzzle[lineNum].length; i++) {
         test = puzzle[lineNum][i];
         for (int j = 0; j < puzzle[lineNum].length; j++)
            if (puzzle[lineNum][j] == test && j != i && test != 0) {
               return true; 
            }
       }  
       return false; 
    }
    
    public boolean checkCol(int[][] puzzle, int colNum) {
       int test = 0; 
       for (int i = 0; i < puzzle.length; i++) {
         test = puzzle[i][colNum];
         for (int j = 0; j < puzzle.length; j++)
            if (puzzle[j][colNum] == test && j != i && test != 0) {
               return true; 
            }
       }  
       return false; 
    }
      
      
   












}