import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class IteratePuzzle{ 
  public static void main(String[] args) {
     HashSet<String> inputs = new HashSet<String>();
     HashSet<String> clues = new HashSet<String>();
     
     
     Scanner sfile = new Scanner(new File("puzzle.txt"));
 
     /**
      Scans the file for the words and clues. Seperates and adds them into two different HashSets.
      Input is read as string, but also converted to char in order to later use the 'charAt' method.
      'charAt' is used to read the first character of the line in order to differentiate between objects and clues.
     **/
     while(sfile.hasNext())
     {
        String text = sfile.next();
        char[] t = text.toCharArray();
        if (t.charAt(0) != ";"){
            inputs.add(text);
        }
        else
            clues.add(text);
     }     

     /**
        TODO - iterating through clues - probably a seperate method
     **/
    
      System.out.println("Solution: ");
        
     }
  }
}
