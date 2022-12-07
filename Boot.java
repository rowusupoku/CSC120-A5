/*
 * Boot class 
 * Assignment 5: Bringing it All Together
 * R. Jordan Crouser + CSC120 (Fall '22))
 * Renee Owusu-Poku
 * This class creates the boot object
 * 10/21/2022
 */

public class Boot {

  private String direction;

  /* Constructor */
  public Boot(String direction) {
    this.direction = direction.toLowerCase();
  }

    /*
    * Prints ASCII art depicting a ASCII Art Boot to the console
    * @param x n/a
    * @return n/a
    */

  public void display() {
    if (this.direction.equals("left")) {
      System.out.println("         ,|_|,   ");
      System.out.println("         |===|   ");
      System.out.println("         |   |   ");
      System.out.println("         /  &|  ");
      System.out.println("     .-'`  , )* ");
      System.out.println("     `-------`   ");

    } else if (this.direction.equals("right")) {
      System.out.println("                 ,|_|,");
      System.out.println("                 |===|");
      System.out.println("                 |   |");
      System.out.println("                 |&  \\");
      System.out.println("                *( ,  `'-.");
      System.out.println("                 `-------`");

    } else if (this.direction.equals("both")) {
      System.out.println("             ,|_|,   ,|_|,");
      System.out.println("             |===|   |===|");
      System.out.println("             |   |   |   |");
      System.out.println("             /  &|   |&  \\");
      System.out.println("         .-'`  , )* *( ,  `'-.");
      System.out.println("         `-------`   `-------`");

    } else {
      System.out.println("Which boot?");
    }
  }

  /* main method (for testing) */
  public static void main(String[] args) {
    Boot myLeftBoot = new Boot("left");
    Boot myRightBoot = new Boot("right");
    myLeftBoot.display();
    myRightBoot.display();
  }
}
