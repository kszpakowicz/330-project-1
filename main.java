import java.util.HashSet;
import java.io.BufferedReader;
import java.io.FileReader;

private static HashSet<String> IterateClues(BufferedReader reader, HashSet<String> items, HashSet<String> clues) {

        /**
            TODO
        **/

        BufferedReader reader = reader;
        HashSet<String> items = items
        HashSet<String> clues = clues
        HashSet<String> solution = new HashSet<String>();

        Iterator iterator = clues.iterator();
        for (String word : clues){
            solution.addAll(word);
        }
}


class SolvePuzzle{ 
  public static void main(String[] args) {
     HashSet<String> items = new HashSet<String>();
     HashSet<String> clues = new HashSet<String>();

     BufferedReader reader;

     int count = 0;
     int i = 0;
     
     try {
        reader = new BufferedReader(new FileReader("puzzle.txt");
        String line = reader.readLine();
        
        /**
            The first while loop checks for amount of matching sets by checking for a seperator between words. 
            (Our template file uses a semi-colon ';' as a seperator)
            This is used for:
            1. To know how many categories to seperate for in the next loop (see below). NOTE - Currently not needed anymore for this reason.
            2. Can be used for any sized puzzle with infinite (n+1) categories.

            FIRST WHILE LOOP IS CURRENTLY COMMENTED OUT. MAY NOT BE NEEDED FOR FINAL SOLUTION
        **/

        /**
        while (line != null){
            char[] c = line.toCharArray();
            if (c.charAt(i).equals(";")){
                count++;
            }
            i++;
        }
        **/

         /**
            Reads the file for the words and clues. Seperates and adds them into two different HashSets.
            Input is read as string, but also converted to char in order to later use the 'charAt' method.
            'charAt' is used to read the first character of the line in order to differentiate between objects and clues.
         **/

        while (line != null){
            char[] c = line.toCharArray();
            if (c.charAt(0) != ":"){;  
                items.add(Arrays.asList(line.split(";", 0));
            }
            else
                clues.add(line);
            line = reader.readLine();
        }
        reader.close();
     }

      
      System.out.println("Solution: ");
      System.out.println(this.IterateClues(reader, items, clues));
        
     }
  }
}
