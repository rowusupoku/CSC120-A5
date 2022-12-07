/*
 * Shirt class
 * Assignment 5: Bringing it All Together
 * R. Jordan Crouser + CSC120 (Fall '22))
 * Renee Owusu-Poku
 * This class creates the shirt object
 * 10/21/2022
 */

public class Shirt {

    /*
     * Prints ASCII art depicting a ASCII Art Shirt to the console
     * @param x n/a
     * @return n/a
     */

    public void display() {
  
      System.out.println("              ._      _.");
      System.out.println("             /  `''''`  \\ ");
      System.out.println("        .--''---..____..---''--.");
      System.out.println("      /'\\                    //`\\ ");
      System.out.println("     /`  |                  |   `\\ ");
      System.out.println("    /`   |   Women love me  |    `\\ ");
      System.out.println("   /     |                  |      \\ ");
      System.out.println("  /      /   Crows fear me  \\       \\ ");
      System.out.println(" /       |                  |        \\ ");
      System.out.println(" '-._____.|                  |._____.-'");
      System.out.println("          |      /^v^\\       |");
      System.out.println("          \\                  |");
      System.out.println("          /                  |");
      System.out.println("          |                  \\ ");
      System.out.println("          |                  |");
      System.out.println("          '._              _.'");
      System.out.println("             `'----------'`");
      System.out.println("            |             | ");

    }
  
    /* main method (for testing) */
    public static void main(String[] args) {
      Shirt myShirt = new Shirt();
      myShirt.display();
    }
  }
  
