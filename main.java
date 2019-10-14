import java.util.HashSet;
import java.io.BufferedReader;
import java.io.FileReader;


class PuzzleSolver{ 

  public static void main(String[] args) {
        /**Main method - Prints solution for puzzle**/

      System.out.println("Solving Puzzle...");
      System.out.println("Solution:" + "\n" + this.SolvePuzzle());

  }

   private static void PrintLog(String match1, String match2){
      /**Prints a log message everytime a match is found for the puzzle**/
      System.out.println("Added matching pairs: " + match1 + " and " + match2);
   }

   private static HashSet<String> SolvePuzzle() {

     HashSet<String> items = new HashSet<String>(50);
     HashSet<String> solution = new HashSet<String>(50);

     BufferedReader reader;

     int count = 0;
     int i = 0;
     
     try {
        reader = new BufferedReader(new FileReader("Puzzle1.puzzle");
        String line = reader.readLine();

         /**
            Reads the file for the words and clues. Seperates and adds them into two different HashSets.
            Input is read as string, but also converted to char in order to later use the 'charAt' method.
            'charAt' is used to read the first character of the line in order to differentiate between objects and clues.
         **/

        while (line != null){
            char[] c = line.toCharArray();
            if (c.charAt(0) != ":"){
                items.add(Arrays.asList(line.split(";", 0));
            }

            /**
                Reads clues and processes them for solving the puzzle. 
            **/
            else
                if (line.contains(!"!")){
                    solution.add(Arrays.asList(line.split(":" | ">", 0));
                    this.PrintLog(Arrays.asList(line.split(":" | ">", 0));
                }
                else if (line.contains(">")){
                    solution.add(Arrays.asList(line.split(":" | ">" | "!", 0));
                    this.PrintLog(Arrays.asList(line.split(":" | ">" | "!", 0));
                }
                System.out.println("Hint Processed");
            line = reader.readLine();
        }
        reader.close();
     }

     return solution;
        
}
