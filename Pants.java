/*
 * Pants class
 * Assignment 5: Bringing it All Together
 * R. Jordan Crouser + CSC120 (Fall '22))
 * Renee Owusu-Poku
 * This class creates the pants object
 * 10/21/2022
 */

public class Pants {

    /*
     * Prints ASCII art depicting a ASCII Art Pants to the console
     * @param x n/a
     * @return n/a
     */

    public void display() {
      System.out.println("            |-------------|");
      System.out.println("            [_I_I[L]=_I_I_]");
      System.out.println("            /     | :     \\");
      System.out.println("            |   //|  \\    |");
      System.out.println("            |   | '-  |   |");
      System.out.println("            \\   | /^\\ |   /");
      System.out.println("             |  | | | |  |");
      System.out.println("             |  | | | |  |");
      System.out.println("             |  | | | |  |");
      System.out.println("             \\  | | | |  /");
      System.out.println("             / -|-| |-|- \\");
      System.out.println("             |  | | | |  |");
      System.out.println("             |  | | | |  |");
      System.out.println("             |  | | | |  |");
      System.out.println("             |__|_| |_|__|");
      System.out.println("             [____] [____]"); 
    }
  
    /* main method (for testing) */
    public static void main(String[] args) {
      Pants myPants = new Pants();
      myPants.display();
    }
  }
  
