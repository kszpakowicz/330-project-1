import java.util.HashSet;
import java.io.BufferedReader;
import java.io.FileReader;

class SolvePuzzle{ 
  public static void main(String[] args) {
     HashSet<String> inputs = new HashSet<String>();
     HashSet<String> clues = new HashSet<String>();
     
     Set<String> items = new HashSet<String>(Arrays.asList(comment.split(", ")));
     BufferedReader reader;

     int count = 0;
     int i = 0;
 
     /**
      Reads the file for the words and clues. Seperates and adds them into two different HashSets.
      Input is read as string, but also converted to char in order to later use the 'charAt' method.
      'charAt' is used to read the first character of the line in order to differentiate between objects and clues.
     **/
     
     try {
        reader = new BufferedReader(new FileReader("puzzle.txt");
        String line = reader.readLine();
        
        /**
            The first while loop checks for amount of matching sets by checking for a seperator between words. 
            (Our template file uses a semi-colon ';' as a seperator)
            This is used for:
            1. To know how many categories to seperate for in the next loop (see below).
            2. Can be used for any sized puzzle with infinite (n+1) categories.
        **/

        while (line != null){
            char[] c = line.toCharArray();
            if (c.charAt(i).equals(";")){
                count++;
            }
            i++;
        }

        /**

        **/

        while (line != null){
            char[] c = line.toCharArray();
            if (c.charAt(0) != ":"){
                inputs.add(line);
            }
            else
                clues.add(line);
            line = reader.readLine();
        }
        reader.close();
     }

     /**
        TODO - iterating through clues - probably a seperate method
     **/
    
      System.out.println("Solution: ");
        
     }
  }
}
